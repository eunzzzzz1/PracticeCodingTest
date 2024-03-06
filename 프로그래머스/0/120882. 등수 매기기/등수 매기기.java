class Solution {
    public int[] solution(int[][] score) {
        
        int[] rank = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            rank[i]++;
            double iscore = ((double)score[i][0] + (double)score[i][1]) / 2;

            for(int j=0; j<score.length; j++) {
                double jscore = ((double)score[j][0] + (double)score[j][1]) / 2;
                if(iscore < jscore) rank[i]++;
            }
        }
        
        return rank;
    }
}