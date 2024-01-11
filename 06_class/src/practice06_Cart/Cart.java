package practice06_Cart;

public class Cart {
  
  // field
  public final static int CART_SIZE = 10; // 카트에 담을 수 있는 물건의 최대수량은 10개
  private Product[] products; // product가 여러개 들어가니까 배열[] 선언 / 선언만 하고 생성은 아직 하지 않은 상태임.
  private int count; // 카트에 담긴 물건의 개수
  
  // constructor
  public Cart(int cartSize) {  // 위에서 선언한 배열을 생성
    products = new  Product[cartSize = Math.min(cartSize, CART_SIZE)]; 
  } // 최대수량 10개로 제한하기 위해서 Math 활용, CART_SIZE = 10으로 필드에 지정해놨음.

  // method
  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  // 물건 담기
  public void addProduct(Product product) {
    
    // 카트가 꽉 찬 경우 (카트에 담은 물건이 배열의 길이와 같을 때)
    if(count == products.length) {
      System.out.println("카트가 가득 찼습니다.");
      return;
    }
    
    // 담을 물건이 없는 경우
    if(product == null) {
      System.out.println("카트에 담을 물건이 없습니다.");
    }
    
    products[count++] = product; //카운트를 쓰고 나서 증가 시킴 (후위연산)
    /*
     * count가 0이면 인덱스 0에 저장
     * count가 1이면 인덱스 1에 저장
     * count가 사실은 인덱스의 역할을 수행 ?????
     */
  }
  
  
  // 물건 바꾸기
  public void  changeProduct (int idx, Product product) {
    
    // 카트가 비어 있는 경우 (바꿀 물건이 없는 경우)
    if(count == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }
    
    // 바꿀 물건이 없는 경우
    if(product == null) {
      System.out.println("바꿀 물건이 없습니다.");
      return;
    }
    
    // 인덱스의 유효범위검사
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.length ) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }   
    
    products[idx] = product;
  }
    
    // 물건 빼기
    public void removeProduct(int idx) {
      
      // 카트가 비어 있는 경우
      if(count == 0) {
        System.out.println("카트가 비어 있습니다.");
        return;
      }
      
      // 존재하지 않는 물건 번호(인덱스)인 경우
      if(idx < 0 || idx >= products.length) {
        System.out.println("물건 번호가 잘못되었습니다.");
        return;
      }
    /*
     * 물건이 5개(count)인 경우로 가정
     * 
     * 삭제할 idx   복사할 요소의 개수 (count - idx - 1)  
     * 0            4
     * 1            3
     * 2            2
     * 3            1
     * 4            0 
     */
    // product, idx : 소스 /  + 1 product, idx : 목적지 / count - idx -1 : 계산
    System.arraycopy(products, idx + 1, products, idx, count - idx -1);
    count--; // 물건의 개수 줄이기
    
  }
  
  
  

  }
  
  
  
  

