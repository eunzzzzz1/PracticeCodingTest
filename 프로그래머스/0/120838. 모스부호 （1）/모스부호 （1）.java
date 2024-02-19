import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse
            = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        
        List<String> morseList = Arrays.asList(morse);
        
        String[] letterArr = letter.split(" ");
        StringBuffer sb = new StringBuffer();
        
        for(String a : letterArr) {
            sb.append((char)(morseList.indexOf(a)+'a'));
        }
        
        return sb.toString();
        
    }
        
}