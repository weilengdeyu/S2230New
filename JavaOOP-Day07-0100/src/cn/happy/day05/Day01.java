package cn.happy.day05;
/**
 * �ػ��߳�  �ػ�Angela
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=2; i++) {
			System.out.println(Thread.currentThread()+"��"+i+"��");
		}
		
		Thread t1=new  Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=20; i++) {
					System.out.println(Thread.currentThread()+"��"+i+"��");
				}
			}
		});
		
		t1.setDaemon(true); //����t1��Ϊ���̵߳��ػ��̡߳�������������
		t1.start();
	}

}
