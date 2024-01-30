// 시작 PM 2:12
// 1차 PM 2:18

import java.util.*;

class Solution {
    public String solution(String s) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : s.split(" ")) {
            int i = Integer.parseInt(str);
            if(max<i) max = i;
            if(min>i) min = i;
        }
        
        return min + " " + max;
        
    }
}