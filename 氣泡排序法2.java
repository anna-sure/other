import javax.swing.JOptionPane;

public class 氣泡排序法2 {

	public static void main(String[] args) {
		int run = 5;//看要排列幾個，也就是讓使用者輸入幾個數字
		int runCount=1;
		
		int[] arr = new int[run];
		
		System.out.println("輸出使用者輸入的數字:");
		while(runCount<=run) {
			String str = JOptionPane.showInputDialog("輸入數字");
			arr[runCount-1]=Integer.parseInt(str);
			runCount+=1;
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		System.out.println("由大到小排列:");
		for(int i =0 ; i<(arr.length-1) ; i++ ) {
			for(int j=0;j<(arr.length-1-i);j++) {
				if(arr[j]<arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		
		System.out.println("由小到大排列:");
		for(int i =0 ; i<(arr.length-1) ; i++ ) {
			for(int j=0;j<(arr.length-1-i);j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
	}

}
