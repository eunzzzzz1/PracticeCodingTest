class Solution {
    public boolean solution(String s) {
        
        if(s.length()!=4 && s.length()!=6) return false;
        
        char[] arr = s.toCharArray();
        
        for(char a : arr) {
            if(a<'0' || a>'9') return false;
        }
        
        return true;
    }
}