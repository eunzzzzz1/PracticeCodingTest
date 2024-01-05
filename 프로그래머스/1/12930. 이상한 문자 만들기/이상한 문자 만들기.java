// 시작 PM 11:43
// 1차 PM 11:52
// 2차 PM 12:10

class Solution {
    public String solution(String s) {

        char[] arr = s.toCharArray();
        int j = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==' ') {
                j = 0;
                continue;
            }
            
            if(j%2==0 && arr[i]>='a') {
                arr[i] = (char)(arr[i]-32);
            } else if (j%2!=0 && arr[i]<'a') {
                arr[i] = (char)(arr[i]+32);
            }
            
            j++;
            
        }
        
        return new String(arr);
    }
}