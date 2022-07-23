package thirdweek;

import java.util.Scanner;
import java.util.Arrays;

//public class A086_backjune1755 {
class Main {
  public static void main(String[] args) {
    Main m = new Main();
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();
    String[] str = new String[high-low+1];
    int count =0;
    for(int i=low;i<=high;i++){
      str[count++] = m.toString(i);
    }
    Arrays.sort(str);
    int[] num = new int[str.length];
    for(int i=0;i<str.length;i++){
      String[] s = str[i].split(" ");
      //num[i] = Integer.parseInt(m.toInt(s));
      System.out.print(Integer.parseInt(m.toInt(s)));
      if(i!=str.length-1)
        System.out.print(" ");
      if(i%10 ==9)
        System.out.println();
    }
  }
  String toInt(String[] s){
    String result="";
    for(int i=0;i<s.length;i++){
      result+= whatInt(s[i]);
    }
    return result;
  }
  String whatInt(String s){
    if(s.equals("one")) return "1";
    else if(s.equals("two")) return "2";
    else if(s.equals("three")) return "3";
    else if(s.equals("four")) return "4";
    else if(s.equals("five")) return "5";
    else if(s.equals("six")) return "6";
    else if(s.equals("seven")) return "7";
    else if(s.equals("eight")) return "8";
    else if(s.equals("nine")) return "9";
    else return "0";
  }
  String toString(int i){
    String result = "";
    String[] temps = Integer.toString(i).split("");
    for(int j=0;j<temps.length;j++){
      result += whatNumber(temps[j]);
      if(j!=temps.length-1)
        result += " ";
    }
    return result;
  }
  String whatNumber(String s){
    if(s.equals("1")) return "one";
    else if(s.equals("2")) return "two";
    else if(s.equals("3")) return "three";
    else if(s.equals("4")) return "four";
    else if(s.equals("5")) return "five";
    else if(s.equals("6")) return "six";
    else if(s.equals("7")) return "seven";
    else if(s.equals("8")) return "eight";
    else if(s.equals("9")) return "nine";
    else return "zero";
  }
}