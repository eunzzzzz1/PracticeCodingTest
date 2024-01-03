// 시작 PM 7:56
// 1차 PM 8:24
// 2차 PM 8:38
// 3차 PM 8:52
// 4차 PM 9:00 - 다 통과 됐는데 1번 런타임에러...

class Solution {
    public long solution(int n) {
        long answer = 0;
        
        // 1. 3진법으로 바꾸기
        StringBuilder sb = new StringBuilder();

        while(n!=0) {
            sb.append(n%3);
            n = n/3;
        }

        // 2. 10진법으로 다시 바꾸기
        
        long trit = Long.parseLong(sb.toString());

        for (int i=0;i<sb.length();i++) {
            answer += (long)Math.pow(3, i) * (long)(trit%10);
            trit /= 10;
        }

        return answer;
    }
    
    
}