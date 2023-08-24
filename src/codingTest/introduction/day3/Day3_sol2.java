package codingTest.introduction.day3;

public class Day3_sol2 {
	
    public int solution(int[] array) {
        int arrLen = array.length;
        int median = 0;
        int medianIndex =0;
        
        // 중앙값 구하기!
        // 1. 크기순서대로 정렬을 한다
        // 2. 중앙값을 구한다.
        
        // array의 개수가 홀수
        // '개수를 2로 나눈값의 몫 + 1번째'
        //      = 배열의 길이를 2로 나눈 값의 몫에 해당하는 인덱스
        
        array = getArray(array);
        // sort 라는 메소드가 이미 존재한다.

        medianIndex = (arrLen/2);
        median = array[medianIndex]; 
        
        return median;
    }
    
    public int[] getArray(int[] array) {
        
        int temp;
        int arrLen = array.length;
        
        for(int i=0; i<arrLen; i++) {
            for(int j=i+1; j<arrLen; j++) {
                
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
        
        return array;
        
    }

}
