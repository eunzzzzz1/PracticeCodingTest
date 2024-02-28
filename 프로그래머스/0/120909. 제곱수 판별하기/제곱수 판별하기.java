class Solution {
    public int solution(int n) {
        int m = 0;
        int i = 1;
        
        while(m<n) {
            m = i * i;
            i++;
            if(m==n) return 1;
        }
        
        return 2;
    }
}