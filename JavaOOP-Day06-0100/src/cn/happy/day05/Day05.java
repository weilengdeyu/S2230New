package cn.happy.day05;

import java.util.LinkedList;
import java.util.Queue;

public class Day05 {
  public static void main(String[] args) {
	  Queue<String> queue=new LinkedList<String>();
	  
	  
	  queue.offer("001"); //Ñ¹Õ»
	  queue.offer("002");
	  queue.offer("003");
	 
	 
	  for (String value : queue) {
		System.out.println(value);
	 }
	  
	  String poll = queue.poll();
	  String poll1 = queue.poll();
	  System.out.println("=======µ¯Õ»Ö®ºó");
	  for (String value : queue) {
			System.out.println(value);
     }
 }
}
