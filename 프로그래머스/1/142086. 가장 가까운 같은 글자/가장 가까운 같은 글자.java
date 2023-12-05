class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");
        
        answer[0] = -1;
        
        for(int i=1;i<s.length();i++) {
            
            String str = s.substring(0,i);
            
            if(str.indexOf(sArr[i])!=-1) {
                answer[i] = i-str.lastIndexOf(sArr[i]);
            } else {
                answer[i] = -1;
            }
            
        }
        
        return answer;
    }
}