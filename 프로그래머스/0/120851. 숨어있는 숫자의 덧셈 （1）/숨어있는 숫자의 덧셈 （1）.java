import java.util.*;

class Solution {
    public int solution(String my_string) {
        return my_string
            .chars()
            .mapToObj(i -> (char) i)
            .filter(Character::isDigit)
            .map(String::valueOf)
            .mapToInt(Integer::valueOf)
            .sum();
    }
}