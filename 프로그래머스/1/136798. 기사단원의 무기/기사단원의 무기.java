import java.util.*;

// PM 9:28 시작
// 1차 PM 9:35 - 시간초과
// 2차 PM 10:00 (해설 참고)

class Solution {
    public int solution(int number, int limit, int power) {

        int answer = 0;
        
        for(int i=1; i<=number; i++) {
            
            int n = 0; // i의 약수의 개수
            // 제곱근을 활용하자
            
            int sq = (int)Math.floor(Math.sqrt(i));
            
            for(int j=1; j<=sq; j++) {
                if(i%j==0 && i/j!=j) {
                    n+=2;
                } else if (i%j==0 && i/j==j) {
                    n++;
                }
            }
            
            if(n<=limit) {
                answer += n;
            } else {
                answer += power;
            }
        }
        
        return answer;
    }
}