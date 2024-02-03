
// 시작 PM 3:20
// 1차 PM 3:41

class Solution {
    public int[] solution(String s) {
        
        int zero = 0;
        int num = 0;
        
        while(!s.equals("1")) {
            zero += theNumOfZero(s);
            long i = deleteZero(s);
            s = binaryMaker(i);

            num++;
        }
        
        int[] result = {num, zero};
        
        return result;
    }
    
    
    
    
    public long deleteZero(String str) {
        str = str.replaceAll("0", "");
        return (long)str.length();
    }
    
    public String binaryMaker(long i) {
        
        StringBuffer sb = new StringBuffer();
        
        while(i!=0) {
            sb.append(i%2);
            i = i/2;
        }
        
        return sb.toString();
    }
    
    public int theNumOfZero(String str) {
        int result = 0;
        char[] arr = str.toCharArray();
        
        for(char c : arr) {
            if(c=='0') result++;
        }
        
        return result;
    }
    
}