import java.util.Scanner;
public class TicTacToe
{
  int xs=0, os=0,d=0;
  int gameOver=0;
  int invalid=0;
  char[][]T= new char[3][3];


  public void play()
  {
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        T[i][j]=' ';
     }
  }

    while(gameOver==0){
      playersMove();
      if(invalid>0)
        continue;

      computersMove();

      result();
    }
     structure();



     if(xs>0){
       System.out.println("Congratulations!! You Win!!");}
     else if (os>0){
       System.out.println("You Humans are Useless!");}
     else if(d>0){
       System.out.println("Its a Draw");
     }
 }
public void playersMove()
{

  structure();
  System.out.println();
  System.out.println("Enter position (1-9): ");
  Scanner s= new Scanner(System.in);
  int in1=s.nextInt();
  if(in1==1 && T[0][0]==' '){T[0][0]='X';}
  else if(in1==2 && T[0][1]==' ') {T[0][1]='X';}
  else if(in1==3 && T[0][2]==' ') {T[0][2]='X';}
  else if(in1==4 && T[1][0]==' ') {T[1][0]='X';}
  else if(in1==5 && T[1][1]==' ') {T[1][1]='X';}
  else if(in1==6 && T[1][2]==' ') {T[1][2]='X';}
  else if(in1==7 && T[2][0]==' ') {T[2][0]='X';}
  else if(in1==8 && T[2][1]==' ') {T[2][1]='X';}
  else if(in1==9 && T[2][2]==' ') {T[2][2]='X';}
  else {System.out.println("Invalid Input Please Try Again");
     invalid++;
  }

}


public void computersMove()
{
  if(T[0][0]=='O' && T[0][1]=='O' && T[0][2]==' ') {T[0][2]='O';}
  else if(T[0][1]=='O' && T[0][2]=='O' && T[0][0]==' ') {T[0][0]='O';}
  else if(T[0][0]=='O' && T[0][2]=='O' && T[0][1]==' ') {T[0][1]='O';}
  else if(T[1][0]=='O' && T[1][1]=='O' && T[1][2]==' ') {T[1][2]='O';}
  else if(T[1][0]=='O' && T[1][2]=='O' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='O' && T[1][2]=='O' && T[1][0]==' ') {T[1][0]='O';}
  else if(T[2][0]=='O' && T[2][1]=='O' && T[2][2]==' ') {T[2][2]='O';}
  else if(T[2][0]=='O' && T[2][2]=='O' && T[2][1]==' ') {T[2][1]='O';}
  else if(T[2][1]=='O' && T[2][2]=='O' && T[2][0]==' ') {T[2][0]='O';}
  else if(T[0][0]=='O' && T[1][0]=='O' && T[2][0]==' ') {T[2][0]='O';}
  else if(T[0][0]=='O' && T[2][0]=='O' && T[1][0]==' ') {T[1][0]='O';}
  else if(T[1][0]=='O' && T[2][0]=='O' && T[0][0]==' ') {T[0][0]='O';}
  else if(T[0][1]=='O' && T[1][1]=='O' && T[2][1]==' ') {T[2][1]='O';}
  else if(T[0][1]=='O' && T[2][1]=='O' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='O' && T[2][1]=='O' && T[0][1]==' ') {T[0][1]='O';}
  else if(T[0][2]=='O' && T[1][2]=='O' && T[2][2]==' ') {T[2][2]='O';}
  else if(T[0][2]=='O' && T[2][2]=='O' && T[1][2]==' ') {T[1][2]='O';}
  else if(T[1][2]=='O' && T[2][2]=='O' && T[0][2]==' ') {T[0][2]='O';}
  else if(T[0][0]=='O' && T[1][1]=='O' && T[2][2]==' ') {T[2][2]='O';}
  else if(T[0][0]=='O' && T[2][2]=='O' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='O' && T[1][2]=='O' && T[0][0]==' ') {T[0][0]='O';}
  else if(T[0][2]=='O' && T[1][1]=='O' && T[2][0]==' ') {T[2][0]='O';}
  else if(T[0][2]=='O' && T[2][0]=='O' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='O' && T[2][0]=='O' && T[0][2]==' ') {T[0][2]='O';}

  else if(T[0][0]=='X' && T[0][1]=='X' && T[0][2]==' ') {T[0][2]='O';}
  else if(T[0][1]=='X' && T[0][2]=='X' && T[0][0]==' ') {T[0][0]='O';}
  else if(T[0][0]=='X' && T[0][2]=='X' && T[0][1]==' ') {T[0][1]='O';}
  else if(T[1][0]=='X' && T[1][1]=='X' && T[1][2]==' ') {T[1][2]='O';}
  else if(T[1][0]=='X' && T[1][2]=='X' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='X' && T[1][2]=='X' && T[1][0]==' ') {T[1][0]='O';}
  else if(T[2][0]=='X' && T[2][1]=='X' && T[2][2]==' ') {T[2][2]='O';}
  else if(T[2][0]=='X' && T[2][2]=='X' && T[2][1]==' ') {T[2][1]='O';}
  else if(T[2][1]=='X' && T[2][2]=='X' && T[2][0]==' ') {T[2][0]='O';}
  else if(T[0][0]=='X' && T[1][0]=='X' && T[2][0]==' ') {T[2][0]='O';}
  else if(T[0][0]=='X' && T[2][0]=='X' && T[1][0]==' ') {T[1][0]='O';}
  else if(T[1][0]=='X' && T[2][0]=='X' && T[0][0]==' ') {T[0][0]='O';}
  else if(T[0][1]=='X' && T[1][1]=='X' && T[2][1]==' ') {T[2][1]='O';}
  else if(T[0][1]=='X' && T[2][1]=='X' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='X' && T[2][1]=='X' && T[0][1]==' ') {T[0][1]='O';}
  else if(T[0][2]=='X' && T[1][2]=='X' && T[2][2]==' ') {T[2][2]='O';}
  else if(T[0][2]=='X' && T[2][2]=='X' && T[1][2]==' ') {T[1][2]='O';}
  else if(T[1][2]=='X' && T[2][2]=='X' && T[0][2]==' ') {T[0][2]='O';}
  else if(T[0][0]=='X' && T[1][1]=='X' && T[2][2]==' ') {T[2][2]='O';}
  else if(T[0][0]=='X' && T[2][2]=='X' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='X' && T[1][2]=='X' && T[0][0]==' ') {T[0][0]='O';}
  else if(T[0][2]=='X' && T[1][1]=='X' && T[2][0]==' ') {T[2][0]='O';}
  else if(T[0][2]=='X' && T[2][0]=='X' && T[1][1]==' ') {T[1][1]='O';}
  else if(T[1][1]=='X' && T[2][0]=='X' && T[0][2]==' ') {T[0][2]='O';}
  else if(T[1][1]==' ' && T[1][1]!='X' && T[1][1]!='O'){T[1][1]='O'; }
  else if(T[1][1]!=' ' && T[1][1]!='X' && T[1][1]!='O'){T[0][0]='O'; }
  else{
    int breakloop=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(T[i][j]==' '){
          T[i][j]='O';
          breakloop=1;
          break;
        }
     }
      if(breakloop==1){
          break;
      }
    }
  }

}
public void result()
{
  if(T[0][0]=='X' && T[0][1]=='X' && T[0][2]=='X')
  {gameOver++; xs++;}
  else if (T[0][0]=='O' && T[0][1]=='O' && T[0][2]=='O')
  {gameOver++; os++;}
  else if (T[1][0]=='X' && T[1][1]=='X' && T[1][2]=='X')
  {gameOver++;xs++;}
  else if (T[1][0]=='O' && T[1][1]=='O' && T[1][2]=='O')
  {gameOver++; os++;}
  else if(T[2][0]=='X' && T[2][1]=='X' && T[2][2]=='X')
  {gameOver++;xs++;}
  else if(T[2][0]=='O' && T[2][1]=='O' && T[2][2]=='O')
  {gameOver++;os++;}
  else if(T[0][0]=='X' && T[1][0]=='X' && T[2][0]=='X')
  {gameOver++;xs++;}
  else if(T[0][0]=='O' && T[1][0]=='O' && T[2][0]=='O')
  {gameOver++;os++;}
  else if(T[0][1]=='X' && T[1][1]=='X' && T[2][1]=='X')
  {gameOver++;xs++;}
  else if(T[0][1]=='O' && T[1][1]=='O' && T[2][1]=='O')
  {gameOver++;os++;}
  else if(T[0][2]=='X' && T[1][2]=='X' && T[2][2]=='X')
  {gameOver++;xs++;}
  else if(T[0][2]=='O' && T[1][2]=='O' && T[2][2]=='O')
  {gameOver++;os++;}
  else if(T[0][0]=='X' && T[1][1]=='X' && T[2][2]=='X')
  {gameOver++;xs++;}
  else if(T[0][0]=='O' && T[1][1]=='O' && T[2][2]=='O')
  {gameOver++;os++;}
  else if(T[0][2]=='X' && T[1][1]=='X' && T[2][0]=='X')
  {gameOver++;xs++;}
  else if(T[0][2]=='O' && T[1][1]=='O' && T[2][0]=='O')
  {gameOver++;os++;}
  if(
  T[0][0]!=' '&&T[0][1]!=' '&&T[0][2]!=' '&& T[1][0]!=' '&&T[1][1]!=' '&&T[1][2]!=' '&&T[2][0]!=' '&&T[2][1]!=' '&&T[2][2]!=' '
  ){
    d++;
    gameOver++;
  }
}
public void structure ()
 {
    System.out.println("        |       |                              |       |       ");
    System.out.println("    "+T[0][0]+"   |   "+T[0][1]+"   |   "+T[0][2]+"                      1   |   2   |   3   ");
    System.out.println(" _______|_______|_______                _______|_______|_______");
    System.out.println("        |       |                              |       |       ");
    System.out.println("    "+T[1][0]+"   |   "+T[1][1]+"   |   "+T[1][2]+"                      4   |   5   |   6   ");
    System.out.println(" _______|_______|_______                _______|_______|_______");
    System.out.println("        |       |                              |       |       ");
    System.out.println("    "+T[2][0]+"   |   "+T[2][1]+"   |   "+T[2][2]+"                      7   |   8   |   9   ");
    System.out.println("        |       |                              |       |       ");
 }
}
