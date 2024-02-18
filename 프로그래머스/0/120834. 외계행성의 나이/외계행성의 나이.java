class Solution {
    public String solution(int age) {
        String answer = age + "";
        char[] arr = answer.toCharArray();
        
        StringBuffer sb = new StringBuffer();
        for(char a : arr) {
            sb.append((char)(a+49));
        }
        
        return sb.toString();
    }
}