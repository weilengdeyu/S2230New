package cn.happy.day03;

import java.util.HashSet;
import java.util.Set;

public class DayLast {

	public static void main(String[] args) {
		 Dog d1=new Dog();
	     d1.setAge(12);
	     d1.setName("��ƹ�");
	     
	     
	    /* Dog d3=d1;*/
	     
		  
	     Dog d2=new Dog();
	     d2.setAge(12);
	     d2.setName("С�Ƴ�");

	     Set<Dog> set=new HashSet<Dog>();
	     set.add(d1);
	     set.add(d2);
	     System.out.println(set.size());  //���Ϊ1
	     
	}

}
