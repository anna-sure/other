package bankDemo;

public class 郵局帳號 {

	private String 存款人="小王";
	private String 帳號 = "012345678900000";
	
	private long 存款金額=100000000000000000L;

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
