//시작 PM 10:20
//1차 PM 10:37

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int answer = 0;
        Arrays.sort(d);
        
        for(int i = 0; i<d.length;i++) {
            budget = budget - d[i];
            if(budget<0) break;
            answer = i+1;
        } 
        
        return answer;
    }
}