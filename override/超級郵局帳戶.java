package bankDemo;

public class 超級郵局帳戶 extends 郵局帳號3 {
	private int 金條=1;

	//假如參數有金條，則修改金條屬性值
	public 超級郵局帳戶(String 存款人, String 帳號, long 存款金額,int 金條) {
		super(存款人, 帳號, 存款金額);
		//就像是下行程式碼一樣，找到屬性丟參數，用super直接參考副類別
		this.金條=金條;
	}

	//假如參數沒金條，則金條屬性設置為5
	public 超級郵局帳戶(String 存款人, String 帳號, long 存款金額) {
		this(存款人, 帳號, 存款金額,5);
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
	
	//覆寫方法--------------------------------------
	//右鍵→source→Override/Implement Methods
	@Override
	public String get存款人() {
		//讓存款人姓名前加上一個"貴"字
		return "貴"+super.get存款人();
		//用super呼叫父類別
	}

	//這是註釋:沒意義，不會影響程式執行
	
	@Override //這是註解，不能修改，有功用的
	public long get存款金額() {
		// TODO Auto-generated method stub
		return super.get存款金額();
	}

	@Override
	public void set存款金額(long 存款金額) {
		// TODO Auto-generated method stub
		super.set存款金額(存款金額);
	}

	@Override
	public String get帳號() {
		// TODO Auto-generated method stub
		return super.get帳號();
	}
	
}