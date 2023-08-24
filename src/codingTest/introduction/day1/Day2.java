package codingTest.introduction.day1;

public class Day2 {

	/**
	 * 2-1 두 수의 나눗셈
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int solution1(int num1, int num2) {

		boolean flag
		= (num1>0 && num1<=100 && num2>0 && num2<=100);
		float result = -1;

		if(flag) {
			result = (float)num1/(float)num2*1000;
		}

		return (int)result;
	}


	/**
	 * 숫자 비교하기<br><br>
	 * 정수 num1과 num2가 매개변수로 주어집니다.<br>
	 * 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
	 * 
	 * @param num1 0 ≤ num1 ≤ 10,000
	 * @param num2 0 ≤ num2 ≤ 10,000
	 * @return
	 */
	public static int solution2_myAnswer(int num1, int num2) {
		//if문으로 처리하기
		boolean flag
		= (num1>0 && num1<=100 && num2>0 && num2<=100);

		if(num1==num2) {
			return 1;
		}

		return -1;

	}

	public static int solution2_othersAnswer(int num1, int num2) {
		//삼항연산자로 처리하기
		boolean flag
		= (num1>0 && num1<=100 && num2>0 && num2<=100);

		return (num1==num2)?1:-1;

	}




}


