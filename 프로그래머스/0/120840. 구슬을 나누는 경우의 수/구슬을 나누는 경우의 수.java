class Solution {
    public double solution(int balls, int share) {
        
        double answer = 1;

        for(double i=share+1; i<=balls; i++) {
            answer *= i;
            answer /= (i-share);
        }

        return answer;
    }
}