public class MovableCircle implements Movable{
  int radius;
  MovablePoint center;
  public MovableCircle(){
  }
  public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
    center=new MovablePoint(x,y,xSpeed,ySpeed);
    this.radius=radius;
  } 
  public String toString(){
    return "Radius:"+radius+"\nCenter:"+center.toString();
  }
 public void moveUp(){
   center.moveUp();
  }
  public void moveDown(){
    center.moveDown();
  }
  public void moveLeft(){
    center.moveLeft();
  }
  public void moveRight(){
    center.moveRight();
  }
}  