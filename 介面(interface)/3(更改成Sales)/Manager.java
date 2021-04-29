package Day7_3;

//注意這裡不是用繼承，而是用實作 Employee
public class Manager implements Employee {

	@Override
	public void work() {
		System.out.println("用愛發電");

	}

}
