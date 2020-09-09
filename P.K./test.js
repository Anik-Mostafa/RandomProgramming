

// function listAllNumDivisibleThreeorFive( o, p){
//   var x=0;
//   var y=0;
//
//   for(var i=o;i<=p;i++){
//     if(i%3==0){
//       console.log("%d is divisible by 3",i);
//       x++;
//     }
//     if(i%5==0){
//     console.log("%d is divisible by 5",i);
//     y++;
//     }
//     console.log("%d is the number of times",x);
//     console.log("%d is the number of times",y);
//   }
// }
//
// listAllNumDivisibleThreeorFive(10, 50);


var fs = require("fs");
var path = require("path");
// fs.readFile('test.txt', function(err,data){
//   if (data){
//     console.log(data.toString());
//   }
//
// });
// fs.readFile('test2.txt', function(err,data){
//   if (data){
//     console.log(data.toString());
//   }
//
// });
// fs.readFile('test3.txt', function(err,data){
//   if (data){
//     console.log(data.toString());
//   }
//
// });

 var x=fs.readdirSync('.');
for(var i=0;i<x.length;i++){
   console.log(path.extname(x[i]));
  }
