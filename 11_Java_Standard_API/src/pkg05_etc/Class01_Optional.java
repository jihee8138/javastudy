package pkg05_etc;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class Class01_Optional {

  public static void main(String[] args) {
    
    // Optional<T> : T타입의 데이터를 감싸는 킄래스
    // 제네릭타입 (컬렉션프레임워크)
    
    // 1. null 값이 없는 데이터
    String str1 = "사과";
    Optional<String> opt01 = Optional.of(str1);
    System.out.println(opt01.get());
    
    
    // 2. null 값이 있는 데이터 ( 배우는 목적);
    String str2 = null;
    Optional<String> opt2 = Optional.ofNullable (str2);
    System.out.println("바나나");

  }

}
