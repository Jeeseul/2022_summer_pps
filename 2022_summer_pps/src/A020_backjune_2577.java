	import java.util.Scanner;

	//public class Main {
	public class A020_backjune_2577 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] count = new int[10];
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int result = A*B*C;
			String stringResult = Integer.toString(result);
			String[] splitNum = stringResult.split("");
			for(String s:splitNum) {
				int num = Integer.parseInt(s);
				count[num]++;
			}
			for(int i=0;i<count.length;i++) {
				System.out.println(count[i]);
			}
		}

	}