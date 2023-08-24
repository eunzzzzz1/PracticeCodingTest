package codingTest.introduction.day1;

public class Day2_sol4 {
	
    public int[] solution(int[] numbers) {
        
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = numbers[i]*2;
        }

        return numbers;
    }

}
