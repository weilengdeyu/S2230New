package cn.happy.day01;

import java.io.File;
import java.io.IOException;

/**
 * 操作文件或者目录的属性
 * @author Happy
 *
 */
public class Day05 {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\我是狗.txt");
		
		file.createNewFile();
		
		long length = file.length();
		System.out.println(length);
		
		/*if (file.exists()) { //判定文件是否存在
			System.out.println("has");
		}else{
			System.out.println("has not");
		}*/
			/*boolean directory = file.isDirectory();
			boolean myfile=file.isFile();
			*/
		
		/*String path = file.getName();
		System.out.println(path);
		
		String getPath = file.getPath();
		System.out.println(getPath);
		
		String abosolutePath = file.getAbsolutePath();
		System.out.println(abosolutePath);*/
		//大家注意：下午他会在群上发布结论delete，程序员能否手工控制
		/*boolean flag = file.delete();
		*/
	}

}
