class Solution {
    public int solution(String[][] board, int h, int w) {
        // PM 05:26 시작
        // 의사코드랑 같은 방식
        int n = board.length; // board의 길이 저장
        int count = 0; // 같은 색으로 색칠된 칸의 개수를 저장한 변수
        int[] dh = {0, 1, -1, 0}; // h의 변화량
        int[] dw = {1, 0, 0, -1}; // w의 변화량
        
        int h_check = h;
        int w_check = w;
        
        for(int i=0;i<=3;i++) {
            h_check = h + dh[i];
            w_check = w + dw[i];
            
            if((h_check>=0 && h_check<n) && (w_check>=0 && w_check<n)) {
                if(board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }
        
        return count;
    }
}