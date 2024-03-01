class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String str : keyinput) {
            if(str.equals("left")) answer[0] = Math.max(-1*board[0]/2, answer[0]-1);
            else if(str.equals("right")) answer[0] = Math.min(board[0]/2, answer[0]+1);
            else if(str.equals("up")) answer[1] = Math.min(board[1]/2, answer[1]+1);
            else if(str.equals("down")) answer[1] = Math.max(-1*board[1]/2,answer[1]-1);
        }
        
        return answer;
    }
}