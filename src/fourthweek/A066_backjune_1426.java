package fourthweek;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class A066_backjune_1426 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] arr = input.split("");
    Arrays.sort(arr,Collections.reverseOrder());
    String temp="";
    for(int i=0;i<arr.length;i++){
      temp += arr[i];
    }
    
    System.out.println(temp);
  }
}