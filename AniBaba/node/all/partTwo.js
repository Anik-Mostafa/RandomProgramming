const express = require('express')
const app = express()
const fs = require('fs');


app.use(express.urlencoded());


app.get('/', function (req, res) {
  res.sendFile(__dirname+'/index.html')
})

app.post('/Welcome', function(req, res){
  var x= Math.floor(Math.random() * Math.floor(35));
  var x= parseInt(x);
  console.log(x)
  fs.writeFile('file.txt', x, function (err) {
  if (err) throw err;
  console.log('Saved!');
});


fs.readFile('file.txt', function(err, data) {
  console.log("This is the Data "+ data);
})



  if(req.body.fname=='Anik'){
    res.send("Congratulations "+req.body.fname+" tomar ____ Hobe Na")
  }
  else
    res.send("Congratulations "+req.body.fname+" ajtheke "+x+" bosor por tomar ____")
})

app.listen(3000)
