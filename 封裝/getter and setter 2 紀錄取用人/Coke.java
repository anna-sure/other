package day6_3;

public class Coke {
	private int 飲料含量;

	public int get飲料含量() {
		return 飲料含量;
	}

	public void set飲料含量(int 飲料含量,String 取用人) {
		this.飲料含量 = 飲料含量;
		System.out.println("舍監紀錄是"+取用人+"改變了飲料含量");
	}
	
}
