package cn.happy.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**   字节流     
 * FileInputStream 读取文件
 * 
 * FileOutputStream 写入文件
 * @author Happy
 *
 */
public class Day01 {
   public static void main(String[] args) {
	   
	  // 写入操作：案例：将内存中一个字符串，写入硬盘上
	   try {
		writeDataToDisk();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	   
	   
	   /*try {
		   readDataFromDisk();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
  }
	private static void writeDataToDisk() throws IOException {
		//作业：如何内容比较多的时候，转换一点点  ，，，，，，，，写入硬盘一点点
	 FileOutputStream  fos=new FileOutputStream("E:\\S2230好人班级.txt");
	 String temp="我们明天9点上课，希望大家周一上午准时到，如果不到，就不到吧！";
	 
	 //控制到精确流的问题
	 byte[] bytes=temp.getBytes();
	 fos.write(bytes);
	 fos.close();
	 System.out.println("写入成功！！");
	
}
	//读取数据
	private static void readDataFromDisk() throws IOException {
		//流：作用：打通硬盘和内存的通道    创建了一个和硬盘上文件绑定的文件流  
		FileInputStream fis=new FileInputStream("E:\\S2230班级.txt");
		//创建缓存区大小是1k  承载1k数据的一个缓冲区    大家：就是内存中的一块区域  。主要是在内存和硬盘之间做数据交换的临时存储区
		byte[] bytes=new byte[1024];
		int data = 0;
		//注释  ：有效字节数
		StringBuffer sb=new StringBuffer();
		//由于一个文件的本身物理大小一定要远远大于缓冲区的大小。就是循环读取。
		//无论是那种语言，咱们读取的时候，都用read（byte[]方案） 将一部分数据通过fis流的通道放入缓冲区
		//data:read()返回的是本次读取到缓存区中的有效字节数  
		//拿有效字节数和   -1对比  ，如果是-1 证明  已经读取到了流的末尾 ,循环自动退出，不进行下一次读取操作了
		while((data=fis.read(bytes))!=-1){  //文件没有读取完毕，下次需要继续读取
			//没读取一次，将读取到的字节内容，转成字符串
			//bytes ------> String
			String temp=new String(bytes,0,data);   //读取到缓存区中的有效字节数，转成字符串，因为用户眼睛只能 看到字符串
			sb.append(temp);
			System.out.println("=====有效字节数====="+data);
		}
		System.out.println(sb.toString());
		//读取或者写入完成，一定要关流。。。底层已经做了很多的预置工作。 
		fis.close();//文件 数据库  稀缺资源，别忘了关
	}
}
