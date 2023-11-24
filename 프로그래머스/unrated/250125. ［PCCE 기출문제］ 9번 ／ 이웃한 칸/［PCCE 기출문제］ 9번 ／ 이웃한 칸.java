class Solution {
    public int solution(String[][] board, int h, int w) {
        // PM 5:45 시작
        int count = 0;

        String chosenColor = board[h][w];
        // 위 h-1 / 아래 h+1
        // 왼쪽 w-1 / 오른쪽 w+1
        // (h-1,w) (h+1,w), (h,w-1), (h,w+1)
        
        int[] move_h = {-1, 1, 0, 0};
        int[] move_w = {0, 0, -1, 1};
        
        int l = board.length;
        
        for(int i=0;i<=3;i++) {
            // 비교할 좌표
            int check_h = h+move_h[i];
            int check_w = w+move_w[i];
            
            if((check_h>=0 && check_h<l) && (check_w>=0 && check_w<l)) {
                if(board[check_h][check_w].equals(chosenColor)){
                    count++;
                }
            }
        }
        
        // PM 6:01
        return count;
    }
}