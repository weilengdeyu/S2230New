package cn.happy.day01;

import java.util.ArrayList;
import java.util.List;

public class Day01 {

	public static void main(String[] args) {
		//01.����һ������
		List<Fruit> list=new ArrayList<Fruit>();
		
		
		
		
		
		
		//02����������ˮ��
		Fruit f1=new Fruit();
		f1.setFruitName("grape"); //����
		Fruit f2=new Fruit();
		f2.setFruitName("apple");  //ƻ��
		Fruit f3=new Fruit();
		f3.setFruitName("watermelon"); //����
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
		//03.ѡ���ӡ��� �೤ ��Ե�ˮ��
		System.out.println(list.get(0).getFruitName()); //Javaû��������
		System.out.println("after delete");
		//04.ɾ���೤������ˮ��
		list.remove(f3);
		list.remove(0);
		for (Fruit item : list) {
			System.out.println(item.getFruitName());
		}
		
		//05.��һ���೤����  ��������  �Ƿ�����ڼ�����
		Fruit f4=new Fruit();
		f4.setFruitName("����");
		list.add(0,f4);
		System.out.println("��������ݺ�=====\n");
		for (Fruit item : list) {
			System.out.println(item.getFruitName());
		}
		Fruit f5=new Fruit();
		f5.setFruitName("����");
		
		boolean hasOrNot = list.contains(f5);
		
		System.out.println(hasOrNot);
	}

}
