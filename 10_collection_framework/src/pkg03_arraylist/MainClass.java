package pkg03_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
  
  /*
   * ArrayList 클래스
   * 1. 배열 리스트를 구현한 클래스이다.
   * 2. 실무에서는 배열 대신 사용한다.
   * 3. 배열의 특징을 그래도 가지고 있다.
   *    1) 순서대로 데이터가 저장된다.
   *    2) 인덱스를 가지고 있다.
   */
  
  public static void method1() {
    
    // 컬렉션프레임워크들은 전부 다 자바
    // 이제 코드 작성할 때 import 해야할 경우가 많아짐
    // 제네릭에서는 참조타입 못 씀 int 불가능
    
    // ArrayList 생성을 위한 변수 선언 (사용 가능 타입 : Collection<E>, List<E>, ArrayList<E>
    List<Integer> numbers; // int[] numbers; 가 환생한 거라고 생각해..
    
    // ArrayList 객체 생성
    numbers = new ArrayList<Integer>(); // numbers = new int[10];
    
    // 요소 추가하기
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    // 꽉 차면 알아서 조정해서 배열의 길이 늘려줌
    // ArrayList는 크기를 동적으로 조절하므로 배열과는 달리 크기를 미리 지정할 필요 없음
    
    // 요소 가져오기
    System.out.println(numbers.get(0));  // 5 가져옴
    System.out.println(numbers.get(1));  // 4 가져옴
    System.out.println(numbers.get(2));  // 3 가져옴
    System.out.println(numbers.get(3));  // 2 가져옴
    System.out.println(numbers.get(4));  // 1 가져옴
    
    
  }
  
  public static void method2() {
    
    // ArrayList 선언 및 생성
    // ArrayList 를 사용하여 String 타입의 요소를 다루는 hobbies라는 리스트를 선언하고 생성
    List<String> hobbies = new ArrayList<String>();
    
    // 요소 추가하기
    hobbies.add("게임");
    hobbies.add("여행");
    hobbies.add("수영");
    hobbies.add("레고");
    hobbies.add("모임");
    
    // 저장된 요소의 개수 (알아야 for 문 돌릴 수 있음)
    System.out.println(hobbies.size());
    
    // for 문
    // 동일한 값을 뿜는 메소드를 여러 번 호출할 필요 없음
    // 배열은 필드값이 아니라 변수가 들어오니까 상관 없는데 어레이는 메소드를 불러오니까 메소드를 호출하는 건 성능에 영향을 미칠 수 있음
    // 불필요하게 여러 번 메소드를 호출하게 구성하지 말 것
    // hobbies.size를 초기화 블록에 둔다.
    // for(int i = 0; i < hobbies.size(); i++); { 
    //   System.out.println(hobbies.get(i));}
    // 위에처럼 풀면 강사님이 불러서 상담한대...
    
    for(int i = 0, size = hobbies.size(); i < size; i++) { //i는 0이고 사이즈는 5야
         System.out.println(hobbies.get(i));
    }
    
    
  }
  
  public static void method3() {
    
    // 배열을 List로 바꾸기
    // Integer 타입의 배열 arr을 선언하고 초기화
    Integer[] arr = new Integer[] {10, 20, 30};
    
    // 배열을 List로 바꿔서 반환하는 java.util.Arrays 클래스의 asList 메소드
    // 배열을 List로 변환하기 위해 Arrays 클래스의 asList 메소드를 사용하여 numbers 리스트 생성
    List<Integer> numbers = Arrays.asList(arr);
    
    // 주의 !
    // numbers는 길이를 변경할 수 없다. (추가, 삭제가 불가)
    System.out.println(numbers);  //numbers 에 toSting 메소드 생략
    // numbers = numbers.toString
    
    // 배열은 참조타입이기 때문에 배열의 이름이 참조값 배열의 이름을 찍으면 참조값이 나옴
  }
  
  public static void method4() {
    
    // String 타입의 리스트 seasons를 생성
    List<String> seasons = new ArrayList<String>();
    
    seasons.add("봄");
    seasons.add("여름");
    seasons.add("파인애플");
    seasons.add("피자");
    seasons.add("겨울");
    
    // 요소 수정
    seasons.set(2, "가을"); //인덱스값 2의 요소를 "가을"로 변경
    
    // 요소 삭제
    String removeItem = seasons.remove(3); // remove(삭제할 인덱스값)
    System.out.println(removeItem);  // 삭제한 요소 출력
    
    System.out.println(seasons);

  }
  
  public static void main(String[] args) {
    
    method4();
    
   

  }

}

//배열의 길이 늘릴 때
//새 배열을 준비하다
//어레이카피한다
//참조값을 넣는다
//길이를 늘릴 때 어레이카피를 한다
