package practice01_Square;

public class Rectangle {
  
  // field
  private int width;  // 너비
  private int height; // 높이
  
  //constructor
  public Rectangle() {
    // TODO Auto-generated constructor stub
  }

  public Rectangle(int width, int height) {
  super();
  this.width = width;
  this.height = height;
  }

  // method
  public int getWidth() {
  return width;
  }

  public void setWidth(int width) {
  this.width = width;
  }

  public int getHeight() {
  return height;
  }

  public void setHeight(int height) {
  this.height = height;
  }
  
  // 넓이(크기)를 반환하는 메소드
  public int getArea() {  // get = 어떤 값을 반환하는 타입이 있는 애들
    return width * height;
  }
 
  // 사각형 정보 출력 메소드
  public void info() {
    System.out.println("너비 : " + width);
    System.out.println("높이 : " + height);
    System.out.println("넓이 : " + this.getArea());  // 넓이를 반환하는 메소드 호출
  }
  
  
  
}
