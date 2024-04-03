// 1차 PM 5:15 ~ PM 6:01 - 7번부터 런타임에러
// 2차 PM 6:30 ~ 

class Solution {
    public long solution(int n) {
        
        if(n==1) return 1;
        
        long answer = 0;
        long[] route = new long[n];
        
        route[0] = 1;
        route[1] = 2;
        
        for(int i=2; i<n; i++) {
            route[i] = (route[i-1] + route[i-2]) % 1234567;
        }
        
        return route[n-1];
    }
}