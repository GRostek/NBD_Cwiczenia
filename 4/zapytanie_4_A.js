printjson(db.people.aggregate([
    {
        $addFields:
        {
            "bmi": { "$divide": ["$weight", { "$pow": [{"$divide": ["$height", 100]}, 2]}]}
        }
    },
    {
        $group:
        {
            "_id":"$nationality",
            "minimal": {$min: "$bmi"},
            "maximal": {$max: "$bmi"},
            "average": {$avg: "$bmi"}
        }
    }
]))