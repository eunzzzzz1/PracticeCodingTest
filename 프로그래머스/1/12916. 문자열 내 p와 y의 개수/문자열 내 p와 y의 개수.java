// PM 8:10 시작

class Solution {
    boolean solution(String s) {
        
        char[] arr = s.toCharArray();
        
        int p = 0;
        int y = 0;
        
        for(char a : arr) {
            // a 97 A 65
            if(a<97) {
                a = (char)(a+32);
            }
            
            if(a=='p') p++;
            if(a=='y') y++;
        }

        return p==y ? true : false;

    }
}