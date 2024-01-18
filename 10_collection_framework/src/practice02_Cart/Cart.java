package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private List<Product> products;
  // private int count; 
  // ↑ 삽입할 위치를 알기 위해 썼지만 ArrayList에서는 필요 없음
  
  // constructor
  public Cart(int cartSize) {
    products = new ArrayList<Product>(cartSize);
  }

  // method
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
  
  //    runtimeexception과 그 자식들은 (unchecked exception) 
  //    예외처리구문이 없어도 동작하기 때문에 생략 가능
  
  // 물건 담기
  public void addProduct(Product product) throws RuntimeException {
    
    
    // 담을 물건이 없는 경우  //exception으로 처리할 수 있는 부분
    if(product == null) {
      throw new RuntimeException("카트에 담을 물건이 없습니다.");
      
    }
    
    products.add(product);                  
  }
  
    // 물건 바꾸기
    public void  changeProduct (int idx, Product product) throws RuntimeException {
      
      // 카트가 비어 있는 경우 (바꿀 물건이 없는 경우)
      if(products.size() == 0) {
          throw new RuntimeException("카트가 비어 있습니다.");
      }
      
      // 바꿀 물건이 없는 경우
      if(product == null) {
          throw new RuntimeException("바꿀 물건이 없습니다.");
      }
      
      // 인덱스의 유효범위검사
      // 존재하지 않는 물건 번호(인덱스)인 경우
      if(idx < 0 || idx >= products.size()) {
        throw new RuntimeException("물건 번호가 잘못되었습니다.");
      }   
      
      products.set(idx, product);
    }
 
  
    // 물건 빼기
    public void removeProduct(int idx) throws RuntimeException {
      
      // 카트에 담긴 물건 개수
      int size = products.size();
      
      // 카트가 비어 있는 경우
      if(size == 0) {
        throw new RuntimeException("카트가 비어 있습니다.");
      }
      
      // 존재하지 않는 물건 번호(인덱스)인 경우
      if(idx < 0 || idx >= products.size()) {
        throw new RuntimeException("물건 번호가 잘못되었습니다.");
      }
      products.remove(idx);
    }
    
  
  

  }
    
  
  
  
  

