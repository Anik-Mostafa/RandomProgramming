function inx(input){
  var z=1;
  x=input%10;
  for(var i=0;i<100;i++){


        input=Math.floor(input/10);
        y=input%10;
        if(input==0)break;
        z=(z*x*10)+y;
        x = 1;
}
console.log(z);

}
inx(123456);
