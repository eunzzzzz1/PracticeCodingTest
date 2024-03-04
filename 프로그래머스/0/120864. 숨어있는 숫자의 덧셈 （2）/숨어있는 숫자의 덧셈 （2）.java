import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]"," ");
        for(String a : my_string.split(" ")) {
            if(!a.equals("")) answer += Integer.parseInt(a);
        }
        
        return answer;
    }
}