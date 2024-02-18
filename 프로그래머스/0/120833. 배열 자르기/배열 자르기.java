import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> numList = new ArrayList<>();
        
        for(int i=num1; i<=num2; i++) {
            numList.add(numbers[i]);
        }
        
        return numList.stream().mapToInt(i -> i).toArray();
    }
}