import java.util.*;

class Solution {

    int[][] maps;
    int n = 0;
    int m = 0;
    
    public int solution(int[][] maps) {
        
        n = maps.length;
        m = maps[0].length;
        this.maps = maps;

        int answer = bfs(0,0);
        return (answer == 1) ? -1 : answer;
        // answer이 1이면 방문할 수 없다는 뜻 => -1을 return 한다.
    }
    
    private int bfs(int x, int y) {
        
        // 상, 하, 좌, 우를 살펴주기 위한 배열
        int[] dx = {-1, 1, 0, 0}; // 행 이동
        int[] dy = {0, 0, -1, 1}; // 열 이동

        Queue q = new LinkedList();
        // Queue에는 현재 방문한 좌표로부터
        // 인접한 노드들 중, 방문하지 않은 노드를 넣어줄 것.
        
        int[] a = {x, y}; // 시작점
        q.add(a); // Queue에 넣어준다.
        
        while(!q.isEmpty()) {
            
            int[] b = (int[])q.poll(); // 노드를 꺼내준다.
            
            x = b[0];
            y = b[1];
            
            for(int i=0; i<4; i++) { // 상하좌우를 살펴준다.
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위 벗어남
                // else if(maps[nx][ny] == 0) continue;
                else if(maps[nx][ny] == 1) { // 인접 노드가 방문하지 않은 노드라면
                    int[] c = {nx, ny};
                    q.add(c); // Queue에 넣어준다.
                    maps[nx][ny] = maps[x][y] + 1;
                    	// 시작 좌표부터 (nx, ny) 까지 이동한 칸 수를
                        // 점점 누적해서 더해준다.
                        // ( 방문 여부 체크가 되기도 한다. )
                }
            }
        }
        
        return maps[n-1][m-1];
    }

}