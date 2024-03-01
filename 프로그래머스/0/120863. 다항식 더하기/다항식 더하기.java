import java.util.*;

class Solution {
    public String solution(String polynomial) {        
        polynomial = polynomial.replace("+ ","");
        String[] str = polynomial.split(" ");
        
        int x = 0;
        int num = 0;
        
        for(String a : str) {
            if(a.indexOf("x")!=-1) {
                if(a.split("x").length==0) x++;
                else x += Integer.parseInt(a.split("x")[0]);
            } else {
                num += Integer.parseInt(a);
            }
        }
        
        
        StringBuffer sb = new StringBuffer();
        
        if(x==0) sb.append(num);
        else if(x==1) sb.append("x + " + num);
        else sb.append(x + "x + " + num);
        
        return sb.toString().replace(" + 0","");
    }
}