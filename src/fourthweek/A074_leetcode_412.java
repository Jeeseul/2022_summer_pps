package fourthweek;

import java.util.ArrayList;
import java.util.List;

public class A074_leetcode_412 {

//class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0&&i%3==0) list.add("FizzBuzz");
            else if(i%3==0) list.add("Fizz");
            else if(i%5==0) list.add("Buzz");
            else list.add(Integer.toString(i));
        }
        return list;
    }
}