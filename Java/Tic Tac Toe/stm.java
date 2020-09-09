import java.util.Random;
import java.util.Scanner;
public class stm{

 public void playS(){
    int start=1;
    while(start==1)
    {

    Scanner s= new Scanner(System.in);

    int go=0,give=3,end=0;
    Random r= new Random();


    int toto=100,xone;
    char [] x= new char [15];

    String in,inone;





    /*for(int i=0;i<15;i++){
      xone =r.nextInt(100000) + 0;
      inone = String.valueOf(xone);
      in[i]=inone.charAt(0);
    }*/




    while(go==0){

       xone = r.nextInt(toto) + 0;
       inone = String.valueOf(xone);

      for(int i=0;i<inone.length();i++){
        System.out.print(inone.charAt(i)+"   ");
      }
      try{
        Thread.sleep(4000);
      }
      catch(Exception e){}

      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWhat was the number?");

      in=s.nextLine();
      try{
        for(int i=0;i<inone.length();i++){
        if(in.charAt(i)==inone.charAt(i)){
          end++;
          }
        }
      }
      catch(Exception e){}
      /*System.out.println(end);
      if(inone!=in)
      {
        System.out.println(inone);
        end++;
        System.out.println(in);
      }
      System.out.println(end);*/
      if(end!=inone.length()){break;}
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("You are Right!");
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){}
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      toto = toto * 10;
      end=0;
    }
    System.out.println("You were wrong!\n");

    System.out.println("To Restart Game Press 1 \nTo Exit Game Press 2 ");

    int restart= s.nextInt();
   if(restart==1)
   continue;
   else if(restart==2){break;}
  else{
    System.out.println("Invalid Input");
  }

}

}
}
