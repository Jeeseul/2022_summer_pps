package firstWeek;
	import java.util.Scanner;

	//class Main {
	public class A021_backjune_2010 {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int result=0;
	    
	    for(int i=0;i<num;i++){
	      int tap = sc.nextInt();
	      if(i == num-1) result += tap;
	      else result += (tap-1);
	    }
	    System.out.println(result);
	  }
	}
