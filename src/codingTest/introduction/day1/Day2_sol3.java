package codingTest.introduction.day1;

public class Day2_sol3 {
	
	/**
	 * 제출 답안
	 * 
	 * 분수의 덧셈<br><br>
	 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
	 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
	 * 두 분수를 더한 값을 기약 분수로 나타냈을 때
	 * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.<br>
	 * 
	 * 0 < numer1, denom1, numer2, denom2 < 1,000
	 * @return
	 */
	public static int[] sol3(int numer1, int denom1, int numer2, int denom2) {

		/**
		 * 로직 정리하기
		 * 
		 * 1. 약분하지 않은 분수의 합을 구한다
		 * 2. 분자와 분모의 최대공약수를 구한다
		 * 3. 분자와 분모를 최대공약수로 약분한다.
		 * 
		 */

		int[] result = {0, 0};

		int numer = (numer1 * denom2) + (numer2 * denom1);
		int denom = denom1 * denom2;

		int temp;
		int big=0, small=0;

		if(denom>numer) {

			big = denom;
			small = numer;

		} else if (denom<numer) {
			big = numer;
			small = denom;
		} 

		while(big%small!=0) {

			temp = big;
			big = small;
			small = temp%small;

			if(big<small) {

				temp = big;
				big = small;
				small = temp;

			}

		}
		
		result[0] = numer/small;
		result[1] = denom/small;

		return result;

	}
	
	
	
	
	
	// 풀이보고 보충하기
	
	/**
	 * 최대 공약수 구하는 부분을 메소드로 따로 분리하자
	 */
	public static int[] sol3_plus(int numer1, int denom1, int numer2, int denom2) {
		
		int[] result = {0, 0};
		
		int numer = (numer1*denom2) + (numer2*denom1);
		int denom = denom1*denom2;
	
		int gcd = getGcd(numer,denom);
		
		result[0] = numer/gcd;
		result[1] = denom/gcd;
		
		return result;
	};
	
	/**
	 * 메소드의 반환값을 자기자신으로 줄 수 있다!
	 */
	private static int getGcd(int big, int small) {
		
		int temp;
		
		if(big<small) {
			temp = big;
			big = small;
			small = temp;
		}
		
		if(big%small==0) {
			return small;
		}
		
		return getGcd(small, (big%small));
	}
	
/*	private int getGcd(int big, int small) {

		int temp;
		
		if(big<small) {
			temp = big;
			big = small;
			small = temp;
		}
		
		while(big%small!=0) {
			
			temp = big;
			big = small;
			small = temp%small;
			
			if(big<small) {
				temp = big;
				big = small;
				small = temp;
			}
			
		}
		
		
		return small;
	}*/

	
	
	
	
	
	
	
	
	
	
}
