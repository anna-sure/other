package day7_1.day7_1_2;

import day7_1.day7_1_1.Day7_1_1_1;

public class Day7_1_1_3 extends Day7_1_1_1 {

	public static void main(String[] args) {
		Day7_1_1_1 o1 = new Day7_1_1_1();
		Day7_1_1_3 o2 = new Day7_1_1_3();
		System.out.println(o1.i);
		o2.name();//利用自身物件呼叫自身方法。因為super無法在此範圍內使用，所以需要額外寫個方法。
		System.out.println(o2.i2);
		System.out.println(o2.i);
//		System.out.println(o1.i3);//看不到
//		System.out.println(o1.i4);//看不到
	}
	
	public void name() {
		System.out.println(super.i2);
	//	System.out.println(super.i3);//看不到
	}

}

	
