//2.新增第二個類別，也是要連結interface add- Fruit
package interfaceDemo;

public class 芭樂 implements Fruit {

	@Override
	public void 吃() {

		System.out.println("拉肚子");
	}

	@Override
	public void 做冰淇淋() {
		System.out.println("在廁所裡");

	}

	@Override
	public String 做果汁() {
		
		return "芭樂汁";
	}

	@Override
	public String 冰冰箱() {
		
		return "誰偷走了芭樂";
	}

}
