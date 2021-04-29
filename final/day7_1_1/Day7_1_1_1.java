package day7_1.day7_1_1;

public class Day7_1_1_1 {
	public final double PI = 3.14159265358979;//定義final常數
	public int i = 50;
	protected int i2=100;
	int i3 = 150;
	private int i4 =200;

	public static void main(String[] args) {
		Day7_1_1_1 o1 = new Day7_1_1_1();
		System.out.println(o1.i);
		System.out.println(o1.i2);
		System.out.println(o1.i3);
		System.out.println(o1.i4);
		System.out.println(o1.PI);
		
//		o1.PI=100;//失敗，不能修改，因為是final
	}
}
