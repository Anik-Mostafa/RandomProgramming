//0 1 2 3 4 5 6 7
//f o o t b a l l

function input(q){
var a=[];

for(var i=0;i<q.length; i++){
  if(q[i]==" "){
     q[i+1]=q[i+1].charAt(i+1).toUpperCase();

  }

}


console.log(q);

}
input("Asif anik ovi");
