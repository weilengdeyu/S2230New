package cn.happy.day08;
/**
 * 车站  
 * @author Happy
 *
 */
public class Site implements Runnable {
     //信息 ：车站 维护剩余票数
	 private int count=10;//剩余票数
	 private int num=0; //销售的第几张票
	
     @Override
	 public void run() {
		 while(count>0){  //还有剩余的票   //2
			 synchronized (this) {
				 if(count<=0){
					 break;
				 }
				 count--;
				 num++;
				 System.out.println("线程："+Thread.currentThread().getName()+"正在销售第"+num+"张票，剩余票数为"+count);
				
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
			 System.out.println("线程："+Thread.currentThread().getName()+"正在销售第"+num+"张票，剩余票数为"+count);
			 return true;
		}
     }*/
} 
