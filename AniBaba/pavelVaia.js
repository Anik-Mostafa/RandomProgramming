// Create a function named listAllMoviesbyTitleAndYear() that returns an array containing the title and year of the movies sorted by year.
// Create a function name findByYear(lowerLimit,upperLimit) returns an array of movies by year in the given range sorted by year .
// Create a function name findByRating(lowerLimit,upperLimit) returns an array of movies by rating in the given range sorted by rating.
// Find all the Movies  before 2000 having  the genre sci-fi, and rating greater than 8,sorted by rating.
// Find the average rating of all the movies with a sci-fi genre.





//************************************* LOOK UP **********************************//
const express = require('express')
const app = express()

app.get('/add', function (req, res) {
  res.send('Hello World hii ')
})
 console.log("local server runing ");

 app.get('/candy',function(req,res){
   var Category='';
   var History='';
   var Arr = [];
   var Cricket='';
   var x='';
      function Cat(x){
       for(var i = 0; i < data.length; i++){
         if (data[i].Category==x){
         Arr.push(data[i]);
       }
     }
     Cat("Cricket");
       console.log(Arr);
       }
         res.render('candies',{
          ar : Arr,
          alldata:data,
          Cricket:Cricket
         });
       })
 app.get('/candy',function(req,res){
   var Category='';
   var History='';
   var Arr = [];
   var Cricket='';
   var x='';
      function Cat(x){
       for(var i = 0; i < data.length; i++){
         if (data[i].Category==x){
         Arr.push(data[i]);
       }
     }
     Cat("Cricket");
       console.log(Arr);
       }
         res.render('candies',{
          ar : Arr,
          alldata:data,
          Cricket:Cricket
         });
       })




app.listen(3000)
