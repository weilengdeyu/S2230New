package cn.happy.entity;

public class Day01 {
     //�߳�����
	public static void main(String[] args) {
		
		Thread main = Thread.currentThread();
		//ֻҪӵ��һ���̶߳���ͨ������setName()���߳����ƽ���������
		main.setName("���߳�");
		System.out.println("�߳�����"+main.getName());

	}

}
