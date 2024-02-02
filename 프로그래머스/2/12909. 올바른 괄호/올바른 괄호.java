// 시작 PM 7:37
// 1차 PM 8:15
// 2차 PM 8:26
// 3차 PM 8:37 - 시간초과
// 4차 PM 8:40 - 시간초과

import java.util.*;

class Solution {
    boolean solution(String s) {
        
        if(s.startsWith(")")) return false;
        
        char[] arr = s.toCharArray();
        Stack<Character> charStack = new Stack<>();
        
        for(char ch : arr) {
            if(ch=='(') charStack.push('(');
            else if(!charStack.isEmpty() && ch==')') charStack.pop();
            else return false;
        }
        
        if(!charStack.isEmpty()) return false;
        
        return true;
    }
}