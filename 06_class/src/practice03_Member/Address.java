package practice03_Member;

public class Address {
  
  // field 
  /*
   * 변수 이름이 길어지면 길어지게 둬라... 스트레스 받을 필요 읎음. 
   * 변수 자체가 코드이자 주석의 역할을 하기도 함. 
   * 과도하게 줄여서 나만 알 수 있게 하면 NO
   * 변수 만들 시 한글자만 소문자로 시작하도록 만들지 않는다.
   */
  private String postCode;
  private String roadAddress;
  private String jibunAddress;
  private String detailAddress;
  private String extraAddress;
  private boolean basicAddress;
  
  // constructor
  public Address() {
    
  }
  
  
  // 만약 필드가 수정되어다면 기존 생성자는 지우고 다시 뽑아오면 됨.
  public Address(String postCode, String roadAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean basicAddress) {
    super();
    this.postCode = postCode;
    this.roadAddress = roadAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.basicAddress = basicAddress;
  } 

  // method
  // getter와 setter는 자동으로 추가된 필드만 추가로 뜸
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getRoadAddress() {
    return roadAddress;
  }

  public void setRoadAddress(String roadAddress) {
    this.roadAddress = roadAddress;
  }

  public String getJibunAddress() {
    return jibunAddress;
  }

  public void setJibunAddress(String jibunAddress) {
    this.jibunAddress = jibunAddress;
  }

  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

  public String getExtraAddress() {
    return extraAddress;
  }

  public void setExtraAddress(String extraAddress) {
    this.extraAddress = extraAddress;
  }

  // getter의 경우 boolean 타입이면 is로 시작
  /*
    변수 이름 자체가 is와 has로 시작하는 경우가 실무에서는 多 
    (ex. 필드명이 boolean타입 isBasicAddress일 경우 getter & setter 만들 시 알아서 is는 없애고 만든다.
    private boolean isBasicAddress; 
    getter = public boolean isBasicAddress() 
    setter = public void setBasicAddress(boolean isBasicAddress
    그럴 경우엔 자바가 알아서 다듬어서 출력함 
  */
  public boolean isBasicAddress() {
    return basicAddress;
  }


  public void setBasicAddress(boolean basicAddress) {
    this.basicAddress = basicAddress;
  }
  
  

}
