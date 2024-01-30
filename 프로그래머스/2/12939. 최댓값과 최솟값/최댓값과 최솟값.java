// 시작 PM 2:12
// 1차 PM 2:18

import java.util.*;

class Solution {
    public String solution(String s) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : s.split(" ")) {
            max = Math.max(max, Integer.parseInt(str));
            min = Math.min(min, Integer.parseInt(str));
        }
        
        return min + " " + max;
        
    }
}