	import java.util.Scanner;

	//class Main {
		public class A045_backjune_1157 {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] count = new int[26];
	    String str = sc.nextLine();
	    for(int i=0;i<str.length();i++){
	      char temp = str.charAt(i);
	      if(temp>='a'){//str.charAt(i)
	        count[temp-'a']++;
	      }else{//대문자
	        count[temp-'A']++;
	      }
	    }

	    int max=0;
	    char result=str.charAt(0);
	    for(int i =0;i<26;i++){
	      if(max==count[i])
	        result = '?';
	      else if(max<count[i]) {
	        max = count[i];
	        result = (char)(i+65);//+'A';
	      }
	    }
	    
	    System.out.println(result);
	  }
	}