import java.util.Scanner;
public class main{
  public static void main(String[]args){
    Circle c = new Circle();
    c.setColor("black");
    String x = c.getColor();
    System.out.println(x);


    Rectangle r = new Rectangle();
    r.setLength(5);
    r.setWidth(5);

    System.out.println(r.getArea());
  }
}
