package day7_2;

public class MySweetHome {
	//多型。
	public static void main(String[] args) {
		// 我家裡養了兩隻動物
		//一隻是狗(小白)，一隻是貓(香蕉)。
		Animal 小白=new Dog();
		Animal 香蕉=new Cat();
		//同一個類別Animal，卻有不同的方法。
		System.out.println("小白的場合");
		小白.eat();
		System.out.println("香蕉的場合");
		香蕉.eat();
		//override 過後的結果

	}

}
