package Day7_3;

public class EmpFactory {
	private static int salesCount=9;
	private static int salesManagerCount=2;
	
	public static Sales getSales() {
		if(salesCount>0) {
			salesCount=salesCount-1;
			System.out.println("派出一個sales");
			return new SalesImpl();
		} else if (salesManagerCount>0) {
			salesManagerCount=salesManagerCount-1;
			System.out.println("派出一個salesManager");//sales派完就派salesmanager
			return new SaleManager();
		} else {
			System.out.println("沒有銷售員了");
			return null;
		}
		
	}
}
