package cn.happy.day07;

/**
 * ��ӡ��
 * 
 * @author Happy
 *
 */
public class Printer {

	
	//��ҪObject����   ������    �������͵�ʵ��
	Object obj=new Object();
	public  void print1(){
	   for (int i =1; i <=50; i++) {
		    synchronized (this) {
			      System.out.print("΢");
				  System.out.print("��");
				  System.out.print("��");
				  System.out.print("��");
				  System.out.println("");  
	    	}
		
	   }
   }

	public  void print2() {
		for (int i = 1; i <= 50; i++) {
			synchronized (this) {
				System.out.print("��");
				System.out.print("��");
				System.out.println("");
		   }
		}
	}
}
