// 다시풀기 시작 PM 3:09

import java.util.*;

class Solution {
    public int solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if(!stack.isEmpty() && stack.peek()==c) {
                stack.pop();
                continue;
            }
            
            stack.push(c);
        }
        
        if(stack.isEmpty()) return 1;
        
        return 0;
        
    }
}