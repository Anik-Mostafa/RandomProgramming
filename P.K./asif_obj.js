var info = {
  name :"Anik",
  age: 21,
  school: ["kzs", "MasterMind", "Sona Moni"],
  kir: function(){
    console.log("Anik");
  },
}
//info.school.push("Advantict");
info.school.shift();
console.log(info);
info.school.unshift();
console.log(info);
