import java.util.Scanner;
import java.util.Random;

public class guess
{
  public void playG()
  {
    int go=0;
    Random r=new Random();
    Scanner s= new Scanner(System.in);

    int x= r.nextInt(100)+0;
    while(go==0)
    {
      int get=s.nextInt();
      if(get>x){
        System.out.println("The Number is less than "+get);
      }
      else if(get<x){
        System.out.println("The Number is greater than "+get);
      }
      else{System.out.println("Congratulations You are indeed a Master Mind!!"); break;}

    }

  }
}
