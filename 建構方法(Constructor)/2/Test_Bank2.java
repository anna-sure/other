package bankDemo;

public class Test_Bank2 {

	public static void main(String[] args) {
		郵局帳號2 某人=new 郵局帳號2("小王","0123456789",20000);
		System.out.println(某人.get存款人());
		System.out.println(某人.get帳號());
		System.out.println(某人.get存款金額());
		某人.set存款金額(某人.get存款金額()+4545645L);
		System.out.println(某人.get存款金額());
	}
}


