
const express = require ('express')
const app = express()
const fs=require('fs');

app.use(express.urlencoded());

app.get('/',function (req,res){
  res.sendFile(__dirname+'/index.html');
 console.log(__dirname);
})

  app.post('/weather',function (req,res) {


  var n1 = req.body.city;
  console.log(req.body.city);


  // var n2 = req.body.country;
  // console.log(req.body.city);
  //



  var weather = require('weather-js');

  // Options:
  // search:     location name or zipcode
  // degreeType: F or C

  weather.find({search: n1, degreeType: 'C'}, function(err, result) {
    console.log(result)
    if(err) console.log(err);
    if(result.length!=0){

      fs.readFile("test.txt", function(err, data){
        console.log(data);
         var result1= JSON.parse(data);
         var result2= [result[0].location.name,
                       result[0].current.temperature,
                       result[0].current.humidity,
                       result[0].current.date
                       ];
         console.log("This is Result2 :- "+ result2);




         result1.push(result2);
         var xx = JSON.stringify(result1);
        console.log("This is XX:- "+xx);
         fs.writeFile('test.txt',xx,function(err){

         })

})

    res.write("<h1> Place: "+result[0].location.name+"</h1>");
    res.write("<h1> Temperature: "+result[0].current.temperature+"c </h1>");
    res.write("<h1> humidity: "+result[0].current.humidity+"</h1>");
    res.write("<h1> Date: "+result[0].current.date+"</h1>");


    }
    else
    {
      var m="Not found";
      fs.writeFile("test.txt",m, function(err){})

    res.write("<h1> not found </h1>");
    }


    // console.log(JSON.stringify(result, null, 1));
    // console.log(result[0].location.name);
    // console.log(result[0].current.temperature);
    // console.log(result[0].location.degreetype);
    // console.log(result[0].current.skycode);
    // console.log(result[0].current.date);
    // console.log(result[0].current.humidity);

    res.send();

    })




//res.send("Thanks for your data: ");

})

app.listen(3000);
