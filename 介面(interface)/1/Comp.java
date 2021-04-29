package Day7_3;

public class Comp {

	public static void main(String[] args) {
		Employee emp1=new Sales();
		emp1.work();
		//在維護程式碼的時候可以減少變動的地方
		Employee emp2=new Manager();
		emp2.work();
		
	}

}
