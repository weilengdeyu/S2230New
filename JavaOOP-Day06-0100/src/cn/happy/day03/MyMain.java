package cn.happy.day03;

public class MyMain {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		
		if (s1.equals(s2)) {
			System.out.println("true");
		}

		if (s1==(s2)) {
			System.out.println("==");
		}
	}

}