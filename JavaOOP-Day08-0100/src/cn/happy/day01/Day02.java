package cn.happy.day01;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * �ַ������ֽ�ĵ�Ԫ������һ��һ����byte��һ��һ��char����ȡ �ı��ļ�  1���ַ�=2byte
 * 
 * Java Code   DB  Data  Goes   Excel�ļ�
 * POI����  ����
 * JXL  ���뵼��
 * ������̣�����Python �������ݷ�����AI��֩�����棬��Java���룩  �Ƽ��� ����     xxx.py ������ bat ������
 * ������ ͨ��utils ���� ��   copy  paste  2��� ��дͨ�õĹ��ߴ���
 * S2��ҵ���ԣ� ��Ǯ����������10��   Y2  ѧʿ�� ��1��������   ��entity dao service  web  ui  
 * 
 * 
 * 
 * FileReader
 * 
 * 
 * FileWriter
 * @author Happy 
 * 
 */
public class Day02 {
	public static void main(String[] args) throws Exception {
		
	    
		//readData();
		
		
		//д���ļ�    ����׷��Ҳ���Ը��ǣ��ؼ�����ҶԹ������ص�ѡ��
		FileWriter writer=new FileWriter("E:\\S2230���˰༶.txt",true);
		writer.write("\r\nsecond line =====��������ŵ㣬΢���ڱ����ٿ�΢����˹����ܴ��,����߶��Ǵ�ţ������ƽ̨����----Ӣ������ֱ��ͨ�����û�ѡ��----���ǿ�����PC���ƶ���ͨ��Ⱥ�����ӹۿ���Ƶ���������ض���ʱ���н��У��вʵ�");
		writer.close();
		System.out.println("write ok");
		
		
	}

	private static void readData() throws Exception {

		FileReader reader=new  FileReader("E:\\S2230���˰༶.txt");
		char[] chars=new  char[1024];
		int data=0;
		//Vector �̰߳�ȫ ��    ArrayList���̷߳�ȫ��   ��������������Vector 
		//��Ҳ�Ҫ�Ժ󼯺ϱ����ǰ�ȫ�ģ������������ȥ�洢�����ݾ�һ���ܱ�֤�̰߳�ȫ������������������������
		//�Լ�ȥ����
		StringBuffer sb=new StringBuffer();
		while((data=reader.read(chars))!=-1){
			//char[]      String
			String temp=new String(chars,0,data);
			sb.append(temp);
		}
		System.out.println(sb.toString());
		reader.close();
		
	}

}
