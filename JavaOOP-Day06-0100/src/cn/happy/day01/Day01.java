package cn.happy.day01;

import java.util.ArrayList;
import java.util.List;

public class Day01 {

	public static void main(String[] args) {
		//01.构建一个容器
		List<Fruit> list=new ArrayList<Fruit>();
		
		
		
		
		
		
		//02。踢入三种水果
		Fruit f1=new Fruit();
		f1.setFruitName("grape"); //葡萄
		Fruit f2=new Fruit();
		f2.setFruitName("apple");  //苹果
		Fruit f3=new Fruit();
		f3.setFruitName("watermelon"); //西瓜
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
		//03.选择打印输出 班长 最爱吃的水果
		System.out.println(list.get(0).getFruitName()); //Java没有索引器
		System.out.println("after delete");
		//04.删除班长不爱吃水果
		list.remove(f3);
		list.remove(0);
		for (Fruit item : list) {
			System.out.println(item.getFruitName());
		}
		
		//05.看一个班长查找  ”榴莲“  是否存在于集合中
		Fruit f4=new Fruit();
		f4.setFruitName("榴莲");
		list.add(0,f4);
		System.out.println("添加新内容后=====\n");
		for (Fruit item : list) {
			System.out.println(item.getFruitName());
		}
		Fruit f5=new Fruit();
		f5.setFruitName("榴莲");
		
		boolean hasOrNot = list.contains(f5);
		
		System.out.println(hasOrNot);
	}

}
