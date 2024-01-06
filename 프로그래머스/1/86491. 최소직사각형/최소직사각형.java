// 시작 PM 9:40

class Solution {
    public int solution(int[][] sizes) {
        
        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;
        
        for(int[] size : sizes) {
            if(size[0]<size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            
            w = Math.max(w, size[0]);
            h = Math.max(h, size[1]);
            
        }
        
        return w*h;
    }
}