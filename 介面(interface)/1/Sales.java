package Day7_3;

public class Sales implements Employee {
//類別只能繼承一個類別(class)。可是一個類別可以實做很多個介面。
	@Override
	public void work() {
		System.out.println("推銷產品，傳遞夢想");
	}

}
