var scores, roundScore, activePlayer, dice;
scores = [0,0];
roundScores = 0;
activePlayers = 0;

dice = Math.floor(Math.random()*6) + 1;

document.querySelector('#current-'+activePlayer).textContent = dice;

document.querySelector('#score-0').textContent = dice+10;

document.querySelector('#score-1').innerHTML = '<em>'+dice+'</em>';

document.querySelector('#dice-1').style.display = 'none';

document.querySelector('#dice-2').style.display = 'none';

document.querySelector('.btn-roll').addEventListener
