package secondWeek;

import java.util.Scanner;

public class A126_backjune_1065 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int count=0;

    if(input<100) count = input;
    else{
      count = 99;
      for(int i=100;i<=input;i++){
        char[] temp = Integer.toString(i).toCharArray();
        if((temp[1]-temp[0]) == (temp[2]-temp[1])) count++;
      }
    }
    
    System.out.println(count);
  }
}