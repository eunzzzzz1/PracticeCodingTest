class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            answer++;
            while(answer%3==0 || String.valueOf(answer).indexOf("3")!=-1) {
                answer++;
            }
        }
        return answer;
    }
}