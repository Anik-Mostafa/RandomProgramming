function input(a){
  var x,c=0;
  for(var i=0;i<10;i++){
    x=a%10;
    if(x==0)break;
    c++;
    a=Math.floor(a/10);
  }
  console.log(c);
}
input(123);
