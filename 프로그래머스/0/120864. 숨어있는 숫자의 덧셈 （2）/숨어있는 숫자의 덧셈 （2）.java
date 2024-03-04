import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        
        for(char a : my_string.toCharArray()) {
            if(a>='0' && a<='9') {
                sb.append(a);
            } else if (sb.length()>0) {
                answer += Integer.parseInt(sb.toString());
                sb.setLength(0);
            }
        }
        
        if(sb.length()>0) answer += Integer.parseInt(sb.toString()); 
        
        return answer;
        
    }
}