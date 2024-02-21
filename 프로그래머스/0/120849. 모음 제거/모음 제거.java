class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for(char a : arr) {
            if(a != 'a' && a != 'e' && a != 'i' && a != 'o' && a!= 'u') {
                sb.append(a);
            }
        }
        
        return sb.toString();
    }
}