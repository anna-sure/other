package interfaceDemo;

public class 男生宿舍 {

	public static void main(String[] args) {
		
		//宣告出一個芭樂，名稱叫做bala
		Fruit bala = new 芭樂();
		
		//備註:如果使用 
		//芭樂 bala = new 芭樂();
		//當new 芭樂() ， 改成new 香蕉()時就會產生error。
		//使用Fruit作為 資料型態  去 宣告，則正常運作
		//因為 香蕉.java 與 芭樂.java 都有連接interface add - Fruit
		//所以Fruit底下兩者皆可以用
		
		//宣告出一個香蕉，名稱叫做banana
		Fruit banana = new 香蕉();
		
		
		//--------------使用-------------------
		bala.做冰淇淋();
		bala.吃();
		System.out.println(bala.做果汁());
		System.out.println(bala.冰冰箱());
		
		System.out.println();
		
		banana.做冰淇淋();
		banana.吃();
		System.out.println(banana.做果汁());
		System.out.println(banana.冰冰箱());
		//--------------使用-------------------
		
	}

}
