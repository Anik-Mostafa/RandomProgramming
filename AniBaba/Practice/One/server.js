const express = require ('express')
const app = express()

 app.use(express.urlencoded());

app.get('/',function (req,res){
  res.sendFile(__dirname+'/index.html');
//  console.log(__dirname);
})

app.post('/Welcome',function(req,res){
  var name = req.body.fname;
  console.log(req.body.fname);
  res.send("Wellcome!! "+name+ " This is our world!");
})


app.listen(3000);
