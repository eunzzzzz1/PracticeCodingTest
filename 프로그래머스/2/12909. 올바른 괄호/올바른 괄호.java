import java.util.*;

class Solution {
    boolean solution(String s) {
        
        
        
        char[] arr = s.toCharArray();
        if(arr[0]==')') return false;
      
        int left = 0;
        int right = 0;
        
        for(char ch : arr) {

            if(ch=='(') {
                left = left - right;
                right = 0;
                left++;
            }
            
            if(ch==')') {
                right++;
                if(right>left) return false;
            }
        }
        
        if(left - right !=0) return false;
        
        return true;
    }
}