package cn.happy.day01;

import java.io.File;
import java.io.IOException;

/**
 * �����ļ�����Ŀ¼������
 * @author Happy
 *
 */
public class Day05 {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\���ǹ�.txt");
		
		file.createNewFile();
		
		long length = file.length();
		System.out.println(length);
		
		/*if (file.exists()) { //�ж��ļ��Ƿ����
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
		//���ע�⣺����������Ⱥ�Ϸ�������delete������Ա�ܷ��ֹ�����
		/*boolean flag = file.delete();
		*/
	}

}
