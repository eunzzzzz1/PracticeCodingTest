class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        char[] rspArr = rsp.toCharArray();
        
        for(char a : rspArr) {
            switch(a) {
                case '2':
                    sb.append('0');
                    break;
                case '0':
                    sb.append('5');
                    break;
                case '5':
                    sb.append('2');
                    break;
            }
        }

        return sb.toString();
    }
}