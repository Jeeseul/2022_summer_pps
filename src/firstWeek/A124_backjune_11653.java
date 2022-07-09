package firstWeek;
	import java.util.Scanner;

	//class Main {
	public class A124_backjune_11653 {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    if(input != 1){
	      for(int i =2;i<=input;i++){
	        do{
	          if(input%i==0){
	            input = input/i;
	            System.out.println(i);
	          }
	        }while(input%i==0);
	      }
	    }
	  }
	}