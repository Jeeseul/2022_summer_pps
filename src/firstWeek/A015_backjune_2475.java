package firstWeek;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	//public class Main {
	public class A015_backjune_2475 {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			String[] num = input.split(" ");
			int[] numInt = new int[5];
			int sum=0;
			
			for(int i=0;i<5;i++) {
				numInt[i] = Integer.parseInt(num[i]);
				sum += Math.pow(numInt[i], 2);
			}
			int result = sum%10;
			System.out.println(result);
			
			
			br.close();
		}

	}
