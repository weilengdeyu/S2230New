package cn.happy.day01;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�����Ʒ�ʽ��ȡ�ļ� ������������������������֮ǰ�ķ�ʽ��ͬ��ֻ�ܶ�ȡ��д���ı��ļ� 
/*DataInputStream
DataOutputStrem
*/
//���Զ�ȡ��д���κ��ļ�    ͼƬ   avi  mp3 ����  ѹ���ļ�   word�ĵ�


//��һ�����Ʋ��� 

public class Day04 {
  public static void main(String[] args) throws Exception {
	  //��ȡ�ļ���·��
	  InputStream is=new FileInputStream("E:\\wj.jpg");
	  //copy�κε��ļ�
	  DataInputStream dis=new DataInputStream(is);

	  OutputStream os=new FileOutputStream("F:\\����.jpg");
	  DataOutputStream oos=new DataOutputStream(os);
	  
	  
	  byte[] bytes=new byte[1024]; //һ��ת��1k������
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
