import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
            .mapToObj(i -> Character.toString(i))
            .distinct()
            .collect(Collectors.joining());
    }
}