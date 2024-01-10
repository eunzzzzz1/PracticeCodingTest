// 시작 PM 9:55
// 1차 PM 10:16
// 2차 PM 10:35

class Solution {
    public int solution(int[] nums) {
        // 소수 = 약수가 1과 자기자신밖에 없는 숫자,,,
        
        int answer = 0;
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    
                    answer ++;
                    int n = nums[i] + nums[j] + nums[k];
                    
                    for(int l=2; l<n/2; l++) {
                        if(n%l==0) {
                            answer--;
                            break;
                        }
                    }
                }
            }
        }
        
        


        return answer;
    }
}