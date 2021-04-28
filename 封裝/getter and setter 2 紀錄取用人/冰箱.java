package day6_2;

import day6_3.Coke;

public class 冰箱 {

	public static void main(String[] args) {
		Coke coke=new Coke();
		coke.set飲料含量(1000,"小明");
		coke.set飲料含量(coke.get飲料含量()-100,"小王");
		System.out.println(coke.get飲料含量());//output:0

	}

}
