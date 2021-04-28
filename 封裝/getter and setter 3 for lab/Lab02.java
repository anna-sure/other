package day6_3;

public class Lab02 {

	private int hight;
	private double weight;
	//右鍵→source→Generate getters and setters
	public int gethight() {
		return hight;
	}

	public void sethight(int hight) {
		this.hight=hight;//user輸入
		
		if (this.hight>200 || this.hight<100) {
			System.out.println("高度錯誤，重置150");
			this.hight=150;//高度錯誤後，重置
		}
		
		
	}
	//----------
	public double getweight() {
		return weight;
	}

	public void setweight(double weight) {
		this.weight=weight;//user輸入
			
		
	}


}
