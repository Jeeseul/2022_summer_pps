package fourthweek;

import java.util.Scanner;
import java.util.Arrays;

public class A084_backjune_11656 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] result= new String[input.length()];
    for(int i=0;i<input.length();i++){
      result[i] = input.substring(i,input.length());
    }
    Arrays.sort(result);
    for(int j=0;j<result.length;j++){
      System.out.println(result[j]);
    }
  }
}