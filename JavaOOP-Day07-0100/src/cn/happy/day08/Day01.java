package cn.happy.day08;
/**
 * ģ�⳵վ������Ʊ
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//��վ��N������ ��ÿ�����ڶ����Գ��۳�Ʊ�����������������������ĸ������۳�Ʊ��ʣ��Ʊ��
		//������١�
		//  �ö��߳�ģ������Ʊ���ڣ���֤ÿ��Ʊֻ������һ�Σ������ظ����ۣ��������ڲ�������ͬһ��Ʊ��
		//  ���ñ�֤��������������ɺ���ֹ��Ʊ�����ܳ������۸���Ʊ�����
		
		
		Site site1=new Site();
		Thread t1=new Thread(site1);
		t1.setName("1�Ŵ���");
		t1.start();
		
		Thread t2=new Thread(site1);
		t2.setName("2�� ����");
        t2.start();
		
		Thread t3=new Thread(site1);
		t3.setName("3�Ŵ���");
		t3.start();

	}

}
