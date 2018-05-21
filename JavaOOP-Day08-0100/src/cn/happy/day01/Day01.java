package cn.happy.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**   �ֽ���     
 * FileInputStream ��ȡ�ļ�
 * 
 * FileOutputStream д���ļ�
 * @author Happy
 *
 */
public class Day01 {
   public static void main(String[] args) {
	   
	  // д����������������ڴ���һ���ַ�����д��Ӳ����
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
		//��ҵ��������ݱȽ϶��ʱ��ת��һ���  ����������������д��Ӳ��һ���
	 FileOutputStream  fos=new FileOutputStream("E:\\S2230���˰༶.txt");
	 String temp="��������9���ϿΣ�ϣ�������һ����׼ʱ��������������Ͳ����ɣ�";
	 
	 //���Ƶ���ȷ��������
	 byte[] bytes=temp.getBytes();
	 fos.write(bytes);
	 fos.close();
	 System.out.println("д��ɹ�����");
	
}
	//��ȡ����
	private static void readDataFromDisk() throws IOException {
		//�������ã���ͨӲ�̺��ڴ��ͨ��    ������һ����Ӳ�����ļ��󶨵��ļ���  
		FileInputStream fis=new FileInputStream("E:\\S2230�༶.txt");
		//������������С��1k  ����1k���ݵ�һ��������    ��ң������ڴ��е�һ������  ����Ҫ�����ڴ��Ӳ��֮�������ݽ�������ʱ�洢��
		byte[] bytes=new byte[1024];
		int data = 0;
		//ע��  ����Ч�ֽ���
		StringBuffer sb=new StringBuffer();
		//����һ���ļ��ı��������Сһ��ҪԶԶ���ڻ������Ĵ�С������ѭ����ȡ��
		//�������������ԣ����Ƕ�ȡ��ʱ�򣬶���read��byte[]������ ��һ��������ͨ��fis����ͨ�����뻺����
		//data:read()���ص��Ǳ��ζ�ȡ���������е���Ч�ֽ���  
		//����Ч�ֽ�����   -1�Ա�  �������-1 ֤��  �Ѿ���ȡ��������ĩβ ,ѭ���Զ��˳�����������һ�ζ�ȡ������
		while((data=fis.read(bytes))!=-1){  //�ļ�û�ж�ȡ��ϣ��´���Ҫ������ȡ
			//û��ȡһ�Σ�����ȡ�����ֽ����ݣ�ת���ַ���
			//bytes ------> String
			String temp=new String(bytes,0,data);   //��ȡ���������е���Ч�ֽ�����ת���ַ�������Ϊ�û��۾�ֻ�� �����ַ���
			sb.append(temp);
			System.out.println("=====��Ч�ֽ���====="+data);
		}
		System.out.println(sb.toString());
		//��ȡ����д����ɣ�һ��Ҫ�����������ײ��Ѿ����˺ܶ��Ԥ�ù����� 
		fis.close();//�ļ� ���ݿ�  ϡȱ��Դ�������˹�
	}
}
