printjson(db.people.insert(
    {"sex" : "Male",
"first_name" : "Grzegorz",
"last_name" : "Rostek",
"job" : "PJATK Student",
"email" : "s15227@pjwstk.edu.pl",
"location" : {
    "city" : "Warszawa",
    "address" : {
        "streetname" : "Uliczna",
        "streetnumber" : "42069"
    }
},
"description" : "lubie mongodb",
"height" : "173",
"weight" : "68.37",
"birth_date" : "1997-03-03T21:10:58Z",
"nationality" : "Poland",
"credit" : [
    {
        "type" : "jcb",
        "number" : "123456789101",
        "currency" : "PLN",
        "balance" : "446300.86"
    }
]}))