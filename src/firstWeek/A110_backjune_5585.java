package firstWeek;
import java.io.IOException;
		import java.util.Scanner;

		//public class Main {
		public class A110_backjune_5585 {

			public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int count =0;
				int pay = 0;
				do{
					pay = sc.nextInt();
				}while(pay<1||pay>=1000);
				
				int remain = 1000 - pay;
				while(remain != 0) {
					//System.out.println(remain);
					if(remain>=500) {
						remain -= 500;
						count++;
					}
					else if(remain >= 100) {
						count += remain/100;
						remain %= 100;
					}
					else if(remain >= 50) {
						count += remain/50;
						remain %= 50;
					}
					else if(remain >= 10) {
						count += remain/10;
						remain %= 10;
					}
					else if(remain >= 5) {
						count += remain/5;
						remain %= 5;
					}
					else if(remain >= 1) {
						count += remain;
						remain %= 1;
					}
				}
				System.out.println(count);
				sc.close();
			}

		}
