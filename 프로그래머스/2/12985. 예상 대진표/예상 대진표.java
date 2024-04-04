// 시작 PM 1:52 ~ PM 2:02

class Solution {
    public int solution(int n, int a, int b) {
        
        int answer = 0;
        
        while(a != b) {
            
            a = (a+1)/2;
            b = (b+1)/2;
            answer++;
            
            if(a == b) return answer;
        }

        return answer;
    }
}