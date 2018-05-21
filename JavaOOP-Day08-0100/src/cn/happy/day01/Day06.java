package cn.happy.day01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 序列化和反序列化
 * ObjectOutputStream   写
 * 
 * ObjectInputStream  读取
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
		b1.setBookName("大话设计模式");
		b1.setBookPrice(12);
		
		Book b2=new Book();
		b2.setBookName("大话数据结构");
		b2.setBookPrice(22);

		list.add(b1);
		list.add(b2);
		
		//保存对象的全景图
		oos.writeObject(list);
		System.out.println("serialize success");*/
	}

}
