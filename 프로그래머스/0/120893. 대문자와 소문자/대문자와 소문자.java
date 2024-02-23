import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>='A' && arr[i]<='Z') arr[i] = (char)(arr[i]+32);
            else arr[i] = (char)(arr[i]-32);
        }
        
        return new String(arr);
    }
}