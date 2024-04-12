// PM 8:51 ~ PM 10:03

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        
        for(int i=0; i<want.length; i++) {
            wantMap.put(want[i], i);
        }
        
        for(int i=0; i<discount.length; i++) {
            if(i>=10 && wantMap.get(discount[i-10]) !=null)
                number[wantMap.get(discount[i-10])]++;
            
            if(wantMap.get(discount[i]) != null)
                number[wantMap.get(discount[i])]--;
            
            if(check(number)) answer++;
        }
        
        return answer;
    }
    
    public boolean check (int[] array) {
        int a = 0;
            
        for(int j=0; j<array.length; j++) {
            a = Math.max(a, array[j]);
        }
        
        return a<=0;
    }
}