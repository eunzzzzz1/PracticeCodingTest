// 시작 PM 9:40
// 1차 PM 9:46

class Solution {
    public int solution(int[][] sizes) {
        
        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;
        
        for(int[] size : sizes) {
            
            w = Math.max(w, Math.max(size[0],size[1])); // 가로세로 중 큰 수를 가로로 두기 위함
            h = Math.max(h, Math.min(size[0],size[1])); // 가로세로 중 작은 수를 세로로 두기 위함
            
        }
        
        return w*h;
    }
}