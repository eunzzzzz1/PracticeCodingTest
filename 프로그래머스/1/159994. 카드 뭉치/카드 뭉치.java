//PM 3:40 시작
//1차 PM 4:16
//2차 PM 5:14

import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // i - drink - water 순서대로 나와야하고
        // want - to 순서대로 나와야 하는거야
        
        boolean c1 = isCorrect(cards1, goal);
        boolean c2 = isCorrect(cards2, goal);
        
        return (c1 && c2) ? "Yes" : "No";
    }
    
    
    private boolean isCorrect(String[] cards, String[] goal) {
  
        // 순서대로 쓰지 않았을 경우 false를 return하기
        for(int i=1;i<cards.length;i++) {
            if(Arrays.asList(goal).contains(cards[i]) &&
               Arrays.asList(goal).indexOf(cards[i-1])>Arrays.asList(goal).indexOf(cards[i])){
                return false;
            }
        }
        
        // 다음카드를 쓰지 않고 그 다음카드를 썼을 때 false를 return 하기
        int index = -1;
        
        for(int i=0;i<goal.length;i++) {
            
            if(Arrays.asList(cards).contains(goal[i])){

                if(index==-1) {
                    index = Arrays.asList(cards).indexOf(goal[i]);
                    continue;
                }
                
                if(Arrays.asList(cards).indexOf(goal[i])!=index+1) {
                    return false;
                }
                
                index = Arrays.asList(cards).indexOf(goal[i]);
            }
        }
        
        return true;
    }
}