// 1차 PM 6:14 ~ PM 7:57... - 실패 ^-^

import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            if(check(s)) answer++;
            s = left(s);
        }
        
        return answer;
    }
    
    public String left(String s) {
        return s.substring(1) + s.charAt(0);
    }
    
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        
        for(char a : arr) {
            
            if(a=='(' || a=='{' || a=='[') {
                stack.push(a);
            } else if (!stack.isEmpty()) {
                switch(a) {
                    case ')' :
                        if(stack.peek()=='(') stack.pop();
                        break;
                    case '}' :
                        if(stack.peek()=='{') stack.pop();
                        break;
                    case ']' :
                        if(stack.peek()=='[') stack.pop();
                        break;
                }
            } else {
                stack.push(a);
            }
        }

        return stack.isEmpty();
    }
    
    
}