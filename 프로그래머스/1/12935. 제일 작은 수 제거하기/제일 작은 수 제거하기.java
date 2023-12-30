// 시작 PM 5:58
// 1차 PM 6:37

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> arrList = new ArrayList<>();
        
        if(arr.length==1) {
            
            return new int[] {-1};
            
        } else {
            
            int min = Integer.MAX_VALUE;
    
            for(int a : arr) {
                arrList.add(a);
                min = Math.min(min, a);
            }
            arrList.remove((Integer)min);
            
        }
        
        return arrList.stream().mapToInt(i -> i).toArray();
    }
}