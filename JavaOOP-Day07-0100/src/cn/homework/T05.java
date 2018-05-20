package cn.homework;

public class T05 implements Runnable{
	public static void main(String[] args) {
		Runnable tt=new T05();
		Thread t1=new Thread(tt);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("ฤ๚บร");
	}

}
