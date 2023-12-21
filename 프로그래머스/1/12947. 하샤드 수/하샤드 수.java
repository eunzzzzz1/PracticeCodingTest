class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        int y = x;
        
        for(int i=0;i<Integer.toString(x).length();i++) {
            sum = sum + (y%10);
            y = y/10;
        }
        
        return x%sum==0;
    }
}