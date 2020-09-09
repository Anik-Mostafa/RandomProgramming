const express = require('express')
// const ejs= require('ejs')
const app = express()




app.use(express.urlencoded());
app.set('view engine', 'ejs');
var data=[];
app.get('/', function (req, res) {
  // res.send("Anik")
  // var data=[];
  // var a = req.body;
  res.render('index2',{
    data: data
  })
}).post('/', function (req, res) {

  var a = req.body.cmt;
  data.push(a);
  console.log(data);
  res.render('index2',{
    data: data
  })
})

app.listen(3000)
