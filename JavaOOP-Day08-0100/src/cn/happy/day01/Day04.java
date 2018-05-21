package cn.happy.day01;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//二进制方式读取文件 ：：：：：：：：：：：：之前的方式不同：只能读取和写入文本文件 
/*DataInputStream
DataOutputStrem
*/
//可以读取和写入任何文件    图片   avi  mp3 可以  压缩文件   word文档


//做一个复制操作 

public class Day04 {
  public static void main(String[] args) throws Exception {
	  //读取文件的路径
	  InputStream is=new FileInputStream("E:\\wj.jpg");
	  //copy任何的文件
	  DataInputStream dis=new DataInputStream(is);

	  OutputStream os=new FileOutputStream("F:\\汪静.jpg");
	  DataOutputStream oos=new DataOutputStream(os);
	  
	  
	  byte[] bytes=new byte[1024]; //一次转移1k的数据
	  int data=0;
	  while((data=dis.read(bytes))!=-1){
		  oos.write(bytes,0,data);
	  }
	  
	  oos.close();
	  dis.close();
	  os.close();
	  is.close();
	  System.out.println("copy success");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
