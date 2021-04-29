package bankDemo;

public class 超級郵局帳戶 extends 郵局帳號3 {
	private int 金條=1;

	public 超級郵局帳戶(String 存款人, String 帳號, long 存款金額) {
		super(存款人, 帳號, 存款金額);
		
	}
	
	//右鍵→source→generate constructor from superclass
	
	public 超級郵局帳戶() {//利用父類別去建立子類別的建構方法
		super();//父類別=>建構方法
	}
	

//------------create getter and setter------------
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
