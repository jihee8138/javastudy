package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
  
  public static void method1() {
    
    // filter() method : 조건 줄 때 쓰임
    // Stream<T> filter(Predicate<T> predicate) {  }
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Stream<Integer> numbers = list.stream();
    numbers.filter( (number) -> number % 2 == 0 )
                    .forEach((number) -> System.out.println(number));
    
  }
  public static void method2() {
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 5000),
        new Book("d", "dd", 15000),
        new Book("e","ee", 25000)
        );
    books.stream()
         .filter((book) -> book.getPrice() >= 10000)
         .forEach((book) -> System.out.println(book.getPrice()));
    
    List<Book> over20000 = books.stream()
         .filter((book) -> book.getPrice() >= 20000)
         .collect(Collectors.toList());  // 가격이 2만원 넘는 걸 list로 모아줌
    System.out.println(over20000);
  }

  public static void method3() {
    
    // map() 메소드 : 값을 바꿀 때 사용
    // Stream<T> map(Function<T, R> function) {  }
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    list.stream() // 필터와 맵을 함께 쓸 때는 필터를 먼저 쓴다
        .map((number) -> number + 1)
        .forEach((number) -> System.out.println(number));
  }
  
  public static void method4() {
    
    // 20000 이상은 책 가격을 50% 세일한 리스트 생성하기
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 5000),
        new Book("d", "dd", 15000),
        new Book("e","ee", 25000)
        );
    
//    books.stream()
//         .filter((book) -> book.getPrice() >= 20000)
//         .map((book) -> book.getPrice() * 0.5)
//         .forEach((book) -> System.out.println(book));
    
    List<Book> saleList = books.stream()
                               .filter((book) -> book.getPrice() >= 20000)
                               .map((book) -> new Book(book.getTitle(), book.getAutthor(), book.getPrice() / 2))
                               .toList();
    
    saleList.stream()
            .forEach((book) -> System.out.println(book.getTitle() + ": " + book.getPrice()));
  }
  
  public static void main(String[] args) {
   
    method4();
  }

}
