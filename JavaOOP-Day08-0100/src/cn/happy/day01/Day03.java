package cn.happy.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 第三套方案：带缓存区的数据读取和写入方案
 * 
 * BufferedReader：自定义缓存大小，读取文本 8192个char
   BufferedWriter：写入文本
 * @author Happy
 *
 */
public class Day03 {

	public static void main(String[] args) throws Exception {
		
		//网络电视精灵  typeAChannel | 北京电视台 
		///         typeBChannel | 凤凰卫视
		//readData();
		Writer writer=new FileWriter("E:\\S2230好人班级.txt",true);
		BufferedWriter bw=new BufferedWriter(writer);
		bw.write("\r\n我是第三行");
		bw.newLine();
		bw.write("第四行");
		bw.close();
		writer.close();
		
		System.out.println("write ok");
	}

	private static void readData() throws Exception {
		Reader reader=new FileReader("E:\\S2230好人班级.txt");
		BufferedReader br=new BufferedReader(reader);
		String line = br.readLine();
		
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		
		//流的关闭顺序是先开的后关
		br.close();
		reader.close();
			
	}

}
