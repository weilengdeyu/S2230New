package cn.happy.day04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day04 {

	public static void main(String[] args) {
		//eg.国家的全称      中华人民共和国  KWWL     drgybn      国家的简称cn
		Map<String, String>  map=new HashMap<String,String>();
		
		map.put("CN", "中华人民共和国");
		map.put("USA", "美利坚合众国");
		map.put("UK", "联合王国");
		map.put("JP", "日本");
		
		//方式一：Key的集合
		Set<String> keySet = map.keySet();
		//遍历方式 entry key   value
		for (String key :keySet ) {
			System.out.print(key+"===");
			String country = map.get(key);
			System.out.println(country);
		}
		System.out.println("===============高贵的分割线=============");
		//方式二：value集合的方式
		Collection<String> collection = map.values();
		for (String value : collection) {
			System.out.println(value);
		}
		
		//方式三：键++值  ------entry
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String,String> entry : entrySet) {
			System.out.println(entry.getKey()+"===="+entry.getValue());
		}
		System.out.println("==next we will print colleciton;s element use while+iterator");
		//方式四：迭代器 Iterator  
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			String key = iter.next();
			System.out.println(key+"===="+map.get(key));
		}
		
		//方式五  通过values 获取迭代器
		Iterator<String> iterValue = map.values().iterator();
		while(iterValue.hasNext()){
			String value = iterValue.next();
			System.out.println(value);
		}
		System.out.println("=================Key+Value==Entry  获取迭代器，");
		//方式六：key+value
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"===="+entry.getValue());
		}
		
		//通过key锁定value
		String country = map.get("USA");
		System.out.println(country);
		
		
		map.remove("USA");
		
		
	}

}
