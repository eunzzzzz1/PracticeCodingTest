// 시작 PM 1:23
// 1차 PM 1:41
// 2차 PM 1:56

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int[] lostArr = new int[n+2];
        for(int i : lost) {
            lostArr[i] ++;
        }

        for(int i=0; i<reserve.length; i++) {
            
            int j = reserve[i];
            
            if(lostArr[j]==1) {
                answer++;
                lostArr[j] = 0;
                reserve[i] = 0;
            }
        }

        
        for(int j : reserve) {

            if(j==0) continue;
            
            if(lostArr[j-1]==1) {
                answer++;
                lostArr[j-1] = 0;
            } else if(lostArr[j+1]==1) {
                answer ++;
                lostArr[j+1] = 0;
            }
            
        }
        
        return answer;
    }
}