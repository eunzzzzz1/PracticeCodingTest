// 시작 PM 1:23
// 1차 PM 1:41
// 2차 PM 1:56
// 3차 PM 2:18

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n;
        int[] arr = new int[n];
        
        for(int i : lost) {
            arr[i-1]--;
        }
        
        for(int i : reserve) {
            arr[i-1]++;
        }

        for(int i=0; i<n; i++) {
            
            if(arr[i] == -1) {
                            
                if (i-1>=0 && arr[i-1]==1) {
                    arr[i-1]--;
                    arr[i]++;
                } else if (i+1<n && arr[i+1]==1) {
                    arr[i]++;
                    arr[i+1]--;
                } else {
                    answer--;
                }
                
            }

        }
        
        return answer;
    }
}