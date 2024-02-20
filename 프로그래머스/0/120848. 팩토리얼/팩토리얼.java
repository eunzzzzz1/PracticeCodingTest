class Solution {
    public int solution(int n) {
        int result = 1;
        int answer = 0;
        
        do {
            answer++;
            result = result * answer;
        } while(result * (answer + 1) <= n);
        
        return answer;
    }
}