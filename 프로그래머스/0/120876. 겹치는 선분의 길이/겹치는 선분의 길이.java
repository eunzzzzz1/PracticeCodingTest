class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int min = 100;
        int max = 0;
        for(int i=0; i<lines.length; i++) {
            min = Math.min(min, lines[i][0]);
            max = Math.max(max, lines[i][1]);
        }
        
        int[] line = new int[max-min];
        
        for(int i=0; i<lines.length; i++) {
            for(int j=lines[i][0]-min; j<lines[i][1]-min; j++) {
                line[j]++;
            }
        }
        
        for(int i : line) {
            if(i>=2) answer++;
        }
        
        return answer;
    }
}