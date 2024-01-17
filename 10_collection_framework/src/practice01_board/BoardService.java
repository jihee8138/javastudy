package practice01_board;

import java.util.ArrayList;
import java.util.List;

public class BoardService {
  
  //boardVo 를 여러개 가지고 있는 리스트를 반환한다.
  // 호출하면 결과가 list 안에 있는 결과가 나온다.
  public List<BoardVo> getBoardList() {
    
    List<BoardVo> boardList = new ArrayList<BoardVo>();
    boardList.add(new BoardVo(1, "공지사항", "관리자", "20240101"));
    boardList.add(new BoardVo(2, "긴급공지", "마스터", "20240102"));
    boardList.add(new BoardVo(1, "반가워요", "나그네", "20240103"));
    
    return boardList;
    
  }
  

}
