// 시작 PM 4:41
// 1차 PM 5:03

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // board[y][x] 일 떄, moves의 원소 - 1이 [x]이 됨
        
        // 꺼낸 인형을 담을 list
        List<Integer> dollList = new ArrayList<>();
        
        for(int m : moves) {
            
            for(int i=0; i<board.length;i++) {
                
                if(board[i][m-1]!=0) {

                    if(dollList.size()!=0 &&
                       dollList.get(dollList.size()-1)==board[i][m-1]) {
                        
                        dollList.remove(dollList.size()-1);
                        answer += 2;
                        
                    } else {
                        dollList.add(board[i][m-1]);
                    }
                    
                    board[i][m-1] = 0;
                    break; // 인형을 건졌으면 다음 순서로~
                }
            }
            
            
        }
        
        return answer;
    }
}