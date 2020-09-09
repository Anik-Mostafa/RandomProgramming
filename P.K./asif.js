function input(a){
var x,z=0;
var kazz=a;
for(var i=0;i<10;i++){
  x=a%10;
  if(x==0)break;
  z=z+(x*x*x);

  a=Math.floor(a/10);

}


if(z==kazz){
  console.log("Asif/Armstrong");
}
else{
  console.log("Sagol/Asif/Armstrong na");
}

}

input(153);
