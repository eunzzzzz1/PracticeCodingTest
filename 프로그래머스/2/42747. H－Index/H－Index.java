import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);
        
        for(int i=0; i<n; i++) {
            answer = Math.max(answer, Math.min(citations[i], n-i));
        }
        
        return answer;
    }
}