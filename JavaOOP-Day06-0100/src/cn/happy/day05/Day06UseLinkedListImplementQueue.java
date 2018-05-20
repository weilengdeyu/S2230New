package cn.happy.day05;

import java.util.LinkedList;

public class Day06UseLinkedListImplementQueue {
	LinkedList<String> list=new LinkedList<String>();
	public void add(String str){
		  list.addFirst(str);
	}
	
	public void remove(){
		list.removeLast();
	}
    public static void main(String[] args) {
	  
	 
    	Day06UseLinkedListImplementQueue test=new Day06UseLinkedListImplementQueue();
    	
    	test.add("abc");
    	test.add("bcd");
    	test.add("cde");
    	
    	test.remove();
    	
    	for (String value : test.list) {
			System.out.println(value);
		}
    	
    	
	  
	  
  }
  
}
