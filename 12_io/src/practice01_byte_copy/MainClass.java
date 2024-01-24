package practice01_byte_copy;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class MainClass {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    MyFileUtils.fileCopy("\\Program Files\\Java\\jdk-17\\LICENSE", "\\storage\\LICENSE");
    MyFileUtils.fileMove("\\storage\\LICENSE", "\\GDJ77\\LICENSE");

    
    
    
    
    
  }

}
