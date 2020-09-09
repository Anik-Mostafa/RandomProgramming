function input(x){
 [x[0], x[x.length-1]]=[x[x.length-1], x[0]];
  console.log([x[x.length-1], x[0]]);
  console.log(x);
}
input([1,2,3,4]);
