package cn.happy.entity;

public class Day01 {
     //线程命名
	public static void main(String[] args) {
		
		Thread main = Thread.currentThread();
		//只要拥有一个线程对象，通过他的setName()对线程名称进行命名。
		main.setName("主线程");
		System.out.println("线程名称"+main.getName());

	}

}
