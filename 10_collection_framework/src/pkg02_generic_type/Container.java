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
