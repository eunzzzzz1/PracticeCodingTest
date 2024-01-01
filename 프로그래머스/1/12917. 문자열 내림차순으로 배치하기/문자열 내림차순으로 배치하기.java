// 시작 PM 9:13

import java.util.*;

class Solution {
    public String solution(String s) {
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        return new StringBuffer(new String(arr)).reverse().toString();
    }
}