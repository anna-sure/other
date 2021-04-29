package Day7_3;

public class EmpFactory {
	public static Employee getEmployee() {
		return new Manager();//回傳 new 一個Manager Object
	}
}
