package shubham.util;

public class Main {
	public static void main(String[] args) {
		
		MyArrayList al = new MyArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		al.add(2, "Shubham");
		
		System.out.println(al);
		System.out.println(al.size());
		al.add(6, "Shingate");
		System.out.println(al);
	}
}
