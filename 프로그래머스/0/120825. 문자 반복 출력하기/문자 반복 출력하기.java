class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        String[] arr = my_string.split("");
        
        for(String str : arr) {
            sb.append(str.repeat(n));
        }
        
        return sb.toString();
    }
}