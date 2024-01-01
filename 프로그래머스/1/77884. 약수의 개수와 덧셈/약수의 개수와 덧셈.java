// 시작 PM 8:58
// 1차 PM 9:04

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++) {
            int n = 0;
            
            for(int j=1;j<=i;j++) {
                if(i%j==0) n++;
            }
            
            if(n%2==0) answer += i;
            else answer -= i;
            
        }
        
        return answer;
    }
}