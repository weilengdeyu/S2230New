package cn.happy.day04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day04 {

	public static void main(String[] args) {
		//eg.���ҵ�ȫ��      �л����񹲺͹�  KWWL     drgybn      ���ҵļ��cn
		Map<String, String>  map=new HashMap<String,String>();
		
		map.put("CN", "�л����񹲺͹�");
		map.put("USA", "��������ڹ�");
		map.put("UK", "��������");
		map.put("JP", "�ձ�");
		
		//��ʽһ��Key�ļ���
		Set<String> keySet = map.keySet();
		//������ʽ entry key   value
		for (String key :keySet ) {
			System.out.print(key+"===");
			String country = map.get(key);
			System.out.println(country);
		}
		System.out.println("===============�߹�ķָ���=============");
		//��ʽ����value���ϵķ�ʽ
		Collection<String> collection = map.values();
		for (String value : collection) {
			System.out.println(value);
		}
		
		//��ʽ������++ֵ  ------entry
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String,String> entry : entrySet) {
			System.out.println(entry.getKey()+"===="+entry.getValue());
		}
		System.out.println("==next we will print colleciton;s element use while+iterator");
		//��ʽ�ģ������� Iterator  
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			String key = iter.next();
			System.out.println(key+"===="+map.get(key));
		}
		
		//��ʽ��  ͨ��values ��ȡ������
		Iterator<String> iterValue = map.values().iterator();
		while(iterValue.hasNext()){
			String value = iterValue.next();
			System.out.println(value);
		}
		System.out.println("=================Key+Value==Entry  ��ȡ��������");
		//��ʽ����key+value
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"===="+entry.getValue());
		}
		
		//ͨ��key����value
		String country = map.get("USA");
		System.out.println(country);
		
		
		map.remove("USA");
		
		
	}

}
