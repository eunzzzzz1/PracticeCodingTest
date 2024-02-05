// 시작 PM 10:23
// 1차 PM 10:34

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binaryNum = Integer.toBinaryString(n);
        int num = theNumOfOne(binaryNum);
        
        while(true) {
            n++;
            if(num == theNumOfOne(Integer.toBinaryString(n)))
                break;
        }

        return n;
    }
    
    public int theNumOfOne (String binaryString) {
        char[] arr = binaryString.toCharArray();
        
        int num = 0;
        for(char c : arr) {
            if(c=='1') num++;
        }
        
        return num;
    }
}