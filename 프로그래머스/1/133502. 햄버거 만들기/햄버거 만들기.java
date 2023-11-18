class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        // int[] 를 문자열로 만들기
        // 문자열에서 "1231" 이 있는지 보기
        StringBuilder ingStr = new StringBuilder();
                // 시간복잡도 해결을 위해서 StringBuilder를 써야한다.
        

        for(int i : ingredient) {
            ingStr.append(i);
            
            // 1. 문자열 길이가 4를 넘어갔을 때
            // 2. "1231" 덩어리가 있는지 검사
            // 3. 있으면 answer++ 하고, 1231 덩어리를 없앤다.
            if(ingStr.length()>=4 && ingStr.subSequence(ingStr.length()-4, ingStr.length()).equals("1231")){
                // ingredient가 차례로 쌓이면서 1,2,3,1이 만들어지면
                answer++; // 햄버거 한 개 만들고
                ingStr.delete(ingStr.length()-4, ingStr.length()); // 재료는 StringBuilder에서 없앤다.
            }
            
        }
        
        return answer;
    }
}