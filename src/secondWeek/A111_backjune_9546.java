package secondWeek;

	import java.util.Scanner;

	public class A111_backjune_9546 {
	//class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int[] stops = new int[num];
	     
	    for(int i=0;i<num;i++){
	      int stop = sc.nextInt();
	      
	      double person=0;
	      for(int j=0;j<stop;j++){
	        person = person + 0.5;
	        person = person*2;
	      }
	      stops[i] = (int)person;
	    }
	    for(int a:stops){
	      System.out.println(a);
	    }
	  }
	}