const express = require ("express")
const app = express()
const fs = require('fs');
const si = require('stock-info');

app.use(express.urlencoded())

app.get('/',function(req,res){

  res.sendFile(__dirname+'/index.html');
  console.log(__dirname);
})

app.post('/save',function(req,res){


  var n1 = req.body.stk;
  console.log(req.body.stk);

si.getSingleStockInfo(n1).then(function(stock){

// dot(.) notetion

  console.log(stock.regularMarketPrice);
  console.log(stock.regularMarketTime);

  fs.readFile("test.txt", function(err, data){
    //console.log(data);
    var result1= JSON.parse(data);
    var result2= {name: n1,regularMarketPrice: stock.regularMarketPrice, regularMarketTime: stock.regularMarketTime};


    result1.push(result2);
    //console.log(result1);
    var xx = JSON.stringify(result1);
    fs.writeFile('test.txt',xx,function(err){

    })
  })
res.write("<h1> Name: "+n1+"</h1>")
res.write("<h1> regularMarketPrice : "+stock.regularMarketPrice+ "</h1>");
res.write("<h1> regularMarketTime : "+stock.regularMarketTime+ "</h1>");

res.send();
})


});


app.listen(3000);
