db.people.mapReduce(
    function(){
        this.credit.forEach(function(val){
            emit(val.currency, {balance: val.balance, people_count: 1})
        })
    },

    function(key, values){
        reduce = {total_balance: 0, people_count: 0};

        values.forEach(function(value){
            reduce.total_balance += value.balance
            reduce.people_count += value.people_count
        })
        return reduce;
    },
    {
    out: "total_balance",
    query: 
    {"nationality": "Poland",
    "sex": "Female"},
    finalize: function(key, reduceVal){
        return {
            total_balance: reduceVal.total_balance,
            avg_balance: reduceVal.total_balance/reduceVal.people_count
        }
    }
    }
    


)

printjson(db.total_balance.find().toArray())