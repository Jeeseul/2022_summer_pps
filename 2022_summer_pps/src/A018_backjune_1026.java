	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.Comparator;

	//public class Main {
	public class A018_backjune_1026 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String StNumCount = br.readLine();
			int numCount = Integer.parseInt(StNumCount);
			String A = br.readLine();
			String B = br.readLine();
			
			String[] splitA = A.split(" ");
			String[] splitB = B.split(" ");
			int[] intA = new int[numCount];
			Integer[] intB = new Integer[numCount];
			for(int i=0;i<numCount;i++) {
				intA[i] = Integer.parseInt(splitA[i]);
				intB[i] = Integer.parseInt(splitB[i]);
			}
			Arrays.sort(intA);
			
			Arrays.sort(intB,Comparator.reverseOrder());
			
			int sum=0;
			for(int k=0;k<numCount;k++) {
				sum += intA[k] * intB[k];
			}
			System.out.println(sum);
			
			br.close();
		}

	}

