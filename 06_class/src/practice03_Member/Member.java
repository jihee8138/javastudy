package practice03_Member;

public class Member {
  
  // field (클래스 안에 필드로 다른 클래스 주기)
  private String id;
  private Contact contact;
  private Address address;
  
  //constructor
  public Member() {
    
  }

  // 생성자 만들기
  public Member(String id, Contact contact, Address address) {
    super();
    this.id = id;
    this.contact = contact;
    this.address = address;
  }
  
  //method
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  
  
  

}


