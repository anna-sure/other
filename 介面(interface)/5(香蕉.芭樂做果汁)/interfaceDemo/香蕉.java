//2.製作class (interface add - Fruit)
package interfaceDemo;

public class 香蕉 implements Fruit {

	@Override
	public void 吃() {
		System.out.println("香味");

	}

	@Override
	public void 做冰淇淋() {
		System.out.println("香蕉冰淇淋");

	}

	@Override
	public String 做果汁() {

		return "香蕉汁";
	}

	@Override
	public String 冰冰箱() {

		return "誰偷走了香蕉";
		
	}

}
