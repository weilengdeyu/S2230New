package cn.happy.entity;
/**
 * �̵߳�����ʵ�ַ���  �̳�Thread    ʵ��Runnable
 * @author Happy
 *
 */
public class Day02 {
  
	public static void main(String[] args) {

		MyThread t1=new MyThread();
		t1.start();//run�����Ǹ�jvm���ȣ� ����Ա����start
		
		
		//�����滻ԭ��
		Runnable temp=new MyThreadTwo();
		
		Thread t2=new Thread(temp);
		
		t2.start();
		
		

	}

}
