package codingTest.introduction.day1;

public class Day1 {
	
	// 몫 구하기
    public int solution(int num1, int num2) {
        boolean flag
            = (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100);
        
        if(flag) {
            return num1/num2;
        }
        return 0;
    }

}
