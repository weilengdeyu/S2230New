package cn.happy.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * �����׷������������������ݶ�ȡ��д�뷽��
 * 
 * BufferedReader���Զ��建���С����ȡ�ı� 8192��char
   BufferedWriter��д���ı�
 * @author Happy
 *
 */
public class Day03 {

	public static void main(String[] args) throws Exception {
		
		//������Ӿ���  typeAChannel | ��������̨ 
		///         typeBChannel | �������
		//readData();
		Writer writer=new FileWriter("E:\\S2230���˰༶.txt",true);
		BufferedWriter bw=new BufferedWriter(writer);
		bw.write("\r\n���ǵ�����");
		bw.newLine();
		bw.write("������");
		bw.close();
		writer.close();
		
		System.out.println("write ok");
	}

	private static void readData() throws Exception {
		Reader reader=new FileReader("E:\\S2230���˰༶.txt");
		BufferedReader br=new BufferedReader(reader);
		String line = br.readLine();
		
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		
		//���Ĺر�˳�����ȿ��ĺ��
		br.close();
		reader.close();
			
	}

}
