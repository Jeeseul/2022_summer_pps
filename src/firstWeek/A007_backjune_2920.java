package firstWeek;
	import java.util.Scanner;

	//class Main {
	public class A007_backjune_2920 {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String newInput = input.replace(" ","");
	    if(newInput.equals("12345678"))
	      System.out.println("ascending");
	    else if(newInput.equals("87654321"))
	      System.out.println("descending");
	    else
	      System.out.println("mixed");
	  }
	}
