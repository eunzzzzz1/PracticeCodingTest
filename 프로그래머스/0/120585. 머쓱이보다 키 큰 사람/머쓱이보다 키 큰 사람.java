import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        return Arrays.stream(array).filter(i-> height<i).map(i -> 1).sum();
    }
}