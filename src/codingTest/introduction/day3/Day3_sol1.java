package codingTest.introduction.day3;

public class Day3_sol1 {
	
    public int solution(int num1, int num2) {
        int answer = -1;
        boolean flag = (num1>0 && num1<=100 && num2>0 && num2<=100);
        
        if(!flag) {
            return answer;
        }
        
        answer = num1%num2;
        
        return answer;
    }

}
