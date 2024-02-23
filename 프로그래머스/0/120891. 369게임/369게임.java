import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        return Arrays
            .stream(Integer.toString(order).split(""))
            .filter(i -> (Integer.parseInt(i)%3==0 && Integer.parseInt(i) !=0))
            .mapToInt(i -> 1)
            .sum();
    }
}