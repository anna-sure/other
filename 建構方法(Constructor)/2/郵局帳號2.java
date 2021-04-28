package bankDemo;

public class 郵局帳號2 {

	private String 存款人;
	private String 帳號;
	private long 存款金額;
	
	public 郵局帳號2() {
		//預設建構子
	}
	
	//建構方法
	public 郵局帳號2(String 存款人, String 帳號, long 存款金額) {
		set存款金額(存款金額);
		this.存款人=存款人;
		this.帳號=帳號;
	}

	public long get存款金額() {
		return 存款金額;
	}

	public void set存款金額(long 存款金額) {
		
		if(存款金額<0) {
			System.out.println("非法輸入，請重新再輸入");
		}else {
			this.存款金額 = 存款金額;
		}
		
	}

	public String get存款人() {
		return 存款人+"先生/小姐";
	}

	public String get帳號() {
		return 帳號.substring(0, 3)+"*****************";
	}
	

}
