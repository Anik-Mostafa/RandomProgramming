//import java.util.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class h_man
{
  public static void structure(){
    System.out.println("   _________");
    System.out.println("    |       |");
    System.out.println("    |");
    System.out.println("    |");
    System.out.println("    |");
    System.out.println("   _|_________/");
}

public static void head1(){
  System.out.println("   _________");
  System.out.println("    |       |");
  System.out.println("    |       O");
  System.out.println("    |");
  System.out.println("    |");
  System.out.println("   _|_________/");
}

public static void body2(){
  System.out.println("   _________");
  System.out.println("    |       |");
  System.out.println("    |       O");
  System.out.println("    |       |");
  System.out.println("    |");
  System.out.println("   _|_________/");
}

public static void leftHand3(){
  System.out.println("   _________");
  System.out.println("    |       |");
  System.out.println("    |       O");
  System.out.println("    |       |\\");
  System.out.println("    |");
  System.out.println("   _|_________/");
}

public static void rightHand4(){
  System.out.println("   _________");
  System.out.println("    |       |");
  System.out.println("    |       O");
  System.out.println("    |      /|\\");
  System.out.println("    |");
  System.out.println("   _|_________/");
}

public static void leftLeg5(){
  System.out.println("   _________");
  System.out.println("    |       |");
  System.out.println("    |       O");
  System.out.println("    |      /|\\");
  System.out.println("    |      /  ");
  System.out.println("   _|_________/");
}

public static void rightLeg6(){
  System.out.println("   _________");
  System.out.println("    |       |");
  System.out.println("    |       O");
  System.out.println("    |      /|\\");
  System.out.println("    |      / \\");
  System.out.println("   _|_________/");
  System.out.println("***** GAME OVER ******");
}
    public void playH()
    {
      int go=0;
      int hang=0,gang=0,dang=0;

      Scanner s= new Scanner(System.in);
      String[] country = {"Bangladesh", "India", "Pakistan","Nepal","Canada","Brazil","Argentina","Denmark","Indonesia","Bhutan"};

      char[] test=new  char[15];
      Random rand = new Random();
      int n = rand.nextInt(10) + 0;
      //structure();
      System.out.println();
      System.out.print("   ");
      for(int i=0;i<country[n].length();i++)
      {
        System.out.print("_ ");
      }
      for(int i=0;i<country[n].length();i++)
      {
        test[i]='_';
      }
      int bang=country[n].length();
      System.out.println("\n");
      while(go==0)
      {

        if(hang==1){head1();}
        else if(hang==2){body2();}
        else if(hang==3){leftHand3();}
        else if(hang==4){rightHand4();}
        else if(hang==5){leftLeg5();}
        else if(hang==6){rightLeg6(); break;}
        else{structure();}


      System.out.print("\n  >> Enter your guess: ");
      char inf =s.next().charAt(0);

      for(int i=0;i<country[n].length();i++)
      {

            if(country[n].charAt(i)==inf)
            {
              test[i]=country[n].charAt(i);
            }

      }
      System.out.print("\n  ");
      for(int i=0;i<country[n].length();i++)
      {

          System.out.print(test[i]+" ");
          if(test[i]=='_'){
            gang++;
          }
          else{dang++;}

      }
      if(gang==bang){
        hang++;

      }
      if(dang==country[n].length()){
        System.out.println("\n\n   Congratulations You Did It!!\n");
        break;
      }
      System.out.println();
      System.out.println();




      //else {System.out.println("Game Over"); break;}
      bang=gang;
      gang=0;
      dang=0;


     }
  }
}
