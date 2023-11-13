class Solution {
    public long solution(int k, int d) {
        
        long answer = 0;
        // 거리...
        // x제곱 + y제곱에 루트 씌우기...
        
        for(int i=0;i<=d/k;i++) {
            
            long x = i*k;
            long maxY = (long)Math.sqrt((long)d*(long)d - (x*x)); // y의 최대값
            // System.out.println(x + " " + maxY);
            
            answer = answer + (maxY/k) + 1;
            // y가 0부터 시작할 때를 고려해 + 1을 해준다.
            // k가 2, d가 4, x가 0일 때, maxY는 4다.
            // 단순히 (maxY/k)만 하게 되면, (0,2) (0,4)의 경우만 고려하게 된다.
            
            // x가 2일 때, maxY는 3이다.
            // 단순히 (maxY/k)만 하게 되면, (2,2)의 경우만 고려하게 된다.
            // (2,0)을 같이 고려하기 위해 +1
            
            // x가 4일 때, maxY는 0이다.
            // 단순히 (maxY/k)만 하게 되면, (4,0)의 경우를 고려할 수 없다.
        }

        return answer;
    }
}