import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        
        return Arrays.stream(s.split(""))
            .collect(Collectors.groupingBy(i -> i))
            .entrySet()
            .stream()
            .filter(i -> i.getValue().size() == 1)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.joining());
    }
}