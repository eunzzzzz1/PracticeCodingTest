// 시작 PM 9:57
// 1차 PM 10:20

class Solution {
    public String solution(String s, int n) {
        
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]==' ') continue;
            
            char z = ('A'<=arr[i] && 'Z'>=arr[i])?'Z':'z';
            char a = ('A'<=arr[i] && 'Z'>=arr[i])?'A':'a';
                
            arr[i] = (char)(arr[i]+n);

            if(arr[i]>z) {
                arr[i] = (char)(a + (arr[i]-z-1));
            }

        }
        
        return new String(arr);
    }
}