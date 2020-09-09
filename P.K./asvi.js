function input(a){
  var x,c=0,z,zzz=0;
  var aa=a;
  for(var i=0;i<10;i++){
    x=a%10;
    z=x*x*x;
    zzz=zzz+z;
    a=Math.floor(a/10);

    if(x==0){
      break;
    }

  }


  if(zzz==aa){
    console.log("Armstrong Number");
  }
  else{
    console.log("Not Armstrong");
  }
}

input(153);
