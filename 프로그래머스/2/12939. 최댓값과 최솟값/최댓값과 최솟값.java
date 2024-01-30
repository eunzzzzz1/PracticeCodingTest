// 시작 PM 2:12
// 1차 PM 2:18

import java.util.*;

class Solution {
    public String solution(String s) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(intArr);
        
        return intArr[0] + " " + intArr[intArr.length-1];
        
    }
}