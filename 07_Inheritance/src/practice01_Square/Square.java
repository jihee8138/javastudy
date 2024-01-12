package practice01_Square;

public class Square extends Rectangle {  // 상속관계 만들기
  
  // 파라미터가 1개짜리인 생성자 만들기
  public Square(int n) {  // int n = 너비이자 높이(사각형이 가지고 있음) n을 Rectangle에 보내야함
    
    // super();  // 디폴트를 부르는 것(public Rectangle()를 부르는 것
    /* public Rectangle(int width, int height) {
    super();
    this.width = width;
    this.height = height;
    }
    */
    // 요거를 불러야 함
    super(n,n);
  }
}
