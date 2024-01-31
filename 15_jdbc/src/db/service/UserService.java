package db.service;

import java.util.List;

import db.dto.UserDto;

public interface UserService {
  
  // 목록보기
  List<UserDto> getUsers();
  
  // 상세보기
  UserDto getUser(int user_no);
  
  // 사용자 등록
  int saveUser(UserDto userDto);
  
  // 사용자 수정
  int modifyUser(UserDto userDto);
  
  // 사용자 삭제
  int removeUser(int user_no);
  

}
