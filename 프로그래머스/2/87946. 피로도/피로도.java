// 피로도고 뭐고 내가 잠온다...
import java.util.*;

class Solution {
    boolean[] visited;
    int[][] dungeons;
    int max;
    
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        
        for(int i=0; i<dungeons.length; i++) {
            if(k>=dungeons[i][0]) dfs(i, k, 1);
        }

        return max;
    }
    
    private void dfs(int current, int tired, int depth) {
        // current 현재 탐색하는 위치
        // tired 현재 피로도
        // depth 현재 깊이
        
        visited[current] = true;
        tired -= dungeons[current][1];
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= tired)
                dfs(i, tired, depth+1);
        }
        max = Math.max(max, depth);
        visited[current] = false;
    }

}