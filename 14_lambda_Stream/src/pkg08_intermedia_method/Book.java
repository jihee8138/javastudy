package pkg08_intermedia_method;

public class Book {
  
  // field
  private String title; 
  private String autthor;
  private int price;

  // constructor
  public Book() {
  }
  
  public Book(String title, String autthor, int price) {
    super();
    this.title = title;
    this.autthor = autthor;
    this.price = price;
  }

  // method
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAutthor() {
    return autthor;
  }

  public void setAutthor(String autthor) {
    this.autthor = autthor;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  
  
  

}
