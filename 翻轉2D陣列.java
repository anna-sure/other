
public class 翻轉2D陣列 {

	public static void main(String[] args) {
		System.out.println("--------建立一個隨機2D array---------");
		int d1 = (int)(Math.random()*5+1);//控制在1-5列
		int d2 = (int)(Math.random()*8+1);//控制在1-8欄
		
		
		int[][]  arr2  = new int[d1][d2];
		//資料型別 變數名稱   //資料長度，這裡可寫可不寫
		for(int i =0 ;i < arr2.length;i++) {
			for(int j = 0 ; j<arr2[i].length;j++) {
				arr2[i][j]=(int)(Math.random()*100+1);
				System.out.print(arr2[i][j]+",");//隨機抽取值
			}
			System.out.println();
			
		}
		System.out.println(String.format("%d 列, %d 欄", d1,d2));
		
		System.out.println("--------翻轉2D array---------");
		
		int rowLn=arr2.length;
		int colLn=arr2[0].length;
		int[][] arr3=new int[colLn][rowLn];
		for(int i = 0 ; i <arr2.length;i++) {
			for(int j =0 ; j<arr2[0].length ; j++) {
				arr3[j][i]=arr2[i][j];
				
			}

		}
		
		for(int i=0;i<arr3.length;i++) {
			for(int j =0 ; j<arr3[0].length; j++) {
				System.out.print(arr3[i][j]+",");
			}
			System.out.println();
		}
		
	}

}
