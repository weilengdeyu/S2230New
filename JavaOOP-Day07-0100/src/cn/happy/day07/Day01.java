package cn.happy.day07;
/**
 * ��ӡ������
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//�����̣߳�һ���߳�ƴ����ӡ ��΢����� ��
        //����һ���߳� ƴ����ӡ  �����ˡ�
        //���ִ�λ�������ν����������  ������㣬�������Ҫ��  ͬ������� 
		//1��������һ̨��ӡ��
		Printer printer=new Printer();
		
		//�߳�1
		MyThread t1=new MyThread();
		t1.printer=printer;
		t1.start();
		
		//�߳�2
		MyThreadTwo t2=new MyThreadTwo();
		t2.printer=printer;
		t2.start();
		
		
		
		
		
		
	}

}
