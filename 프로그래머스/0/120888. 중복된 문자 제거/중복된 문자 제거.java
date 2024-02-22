class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");;
        StringBuffer sb = new StringBuffer();
        
        for(String a : arr) {
            if(sb.indexOf(a)==-1) sb.append(a);
        }

        return sb.toString();
    }
}