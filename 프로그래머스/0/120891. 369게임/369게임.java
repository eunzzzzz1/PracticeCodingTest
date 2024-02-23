import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        return Arrays
            .stream(Integer.toString(order).split(""))
            .map(i -> Integer.parseInt(i))
            .filter(i -> (i%3==0 && i!=0))
            .mapToInt(i -> 1)
            .sum();
    }
}