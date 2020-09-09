

const express = require('express')

var url = require('url');

const app = express()

app.get('/home/:Anik', function (req, res) {
  res.send('This is the Home route')
  var calValue= req.url.toString();
  console.log(calValue);
  console.log(calValue.length);
})


app.get('/contact', function (req, res) {
  res.send('This is the Contact route')
})


app.get('/about-us', function (req, res) {
  res.send('This is the about-us route')
})


app.get('/page', function (req, res) {
  res.send('This is the page route')
})



app.listen(3000)
