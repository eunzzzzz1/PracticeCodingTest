// 시작 PM 1:38
// 1차 PM 2:10

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for(int i=0; i<n; i++) {
            
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            str = String.format("%16s", str)
                .substring(16-n)
                .replaceAll("1","#")
                .replaceAll("0"," ");
            
            answer[i] = str;

        }

        return answer;
    }
    
}