// 시작 PM 2:31
// 1차 PM 2:51
// 2차 PM 2:58

class Solution {
    public String solution(String s) {
        String[] string = s.split(" ");
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<string.length;i++) {
            
            char[] charArr = string[i].toCharArray();
            
            for(int j=0; j<charArr.length; j++) {
                
                if(j==0 && charArr[j]>='a' && charArr[j]<='z') {
                    charArr[j] = (char)(charArr[j]-32);
                    continue;
                }
                
                if (j!=0 && charArr[j]>='A' && charArr[j]<='Z') {
                    charArr[j] = (char)(charArr[j]+32);
                }
                    
            }
            
            if(i!=0) sb.append(" ");
            sb.append(new String(charArr));
            
        }
        
        sb.append(s.substring(sb.length()));
        return sb.toString();
    }
}