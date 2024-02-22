import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        
        for(String a : s.split(" ")) {
            if(a.equals("Z")) {
                stack.pop();
                continue;
            }
            
            stack.push(a);
        }
        
        return stack.stream().mapToInt(i -> Integer.valueOf(i)).sum();
    }
}