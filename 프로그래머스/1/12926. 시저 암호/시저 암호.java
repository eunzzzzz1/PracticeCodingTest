// 시작 PM 9:57
// 1차 PM 10:20

class Solution {
    public String solution(String s, int n) {
        
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]==' ') continue;
            char a = ('A'<=arr[i] && 'Z'>=arr[i])?'A':'a';  
            arr[i] = (char)(a + (arr[i] - a + n) % 26);

        }
        
        return new String(arr);
    }
}