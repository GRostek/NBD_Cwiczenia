printjson(db.people.aggregate([
    {
        $group:
        {
            "_id": "unique_jobs",
            "unique_jobs":{$addToSet: "$job"}
        }
    }
]))