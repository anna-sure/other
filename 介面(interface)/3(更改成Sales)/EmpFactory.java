package Day7_3;

public class EmpFactory {
	public static Employee getEmployee() {
		return new Sales();//更改 成 Sales ，就不用在Comp.java一個一個改
	}
}
