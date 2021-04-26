import javax.swing.JOptionPane;

public class lab01 {

	public static void main(String[] args) {
		
		int run=10;
		int runCount=0;
		int[] arr= new int[run];
		while(runCount<run) {
			String str = JOptionPane.showInputDialog("請輸入數字");
			//System.out.print(str+",");
			arr[runCount]=Integer.valueOf(str);
			runCount+=1;
			
		}
		System.out.println("使用者輸入:");
		for(int i =0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		System.out.println("----------排序過程-----------");

		//-------------------------------------
		for(int i =arr.length-1 ; i>=1;i-- ) {
			boolean safe=false;//check排好了沒
			
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					safe=true;
				}
				
						
			}
			for(int x =0 ; x<arr.length ; x++) {
				System.out.print(arr[x]+",");//印出過程
			}
			System.out.println();
			if (!safe) {
				//排好了，提早跳出迴圈
				break;
			}
		}
		System.out.println("由小到大:");
		for(int i =0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
	}

}
