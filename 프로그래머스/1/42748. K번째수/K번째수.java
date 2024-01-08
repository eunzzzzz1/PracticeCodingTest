// 시작 PM 2:03
// 1차 PM 2:11

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int n=0;n<commands.length;n++) {
            
            int i = commands[n][0]-1;
            int j = commands[n][1]-1;
            int k = commands[n][2]-1;

            int[] arr = new int[j-i+1];
            
            for(int m=0; m<arr.length; m++) {
                arr[m] = array[i+m];
            }
            
            Arrays.sort(arr);
            answer[n] = arr[k];
            
        }
        
        return answer;
    }
}