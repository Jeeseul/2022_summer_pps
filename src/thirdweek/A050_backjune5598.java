package thirdweek;

import java.util.Scanner;

public class A050_backjune5598 {

//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] inputs = new char[input.length()];
    for(int i=0;i<inputs.length;i++){
      char c = input.charAt(i);
      if((char)(c-3)>64)
        inputs[i] = (char)(c - 3);
      else
        inputs[i] = (char)(c + 23);

      System.out.print(inputs[i]);
    }
    
  }
}