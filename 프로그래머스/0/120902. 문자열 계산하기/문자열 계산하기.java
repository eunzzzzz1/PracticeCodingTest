import java.util.*;

class Solution {
    public int solution(String my_string) {

        return Arrays
            .stream(my_string.replace("- ","-").replace("+ ","").split(" "))
            .mapToInt(i -> Integer.parseInt(i))
            .sum();
    }
}