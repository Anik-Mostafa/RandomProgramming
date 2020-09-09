import java.util.Scanner;
public class MainMenu
{

  public static void main(String[]args)
  {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n      >>>Welcome To Game! Enter The Game Number To Play!<<<\n\n\n\n1. Tic Tac Toe\n2. Short Term Memory Test\n3. Hang The Man\n4. Guess The Number Game\n5. Exit");
    int good=1;
    Scanner s= new Scanner(System.in);
    while(good==1){
    int start=s.nextInt();
    if(start==1){
      TicTacToe ttt =new TicTacToe();
    ttt.play();
  }
    else if(start==2){
      System.out.println("Welcome To Short Term Memory Loss\n\n\n\n\n");
      stm sm =new stm();
    sm.playS();
  }
    else if(start==3){
      System.out.println("Welcome To Hang Man");
      h_man man = new h_man ();
      man.playH();
    }
    else if(start==4){
      System.out.println("Welcome To The Game Guess The Number! ");
      guess ess= new guess();
      ess.playG();
    }
    else if(start==5){break;}
    else {System.out.println("Invalid Number");}
  }
 }
}
