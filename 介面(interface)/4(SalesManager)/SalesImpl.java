package Day7_3;

public class SalesImpl implements Sales {

	@Override
	public void work() {
		this.銷售();
	}
	
	@Override
	public void 銷售() {
		System.out.println("正在推銷東西");
	}
	
}
