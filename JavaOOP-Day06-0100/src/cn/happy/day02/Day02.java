package cn.happy.day02;

import java.util.LinkedList;
import java.util.List;

public class Day02 {
  public static void main(String[] args) {
	  
	  LinkedList<String> list=new LinkedList<String>();
	  
	  list.add("Hello");
	  
	  list.add("���");
	  
	  list.add("ܽ�ؽ�");
	   
	  list.add("�绨");
	  
	  list.addFirst("������");
	  
	  list.addLast("��ΰ");
	  
	  for (String item : list) {
		System.out.println(item);
	  }
	  
	  list.remove(2);
	  System.out.println("============");
	  for (String item : list) {
			System.out.println(item);
	 }
	  
	  list.removeLast();
	  System.out.println("============");
	  System.out.println("============");
	  for (String item : list) {
			System.out.println(item);
	 }
	  
	  
  }
}
