import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        List<String> list = Arrays.asList(seoul);
        
        return "김서방은 " + list.indexOf("Kim") + "에 있다";
    }
}