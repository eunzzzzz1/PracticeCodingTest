// 시작 PM 1:38
// 1차 PM 2:10

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++) {
            
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            
            while(str1.length()!=n) str1 = "0" + str1;
            while(str2.length()!=n) str2 = "0" + str2;

            for(int j=0; j<n; j++) {

                if(str1.charAt(j)=='1' || str2.charAt(j)=='1')
                    sb.append("#");
                else
                    sb.append(" ");
                
            }
            
            answer[i] = sb.toString();
            sb.delete(0, n);
        }

        return answer;
    }
    
}