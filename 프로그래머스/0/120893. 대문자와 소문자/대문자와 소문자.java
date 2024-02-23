import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
            .mapToObj(i->(i>='A'&&i<='Z')?String.valueOf((char)(i+32)):String.valueOf((char)(i-32)))
            .collect(Collectors.joining());
    }
}