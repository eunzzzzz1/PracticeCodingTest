class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        boolean canChange = true;

        while(canChange) {
            answer += (b*(n/a));
            n = b*(n/a) + (n%a);
            canChange = (n >= a);
        }
        
        return answer;
    }
}