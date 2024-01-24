package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import pkg02_OutputStream.Employee;

public class MainClass {
  
  /*
   * java.io.FileInputStream
   * 1. 바이트 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int (한 개씩)
   *    2) byte[] (여러 개)
   */
  
  /*
   * java.io.BufferedInputStream
   * 1. 버퍼링을 지원하는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   */
  
  /*
   * java.io.DataInputStream
   * 1. 자바 변수로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다.
   */
  
  /*
   * java.io.ObjectInputStream
   * 1. 객체로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 읽은 객체는 Object 타입으로 반환되므로 객체 타입으로 캐스팅 해서 사용한다.
   */

  public static void method1() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.dat");
    
    // 파일 입력 스트림 선언
    FileInputStream in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileInputStream(file);  // FileNotFoundException 예외 발생
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()]; 
      //그냥 file.length만 적으면 오류나는 이유는 ?
      // length의 반환값이 정수이긴 한데 int가 아니라 long이다.
      // 배열의 길이는 파일의 크기다
      // 파일의 크기를 구하는 메소드 file.length()
      // List<Byte>  // 요 방법도 가능
      int idx = 0;
      
      // 읽을 단위 (int 변수로 1바이트씩 읽는다.)
      int c;
      
      // 읽기
      while (true) {
        c = in.read();  // 일단 하나 읽어봐
        if(c == -1) {  // 걔 -1인지 검사해봐
          break;  // 어 끝났어 그럼 나가
        }
        b[idx++] = (byte)c; 
        // 그냥 c만 전달하면 안된다. 4바이트로 지정되어있는디 c는 1바이트짜리        
        // 실제로 read가 읽어오는 건 1바이트, 이걸 4바이트 그릇에 담는다. 그래서 4바이트로 캐스팅 필요
      }
      for(int i = 0; i < b.length; i++)
        // Apple 의 마스킹 코드 값
        System.out.println(b[i]);
      System.out.println(new String(b));  // for 문 돌리지 않아도 됨.
      System.out.println(b[0]);
      // 결과값 : 65 => 대문자 a의 마스킹코드값
      
      // 파일 입력 스트림 닫기
      in.close();
      
      
    } catch (FileNotFoundException e) {
      System.out.println("파일의 경로를 확인하세요.");
      // read 메소드는 실제로 파일을 읽어주는 메소드라 예외가 발생함
      // read 메소드가 발생시키는 예외는 FileNotFoundException 이 처리하지 못한다.
      // 따라서 IOException 예외 처리 필요
    } catch (IOException e) {
      System.out.println("입출력 예외가 발생했습니다.");
    }   
  }
  
  public static void method2() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.dat");
    
    // 파일 입력 스트림 선언
    FileInputStream in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileInputStream(file);
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()];
      
      // 읽을 단위 (byte[] 배열로 읽는다.)
      byte[] bytes = new byte[5];  // 5바이트씩 읽어본다.
      int idx = 0;
      
      // 읽기
      
      while(true ) {
        
        int readByte = in.read(bytes);
        // read 메소드는 실행 후 int로 반환. 한 번 읽을 때 5바이트씩 읽음
        if(readByte == -1) {
          break;
        }
        System.arraycopy(bytes, 0, b, idx, readByte);
        // bytes 배열의 첫번째 요소부터 b배열의 첫번째 요소를 복사를 시작한다 읽어들인 만큼
        idx += bytes.length;  // idx += readByte;
      }
      
      // 확인
      System.out.println(new String(b));
      
      // 파일 입력 스트림 닫기
      in.close();
      
//      int readByte = in.read(bytes);
//      System.arraycopy(bytes, 0, b, 0, readByte);
//      
//      for(int i = 0; i < b.length; i++) {
//        System.out.println(b[i]);
//      }
      
    } catch (FileNotFoundException e) {
      System.out.println(file.getPath() + "파일이 존재하지 않습니다.");
    } catch (IOException e) {
      System.out.println("입출력 오류가 발생했습니다.");
    }
    
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.dat");
    
    // 버퍼 입력 스트림 선언
    BufferedInputStream in = null;
    
    try {
      
      // 버퍼 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(file));
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()];
      
      // 읽을 단위 (byte[] 배열로 읽는다.)
      byte[] bytes = new byte[5];  // 5바이트씩 읽어본다.
      int idx = 0;
      
      int readByte = 0;
      // 변수 선언이 while문 안에 들어가있으면 한 번 실행할 때마다 readbyte 선언, 삭제를 하기 때문에
      // 불필요한 동작이 발생한다. 선언문은 밖으로 빼는 게 좋다.
      while((readByte = in.read(bytes)) != -1) {
      }
      // readByte = in.read(bytes) 이 먼저 동작해야 하기 때문에 () 안에 들어가야함
      // -1이 아니면 계속하시오로 코드 스타일 바꿔서 while문 안에 넣기
      // 무한루프를 써서 코드가 긴 편으로 if문을 while문의 조건으로 넣어서 코드를 줄인다.
      System.arraycopy(bytes, 0, b, idx, readByte);
      idx += bytes.length;  // idx += readByte;
      
      
      
      // 확인
      System.out.println(new String(b));
      
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void method4() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample4.dat");
    
    // 데이터 입력 스트림 선언
    DataInputStream in = null;
    
    try {
      
      // 데이터 입력 스트림 생성
      // 파일과 연결된 통로의 이름이 'in'이다.
      in = new DataInputStream(new FileInputStream(file));
      
      // 입력
      String name = in.readUTF();          // 출력 시 out.writeUTF(name) 사용
      int age = in.readInt();              // 출력 시 out.writeInt(age) 사용
      double height = in.readDouble();     // 출력 시 out.writeDouble(height) 사용
      boolean isAdult = in.readBoolean();  // 출력 시 out.writeBoolean(isAdult) 사용
      char gender = in.readChar();         // 출력 시 out.writeChar(gender) 사용
          
      // 확인
      System.out.println(name);
      System.out.println(age);
      System.out.println(height);
      System.out.println(isAdult);
      System.out.println(gender);
      
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void method5() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample5.dat");
    
    // 객체 입력 스트림 선언
    ObjectInputStream in = null;
    
    try {
      
      // 객체 입력 스트림 생성
      in = new ObjectInputStream(new FileInputStream(file));
      
      // 객체 입력
      Employee emp1 = (Employee)in.readObject();
      List<Employee> empList = (List<Employee>)in.readObject();
      
      // 확인
      System.out.println(emp1);
      System.out.println(empList.get(0));
      System.out.println(empList.get(1));
      
      // 객체 입력 스트림 닫기
      in.close();
      
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      
    }
  }
  
  public static void main(String[] args) {
   
    method5();
  
  }
}
