function input(a, b){
  var c=0;
  var aa=a.substring(0, 3);
  console.log(aa);

  for(var i=0;i<a.length;i++){
    var as=a.charAt(i);
    console.log(as.toUpperCase());
    if(a[i]==b){
      c++;
    }
  }
  if(c>=2 && c<=4){
    console.log("True");
  }
}
input("JavaScript", "a");
