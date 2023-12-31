class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        int index = s.length()/2;
        return s.length()%2==0?str[index-1]+str[index]:str[index];
    }
}