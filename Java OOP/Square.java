public class Square extends Rectangle{
  public Square(){
  }
  public Square(double side){
    super.setLength(side);
    super.setWidth(side);
  }
  public Square(double side, String color, boolean filled){
    super(color,filled,side,side);
  }
  public double getSide(){
    return super.getLength();
  }
  public void setSide(double side){
    super.setLength(side);
  }
  public void setLength(double side){
    super.setLength(side);
  }
  public void setWidth(double side){
    super.setWidth(side);
  }
  public String toString(){
    return super.toString()+"\nSide: "+super.getLength();
  }
}