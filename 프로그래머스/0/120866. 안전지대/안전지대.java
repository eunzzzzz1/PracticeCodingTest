class Solution {
    public int solution(int[][] board) {
        int lth = board.length;
        int[][] danger = new int[lth][lth];
        
        // 위험지역 표시하기
        for(int i=0; i<lth; i++) {
            for(int j=0; j<lth; j++) {
                if(board[i][j]==1) {
                    int iminus = Math.max(i-1, 0);
                    int iplus = Math.min(i+1,board.length-1);
                    int jminus = Math.max(j-1, 0);
                    int jplus = Math.min(j+1, board.length-1);
                    
                    danger[i][j] = 1;
                    danger[i][jminus] = 1;
                    danger[i][jplus] = 1;
                    danger[iplus][jminus] = 1;
                    danger[iplus][j] = 1;
                    danger[iplus][jplus] = 1;
                    danger[iminus][jminus] = 1;
                    danger[iminus][j] = 1;
                    danger[iminus][jplus] = 1;
                }
            }
        }
        
        // 위험지역 세기
        int answer = 0;
        
         for(int i=0; i<lth; i++) {
            for(int j=0; j<lth; j++) {
                if(danger[i][j]==0) answer++;      
            }
         }
            
        return answer;
    }
}