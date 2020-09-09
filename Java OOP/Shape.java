public abstract class Shape{
  //intance variable, filled, attribute.
  // child can use it but not out side class.
  protected String color;
  protected boolean filled;
  //default constructor
  public Shape(){

  }
  //over loaded constructor
  public Shape(String color, boolean filled){
    this.color = color;
    this.filled = filled;
  }
  //method
  public String getColor(){
    return color;
  }
  // ||
  public void setColor(String color){
    this.color = color;
  }
  // ||
  public boolean isFilled(){
    return filled;
  }
  // ||
  public void setFilled(boolean filled){
    this.filled = filled;
  }
  abstract public double getArea();
  abstract public double getPerimeter();
  //Another method
  public String toString(){
    return "Color: "+color+"\nFilled: "+filled;
  }
}
