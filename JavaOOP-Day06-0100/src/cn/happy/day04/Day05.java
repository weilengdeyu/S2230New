package cn.happy.day04;

import java.util.HashMap;
import java.util.Map;

public class Day05 {

	public static void main(String[] args) {
		//����Map  key��Ψһ��
		Map<String, String>  map=new HashMap<String,String>();
		map.put(null, "abc");
		map.put(null, "bcd");
		System.out.println(map.size());
		

	}

}
