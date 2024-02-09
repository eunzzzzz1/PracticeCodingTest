// 시작 PM 2:18
// 1차 PM 2:43 - 시간 초과
// 2차 PM 2:57

class Solution {
    public int solution(int n) {
        int[] num = new int[n+1];
        
        num[0] = 0;
        num[1] = 1;
        
        for(int i=2; i<=n; i++) {
            num[i] = (num[i-1] + num[i-2]) % 1234567;
        }
        
        return num[n];
    }
    
}