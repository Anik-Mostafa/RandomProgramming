function input(x){
  var z=0;

  for(var i=0;i<10;i++){
    x=Math.floor(x/10);
    z++;
    if(x==0){
      break;
    }
  }
  console.log(z+" digit Number")
}
input(352);
