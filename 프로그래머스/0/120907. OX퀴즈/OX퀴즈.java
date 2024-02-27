class Solution {
    public String[] solution(String[] quiz) {
        
        for(int i=0; i<quiz.length; i++) {
            String[] nums = quiz[i]
                .replace("- ","-")
                .replace("+ ","")
                .replace("--","")
                .split(" ");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            int answer = Integer.parseInt(nums[3]);
            
            if(num1 + num2 == answer)
                quiz[i] = "O";
            else
                quiz[i] = "X";
        }
        
        return quiz;
    }
}