class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(k+"");
        return (answer!=-1) ? answer+1 : answer;
    }
}