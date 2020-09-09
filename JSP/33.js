function large(a,b){
  if((a>39 && a<61) && (b>39 && b<61)){
    if(a>b){
      console.log(a+" is the largest number");

    }
    else{
      console.log(b+" is the Largest number");
    }
  }
  else{
    console.log("The number has to be more then 40 and less then 60");
  }
}

large(45,55);
