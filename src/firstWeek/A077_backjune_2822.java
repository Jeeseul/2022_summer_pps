package firstWeek;
	import java.util.Scanner;
	import java.util.Arrays;

	//class Main {
	public class A077_backjune_2822 {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] pro = new int[8];
	    int[] copy = new int[8];
	    for(int i=0;i<8;i++){
	      pro[i]= sc.nextInt();
	      copy[i] = pro[i]; 
	    }
	    Arrays.sort(copy);

	    int sum =0;
	    int size =0;
	    int[] numbers = new int[5];
	    for(int i=7;i>2;i--){
	      sum += copy[i];
	      for(int j=0;j<8;j++){
	        if(copy[i] == pro[j]) 
	          numbers[size++] = j+1;
	      }
	    }
	    Arrays.sort(numbers);
	    System.out.println(sum);
	    for(int k =0; k<5;k++){
	      System.out.print(numbers[k]+" ");
	    }
	  }
	}