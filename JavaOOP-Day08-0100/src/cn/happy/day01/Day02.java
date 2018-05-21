package cn.happy.day01;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 字符流（分解的单元不再是一个一个的byte，一个一个char）读取 文本文件  1个字符=2byte
 * 
 * Java Code   DB  Data  Goes   Excel文件
 * POI导入  导出
 * JXL  导入导出
 * 人生苦短，我用Python （大数据分析和AI，蜘蛛爬虫，是Java代码）  云计算 （）     xxx.py 类似于 bat 批处理
 * 第四年 通过utils 工具 类   copy  paste  2年后 ，写通用的工具代码
 * S2结业考试： 卖钱：：：：：10块   Y2  学士后 ：1分钟满分   。entity dao service  web  ui  
 * 
 * 
 * 
 * FileReader
 * 
 * 
 * FileWriter
 * @author Happy 
 * 
 */
public class Day02 {
	public static void main(String[] args) throws Exception {
		
	    
		//readData();
		
		
		//写入文件    可以追加也可以覆盖，关键看大家对构造重载的选型
		FileWriter writer=new FileWriter("E:\\S2230好人班级.txt",true);
		writer.write("\r\nsecond line =====今天上午九点，微软在北京召开微软的人工智能大会,与会者都是大牛，他的平台中文----英文两种直播通道供用户选择----我们可以在PC和移动端通过群中链接观看视频，并且在特定的时间有进行，有彩蛋");
		writer.close();
		System.out.println("write ok");
		
		
	}

	private static void readData() throws Exception {

		FileReader reader=new  FileReader("E:\\S2230好人班级.txt");
		char[] chars=new  char[1024];
		int data=0;
		//Vector 线程安全 的    ArrayList是线程非全的   。。。。。。。Vector 
		//大家不要以后集合本身是安全的，你用这个集合去存储的数据就一定能保证线程安全。。。。。。。。。。。。
		//自己去控制
		StringBuffer sb=new StringBuffer();
		while((data=reader.read(chars))!=-1){
			//char[]      String
			String temp=new String(chars,0,data);
			sb.append(temp);
		}
		System.out.println(sb.toString());
		reader.close();
		
	}

}
