package cn.happy.day08;
/**
 * 模拟车站窗口售票
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//车站有N个窗口 ，每个窗口都可以出售车票。。。。。。。但是无论哪个窗口售出票后，剩余票数
		//都会减少。
		//  用多线程模拟多个售票窗口，保证每张票只能销售一次（不能重复销售，两个窗口不能销售同一张票）
		//  还得保证：：：：销售完成后，终止售票，不能出现销售负数票的情况
		
		
		Site site1=new Site();
		Thread t1=new Thread(site1);
		t1.setName("1号窗口");
		t1.start();
		
		Thread t2=new Thread(site1);
		t2.setName("2号 窗口");
        t2.start();
		
		Thread t3=new Thread(site1);
		t3.setName("3号窗口");
		t3.start();

	}

}
