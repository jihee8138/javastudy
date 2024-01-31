package db.view;

import db.dto.UserDto;

public interface View {
  
  // 사용자가 입력하는 정보들을 반환하는 게 목적
  // UserDto를 반환하는 것이 목적
  UserDto display();

}
