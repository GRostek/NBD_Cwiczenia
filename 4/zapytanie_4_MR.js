db.people.mapReduce(
    function(){
        emit(this.nationality,{weight: this.weight, height: this.height, people_counter: 1})
    },

    function(key, values){
        reduce = {total_bmi:0, bmi_min:0, bmi_max:0, people_counter:0}

        reduce.bmi_min = 10000

        values.forEach(function(value){
            bmi = value.weight/Math.pow(value.height/100,2)
            reduce.total_bmi += bmi

            if(bmi > reduce.bmi_max){
                reduce.bmi_max = bmi
            } else if (bmi < reduce.bmi_min){
                reduce.bmi_min = bmi
            }

            reduce.people_counter+=value.people_counter
        })

        return reduce
    },
    {
    out: "bmi",
    finalize: function(key, reduceVal){
        return {
            avg_bmi: reduceVal.total_bmi/reduceVal.people_counter,
            min_bmi: reduceVal.bmi_min,
            max_bmi: reduceVal.bmi_max
        }
    }
    }
    


)

printjson(db.bmi.find().toArray())