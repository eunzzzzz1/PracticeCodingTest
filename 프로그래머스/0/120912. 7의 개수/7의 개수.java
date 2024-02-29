class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int a : array) {
            char[] ch = String.valueOf(a).toCharArray();
            
            for(char c : ch) {
                if(c=='7') answer++;
            }
        }
        
        return answer;
    }
}