package pkg02_interface;

/*
 * 용어 비교
 * 
 *    클래스              인터페이스
 * 1. 상속한다.           구현한다.
 * 2. extends             implements
 * 3. 자식클래스          구현클래스
 */

public class Circle implements Shape{
  
  // field
  private double x;
  private double y;
  private double radius;
  
  // constructor
  public Circle() {
    // TODO Auto-generated constructor stub
  }
  
  

  /**
   * @param x
   * @param y
   * @param radius
   */
  public Circle(double x, double y, double radius) {
    super();
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  

  public double getX() {
    return x;
  }



  public void setX(double x) {
    this.x = x;
  }



  public double getY() {
    return y;
  }



  public void setY(double y) {
    this.y = y;
  }



  public double getRadius() {
    return radius;
  }



  public void setRadius(double radius) {
    this.radius = radius;
  }



  @Override
  public double getasArea() {
    // TODO Auto-generated method stub
    return PI * Math.pow(radius, 2);
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return 2 * Math.PI * radius;
  }
  
  
  
  

}
