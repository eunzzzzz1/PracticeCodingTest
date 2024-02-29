import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        
        for(char ch : my_str.toCharArray()) {
            sb.append(ch);
            if(sb.length()==n) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        
        if(sb.length()!=0) list.add(sb.toString());
        
        return list.toArray(new String[0]);
    }
}