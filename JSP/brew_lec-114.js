//   for (var i = 0; i <= 100; i++) {
//     if (i%3==0 && i%5==0) {
//       console.log("Fiz and Buz");
//     }
//     else if(i%3==0){
//      console.log("Fiz");
// }
//   else if(i%5==0){
//     console.log("Buz");
//   }
//   else {
//     console.log(i);
//   }
//   }

var listOfEven=[];
var c=0;

for(var i=1;i<=20;i++){
  if(i%2!=0)
  listOfEven.push(i);
}
console.log(listOfEven);

for(var i=1;i<=20;i++){
  if(i%3==0){
    listOfEven.pop(i);
    c++;


  }


}

console.log(listOfEven);



console.log(c);
