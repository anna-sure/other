package bankDemo;

public class 超級郵局帳戶 extends 郵局帳號3 {
	private int 金條=1;

	public int get金條() {
		return 金條;
	}

	public void set金條(int 金條) {
		if (金條 <= 0) {
			System.out.println("金條不能為負");
		}else {
			this.金條 = 金條;
		}
		
	}
	
}
