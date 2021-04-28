package day6_2;

import day6_3.Coke;

public class 冰箱 {

	public static void main(String[] args) {
		Coke coke=new Coke();
		coke.飲料含量=100;
		coke.飲料含量=coke.飲料含量-100;
		System.out.println(coke.飲料含量);

	}

}
