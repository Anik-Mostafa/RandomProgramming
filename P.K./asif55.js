function input(str){
  var x=0,y=0;

  for(i=0;i<str.length;i++){
    if(str[i]=='p'){x++;}
    else if(str[i]=='t'){y++;}
  }
  if(x==y){
    console.log("True");
  }
  else{
    console.log("False");
  }
}
input("Anppikt");
