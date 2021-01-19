db.people.mapReduce(
    function(){
        emit(this.sex, {weight: this.weight, height: this.height, people_count: 1});
    },

    function(key, values){
        reduce = {total_weight: 0, total_height: 0, people_count: 0};

        values.forEach(function(value){
            reduce.total_weight += value.weight
            reduce.total_height += value.height
            reduce.people_count += 1
        })
        return reduce;
    },
    {
    out: "avg_reduce",
    finalize: function(key, reduceVal){
        return {
            avg_weight: reduceVal.total_weight/reduceVal.people_count,
            avg_height: reduceVal.total_height/reduceVal.people_count
        }
    }
    }
    


)

printjson(db.avg_reduce.find().toArray())