
public class Arraysdemo {
	public static void main(String[] args) {
		int [] ar= {10,20,30,40,50};
		for (int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		for (int i:ar) {
			System.out.println(i);
		}
		
		int[][] jag= {{1,2,3},{4,5,6,7},{8,9}};
		
		for (int[] i :jag) {
			for (int j: i) {
				System.out.printf("%-4d",j);
			}
			System.out.println();
		}
		//sort this array
		int [] mess= {3,5,2,4,1};
		for(int i=0;i<mess.length;i++) {
			for(int j=i+1;j<mess.length;j++) {
				if (i>j) {
					int temp=i;
					i=j;
					j=temp;
				}
			}
		}
		
		for(int a:mess) {
			System.out.println(a);
		}
		
		//String array to sort
//		String fruits="Kiwi-Cherry-Banana-Apple-Fig-Grapes";
//		String [] arrfruit=fruits.split(fruits);
//		for (String fruit: arrfruit) {
//			System.out.println();
//		}
	}
	
	
}
