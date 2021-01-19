db.people.mapReduce(
    function(){
        emit(null,this.job)
    },

    function(key, values){
        return values.filter((v,i,a) => a.indexOf(v) === i)
    },
    {
    out: "unique_jobs"
    }
    


)

printjson(db.unique_jobs.find().toArray())