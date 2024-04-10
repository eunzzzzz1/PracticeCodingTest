import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        
        Stack<Long> stack = new Stack<>();
           
        for(long i=left; i<=right; i++) {
            if(i/n >= i%n) stack.push(i/n+1);
            else stack.push((i/n+1)+(i%n-i/n));
        }
        
        return stack.stream().mapToInt(i -> i.intValue()).toArray();
    }
}