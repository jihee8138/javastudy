package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class DetailView implements View {

  @Override
  public UserDto display() {
    
    // int 타입으로는 못 받음 
    String user_no = JOptionPane.showInputDialog("조회할 사용자의 번호를 입력하세요.");
    return new UserDto(Integer.parseInt(user_no), null, null, null);
  }

}
