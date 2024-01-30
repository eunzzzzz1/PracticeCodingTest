// 시작 PM 2:12
// 1차 PM 2:18

import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        
        int max = Arrays.stream(intArr).max().getAsInt();
        int min = Arrays.stream(intArr).min().getAsInt();
        
        return min + " " + max;
        
    }
}