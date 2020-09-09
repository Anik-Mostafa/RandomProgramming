const express = require ("express")
const app = express()
const fs = require('fs');

app.use(express.urlencoded())

app.get('/',function(req,res){

  res.sendFile(__dirname+'/index2.html');
  console.log(__dirname);
})

app.post('/save',function(req,res){

  var n1=req.body.stk;
  console.log(n1=req.body.stk);
  var n2=req.body.price;
  console.log(n2=req.body.price);
  var n3=req.body.quantity;
  console.log(n3=req.body.quantity);


  var m=n2*n3;

  console.log(m);
})


app.listen(3000);
