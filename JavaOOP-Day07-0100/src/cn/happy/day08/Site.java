package cn.happy.day08;
/**
 * ��վ  
 * @author Happy
 *
 */
public class Site implements Runnable {
     //��Ϣ ����վ ά��ʣ��Ʊ��
	 private int count=10;//ʣ��Ʊ��
	 private int num=0; //���۵ĵڼ���Ʊ
	
     @Override
	 public void run() {
		 while(count>0){  //����ʣ���Ʊ   //2
			 synchronized (this) {
				 if(count<=0){
					 break;
				 }
				 count--;
				 num++;
				 System.out.println("�̣߳�"+Thread.currentThread().getName()+"�������۵�"+num+"��Ʊ��ʣ��Ʊ��Ϊ"+count);
				
			}
		 }
	 }
     /*public boolean sale(){
    	 synchronized (this) {
			 if(count<=0){
				 return false;
			 }
			 count--;
			 num++;
			 System.out.println("�̣߳�"+Thread.currentThread().getName()+"�������۵�"+num+"��Ʊ��ʣ��Ʊ��Ϊ"+count);
			 return true;
		}
     }*/
} 
