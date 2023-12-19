// PM 9:01 시작
// 1차 PM 9:10
// 2차 PM 9:15

class Solution {
    public long solution(long n) {
        long answer = 1;
        
        while(n/answer!=answer || n%answer!=0) {
            answer++;
            
            if(answer>n) {
                return -1;
            }
        }
        
        answer++;
        answer = answer * answer;
        
        return answer;
    }
}