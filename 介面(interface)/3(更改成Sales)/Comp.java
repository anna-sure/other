package Day7_3;

public class Comp {

	public static void main(String[] args) {
		Employee emp1=EmpFactory.getEmployee();
		//產生員工(招募員工)
		//在維護十可以減少變動的地方
		emp1.work();
		
	}

}
