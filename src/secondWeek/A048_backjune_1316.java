package secondWeek;

import java.util.Scanner;
import java.util.Arrays;

public class A048_backjune_1316 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count=0;
    for(int i=0;i<num;i++){
      String input = sc.next();
      String[] inputs = input.split("");

      for(int j=0;j<inputs.length;j++){
        if(j==inputs.length-1){
          count++;
        }else if(inputs[j].equals(inputs[j+1])) {
          if(inputs.length==2){}
          inputs[j] = "";
        }else {
          String temp = inputs[j];
          inputs[j] = "";
         if(Arrays.asList(inputs).indexOf(temp)-j>=1)
           break;
        }
      }
    }
    System.out.println(count);
  }
}