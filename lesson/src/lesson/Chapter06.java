package lesson;

public class Chapter06 {
	public static void main(String[] args) {
		int val = 2 + 5;
		boolean bool = (val == 50);
		System.out.println(val);
		val++;
		System.out.println(val);
		val *= 5;
		System.out.println(val);
		System.out.println(bool);
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}
