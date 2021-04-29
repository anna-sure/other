package day7_2;

//繼承Animal
public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("喵(打翻)");
	}
	
	
	public void 抓蟑螂() {
		System.out.println("抓到了!!");
	}
	
	
}
