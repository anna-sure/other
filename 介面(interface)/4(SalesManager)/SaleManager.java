package Day7_3;


public class SaleManager implements Manager, Sales{
	@Override
	public void 銷售() {
		System.out.println("推銷東西");
	}
	
	@Override
	public void work() {
		this.規劃();
	}
	
	@Override
	public void 規劃() {
		System.out.println("正在進行銷售規劃");
	}
	
}
	

