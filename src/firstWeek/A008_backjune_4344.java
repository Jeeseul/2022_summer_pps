package firstWeek;
	import java.util.Scanner;

	//public class Main{
	public class A008_backjune_4344 {

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int repeat_num=0;
	        int[] score;
	        float percent;
	        
	        repeat_num = sc.nextInt();
	        //System.out.println("\nrepeat_num: "+repeat_num);

	        for(int i=0;i<repeat_num;i++){
	            int student_num = sc.nextInt();
	            //System.out.println("student_num: "+student_num);
	            score = new int[student_num];
	            float sum=0;
	            for(int j=0;j<student_num;j++){
	              int val = sc.nextInt();
	              score[j] = val;
	              sum += val;
	              //System.out.println("val: "+val);
	            }
	            //System.out.println("sum: "+sum);
	            float average=0;
	            average = sum / (float)student_num;
	            //System.out.println("average: "+average);
	            int num_overaverage=0;
	            for(int k=0;k<student_num;k++){
	              if(score[k]>average)
	                  num_overaverage++;
	            }
	            //System.out.println("\nnum_overaverage: "+num_overaverage);
	            percent = ((float)num_overaverage / student_num) * 100;
	            System.out.printf("%.3f%%\n",percent);
	        }

	        sc.close();
	    }
	    
	}
