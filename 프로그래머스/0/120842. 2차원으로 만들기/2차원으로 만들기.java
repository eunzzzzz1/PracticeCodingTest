class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] tempArr = new int[n];
        int[][] answer = new int[length/n][n];
        
        int m = 0;
        
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<n; j++) {
                answer[i][j] = num_list[m];
                m++;
            }
        }
        
        return answer;
    }
}