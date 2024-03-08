class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] arr = A.toCharArray();

        for(int i=0; i<A.length();i++) {
            if(new String(arr).equals(B)) break;
            
            char next = arr[0];
            arr[0] = arr[arr.length-1];
            
            for(int j=0; j<A.length()-1;j++) {
                char temp = arr[j+1];
                arr[j+1] = next;
                next = temp;
            }
            
            answer++;
        }
        
        return (new String(arr).equals(B))?answer:-1;
    }
}