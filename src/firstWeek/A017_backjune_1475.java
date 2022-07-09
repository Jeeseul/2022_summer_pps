package firstWeek;
	import java.io.*;

	//class Main {
	public class A017_backjune_1475 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String roomNum = br.readLine();
			String[] splitRoomNum = roomNum.split("");
			int[] countNum =  {0,0,0,0,0,0,0,0,0,0};
			int result=0;
			
			for(String num : splitRoomNum) {
				int tempNum = Integer.parseInt(num);
				countNum[tempNum] += 1;
			}
			
			result = (countNum[6]+countNum[9])/2;
			if((countNum[6]+countNum[9])%2!=0) result++;
			for(int i=0;i<9;i++) {
				if(i==6 || i==9) continue;
				else if(countNum[i] > result) result = countNum[i];
			}
			
			System.out.println(result);
			br.close();
		}
	}

	/*
	 * 1. 방 호수를 입력받는다.
	 * 2. 방 호수를 split 하여 각 숫자의 갯수를 센다.
	 * 3. 6,9의 개수를 합하여 /2를 하여 세트의 기본 개수로 세팅한다. 
	 * 4. 6,9를 제외한 숫자 중에 가장 큰 숫자를 세트의 개수로 센다.
	 * 5. 3번과 4번의 결과를 비교하여 큰 숫자를 세트의 최종 개수로 정한다. 
	 */
