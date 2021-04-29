package bankDemo;

public class Test_Bank4 {

	public static void main(String[] args) {
		郵局帳號3 某人2 = new 郵局帳號3();
		郵局帳號3 某人=new 郵局帳號3("小王","0123456789",20000);
		System.out.println(某人.get存款人());
		System.out.println(某人.get帳號());
		System.out.println(某人.get存款金額());
		某人.set存款金額(某人.get存款金額()+4545645L);
		System.out.println(某人.get存款金額());
		
		System.out.println();
		
		System.out.println(某人2.get存款人());
		System.out.println(某人2.get帳號());
		System.out.println(某人2.get存款金額());
		
		System.out.println();
		//------------------------------------		
		超級郵局帳戶 超某人 = new 超級郵局帳戶();
		System.out.println(超某人.get存款人());
		System.out.println(超某人.get帳號());
		System.out.println(超某人.get存款金額());
		
		System.out.println();
		
		System.out.println("第一次存金條");
		超某人.set金條(超某人.get金條()-9);
		System.out.println(超某人.get金條());
		
		System.out.println();
		
		System.out.println("第二次存金條");
		超某人.set金條(超某人.get金條()+5);
		System.out.println(超某人.get金條());
		//------------------------------------
		超級郵局帳戶 超某人2 = new 超級郵局帳戶("小八","0123456789",20000);
		System.out.println(超某人2.get存款人());
		System.out.println(超某人2.get帳號());
		System.out.println(超某人2.get存款金額());
		System.out.println();
		
		System.out.println("第一次存金條");
		超某人2.set金條(超某人2.get金條()-9);
		System.out.println(超某人2.get金條());
		
		System.out.println();
		
		System.out.println("第二次存金條");
		超某人2.set金條(超某人2.get金條()+5);
		System.out.println(超某人2.get金條());

		System.out.println();
		//------------------------------------
		//不帶金條
		超級郵局帳戶 超某人3=new 超級郵局帳戶("小七","08787878",1546);
		System.out.println(超某人3.get存款人());
		System.out.println(超某人3.get金條());//使用一堆this 跟 super讓假如使用者沒傳入金條參數就自動帶。
		
		
		
	}

}
