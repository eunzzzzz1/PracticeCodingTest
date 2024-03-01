class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        
        for(int i=0; i<4; i++) {
            for(int j=i+1; j<4; j++) {
                x = Math.max(Math.abs(dots[i][0] - dots[j][0]),x);
                y = Math.max(Math.abs(dots[i][1] - dots[j][1]),y);
            }
        }
        
        return x*y;
    }
}