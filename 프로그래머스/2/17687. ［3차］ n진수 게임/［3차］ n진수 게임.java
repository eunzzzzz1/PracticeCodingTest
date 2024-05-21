import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        
        loop : while(true) {
            char[] arr = Integer.toString(i, n).toCharArray();
            
            for(char a : arr) {
                stack.push(a);
                if(stack.size()==p) sb.append(a);
                if(stack.size()==m) stack.clear();
                if(sb.length()==t) break loop;
            }
            
            i++;
        }
        
        return sb.toString().toUpperCase();
    }
}