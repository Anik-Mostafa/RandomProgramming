public class Rectangle extends Shape{
  private double length;
  private double width;
  public Rectangle(){
  }
  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }
  public Rectangle(String color, boolean filled, double length, double width){
    super(color,filled);
    this.length = length;
    this.width = width;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public void setLength(double length){
    this.length = length;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public double getArea(){
    return length*width;
  }
  public double getPerimeter(){
    return 2*(length+width);
  }
  public String toString(){
    return super.toString()+"\nLength: "+length+"\nWidth: "+width;
  }
}