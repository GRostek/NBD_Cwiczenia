db.people.mapReduce(
    function(){
        this.credit.forEach(function(val){
            emit(val.currency, val.balance)
        })
    },

    function(key, values){
        return Array.sum(values)
    },
    {
    out: "currency_sum"
    }
    


)

printjson(db.currency_sum.find().toArray())