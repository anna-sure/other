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
		((Dog)小白).握手();//使用強制轉型突破下行程式的限制 
//		小白.握手();//如果Animal沒有寫這個方法，就無法使用
//		((Cat)小白).抓蟑螂();//不能使用此方法，小白不是Cat。除非他們有關係，否則不能強制轉型。
		System.out.println();
		
		System.out.println("香蕉的場合");
		香蕉.eat();
		//override 過後的結果
		
		((Cat)香蕉).抓蟑螂();

	}

}
