// PM 7:07 시작

import java.util.*;

class Solution {

    int[][] maps;
    int n = 0;
    int m = 0;
    
    public int solution(int[][] maps) {
        
        n = maps.length;
        m = maps[0].length;
        this.maps = maps;
        
        // 진영이 가로막혀서 갈 수 없을 때!

        int answer = bfs(0,0);
        return (answer == 1) ? -1 : answer;
    }
    
    private int bfs(int x, int y) {
        
        int[] dx = {-1, 1, 0, 0}; // 행 이동
        int[] dy = {0, 0, -1, 1}; // 열 이동

        Queue q = new LinkedList();
        int[] a = {x, y};
        
        q.add(a);
        
        while(!q.isEmpty()) {
            
            int[] b = (int[])q.poll();
            
            x = b[0];
            y = b[1];
            
            for(int i=0; i<4; i++) { // 상하좌우를 살펴준다.
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위 벗어남
                else if(maps[nx][ny] == 1) { // 새롭게 들린 길이면
                    int[] c = {nx, ny};
                    q.add(c); // Queue에 넣어준다.
                    maps[nx][ny] = maps[x][y] + 1; // 지금까지 온 길 + 1
                }
                
                // maps[nx][ny] 가 1이 아닌 경우 = 이미 들린 길이므로
                // 되돌아가지 않는다.
            }
            
        }
        
        return maps[n-1][m-1];
    }

}