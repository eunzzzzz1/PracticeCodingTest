// 시작 PM 9:45
// 1차 PM 9:58

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            
            int j = i;
            int result = 0;
            
            while(result<n) {
                result += j;
                j++;
                
                if(result==n) answer++;
            }
            
        }
        
        return answer;
    }
}