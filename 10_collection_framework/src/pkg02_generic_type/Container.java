package pkg02_generic_type;

// 제네릭 클래스
public class Container<T> {
  
  // 제네릭 타입
  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
  
  

}

// 제네릭 타입
// 일반화된 클래스 또는 메소드를 정의할 때 사용
// 코드의 재사용성을 높일 수 있고 타입 안전성을 유지