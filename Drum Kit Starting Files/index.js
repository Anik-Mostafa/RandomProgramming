// var numDrum= document.querySelectorAll(".drum").length;



function srk(){
  var rand = Math.floor(Math.random() * 5)+1;
  switch (rand){
    case 1:
    var audio = new Audio("SRK/srk1.mp3");
    audio.play();
    break;

    case 2:
    var audio = new Audio("SRK/srk2.mp3");
    audio.play();
    break;

    case 3:
    var audio = new Audio("SRK/srk3.mp3");
    audio.play();
    break;

    case 4:
    var audio = new Audio("SRK/srk4.mp3");
    audio.play();
    break;

    case 5:
    var audio = new Audio("SRK/srk5.mp3");
    audio.play();
    break;
  }

}

// for(var i=0;i<numDrum;i++){
//   document.querySelectorAll(".drum")[i].addEventListener("click", srk);
// }
  document.querySelectorAll(".drum")[0].addEventListener("click", srk);
  document.addEventListener("keypress", function(event){
    if(event.key=='w'){
      srk();
    }
  });
  function aj(){
    var rand = Math.floor(Math.random()*4)+1;

    switch (rand) {
      case 1:
      var audio = new Audio("AJ/aj1.mp3");
      audio.play();
      break;

      case 2:
      var audio = new Audio("AJ/aj2.mp3");
      audio.play();
      break;

      case 3:
      var audio = new Audio("AJ/aj3.mp3");
      audio.play();
      break;

      case 4:
      var audio = new Audio("AJ/aj4.mp3");
      audio.play();
      break;


    }
  }
  document.querySelectorAll(".drum")[1].addEventListener("click", aj);
  document.addEventListener("keypress", function(event){
    if(event.key=='a'){
      aj();
    }
  })
