public class MovablePoint implements Movable{
  private int x;
  private int y;
  private int xSpeed;
  private int ySpeed;
  public MovablePoint(){
  }
  public MovablePoint(int x, int y, int xSpeed, int ySpeed){
    this.x=x;
    this.y=y;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
  }
  public String toString(){
    return "X :"+x+"\nY:"+y+"\nxSpeed:"+xSpeed+"\nYSpeed:"+ySpeed;
  }
  public void moveUp(){
    y=y+ySpeed;
  }
  public void moveDown(){
    y=y-ySpeed;
  }
  public void moveLeft(){
    x=x-xSpeed;
  }
  public void moveRight(){
    x=x+xSpeed;
  }
}