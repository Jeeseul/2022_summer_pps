package firstWeek;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	import java.util.StringTokenizer;

	//class Main {
	public class A053_backjune_10828 {

	  public static int[] stack;
	  public static int size=0;
	  
	  public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    StringBuilder sb = new StringBuilder();
	    int num = Integer.parseInt(br.readLine());
	    stack = new int[num];
	    for(int i=0;i<num;i++){
	      String input = br.readLine();
	      st = new StringTokenizer(input," ");
	      switch(st.nextToken()){
	        case "push": 
	          push(Integer.parseInt(st.nextToken()));
	          break;
	        case "pop": 
	          sb.append(pop()).append("\n");
	          break;
	        case "size": 
	          sb.append(size()).append("\n");
	          break;
	        case "empty": 
	          sb.append(empty()).append("\n");
	          break;
	        case "top": 
	          sb.append(top()).append("\n");
	          break;
	      }
	    }
	    System.out.println(sb);
	    br.close();
	  }

	  public static void push(int n){
	    stack[size] = n;
	    size++;
	  } 

	  public static int pop(){
	    if(size != 0){
	      size--;
	      return stack[size];
	    }
	    else return -1;
	  } 
	  public static int top(){
	    if(size == 0) return -1;
	    else return stack[size-1];
	  } 
	  public static int empty(){
	    if(size == 0) return 1;
	    else return 0;
	  } 
	  public static int size(){
	    return size;
	  } 
	}
