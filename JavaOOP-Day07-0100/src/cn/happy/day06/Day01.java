package cn.happy.day06;
/**
 * �̵߳����� yield
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//����.NET���    Webservice wsdl �ĵ� soapЭ��  ��
		//
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("�߳�A"+i);
				}
			}
		});

		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("�߳�B"+i);
					if(i==3){
						System.out.println("�̵߳�����");
						Thread.yield();	  //t1.join();;;;t1ǿ�Ƽ��뵽t2��t1ִ����ɣ���ִ��t2
						
					}
				}
			}
		});
		t2.start();
		t1.start();
		
		
		
		
	}

}
