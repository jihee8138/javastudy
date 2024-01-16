package pkg04_checked;

/*
 * 패키지 이름을 생략하는 경우 (한 번만 적어준다.)
 * 1. 자바 내 있는 클래스를 호출하는 경우
 * 2. 동일한 패키지에 있는 클래스를 호출하는 경우
 * 3. import 문을 작성해둔 경우
 */

// import 는 클래스 밖에서 적어줌
// java.net.MalformedURLException 을 사용하곘음이란 의미
import java.net.MalformedURLException;
// java.net.URL 을 사용하겠음이란 의미
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {
    
    // checked exception : try ~ catch 와 같은 예외 처리 코드가 없으면 동작하지 않는 예외이다.
    // Runtime exception 이 아니면 전부 다 checked exception 이다.
    
    
    try {
      URL url = new URL("https://www.google.com/");  // new URL을 할 수 없다 라는 오류가 뜸 (익셉션 처리를 하지 않았다)      
   
    } catch(MalformedURLException e) { // 패키지 유형이 없기 때문에 MalformedURLException 만 적으면 오류 남(import 처리하기)
      System.out.println("잘못된 URL입니다.");
      
    }
    // URL = 클래스이름, url = 객체이름
    // 트라이 캐치 예외처리를 하지 않으면 실행 자체를 할 수 없다
    // 코드가 틀리지 않아도 트라이캐치 처리하지 않으면 실행할 수 없음 ==> checked exception
    // 
    
    
  }

}

// 