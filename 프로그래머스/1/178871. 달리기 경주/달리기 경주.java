import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String,Integer> hMap = new HashMap<>();
        
        for(int i=0;i<players.length;i++) {
            hMap.put(players[i],i);
        }
        for(String calling : callings) {

            int callIndex = hMap.get(calling);
            players[callIndex] = players[callIndex-1];
            hMap.put(players[callIndex],callIndex);
            players[callIndex-1] = calling;
            hMap.put(calling,callIndex-1);
            
        }
        
        return players;
    }
}