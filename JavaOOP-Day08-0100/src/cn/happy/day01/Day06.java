package cn.happy.day01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * ���л��ͷ����л�
 * ObjectOutputStream   д
 * 
 * ObjectInputStream  ��ȡ
 * 
 * @author Happy
 *
 */
public class Day06 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		InputStream is=new FileInputStream("save.bin");
		ObjectInputStream ois=new ObjectInputStream(is);
		
		List<Book> list=(List<Book>)ois.readObject();
		
		for (Book book : list) {
			System.out.println(book.getBookName());
		}
		
		
		/*OutputStream os=new FileOutputStream("save.bin");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		
		List<Book> list=new ArrayList<Book>();
		
		
		Book b1=new Book();
		b1.setBookName("�����ģʽ");
		b1.setBookPrice(12);
		
		Book b2=new Book();
		b2.setBookName("�����ݽṹ");
		b2.setBookPrice(22);

		list.add(b1);
		list.add(b2);
		
		//��������ȫ��ͼ
		oos.writeObject(list);
		System.out.println("serialize success");*/
	}

}
