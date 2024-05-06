import java.util.*;

class Solution {
    public int solution(String str1, String str2) {

        List<String> strArr1 = makeMultiSet(str1);
        List<String> strArr2 = makeMultiSet(str2);
        
        // 정렬하기
        Collections.sort(strArr1);
        Collections.sort(strArr2);
        
        List<String> intersaction = new ArrayList<>();
        List<String> union = new ArrayList<>();
        
        
        // 교집합 구하기
        for(String a : strArr1) {
            if(strArr2.remove(a)) { // 지워지면 true를 반환 = 교집합에 속함
                intersaction.add(a);
            }
            
            union.add(a);
        }
        
        // 합집합 구하기
        for(String a : strArr2) {
            union.add(a); // 교집합에 속하지 않은 나머지 원소들 추가
        }
        
        // 자카드
        double a = intersaction.size();
        double b = union.size();
        double jaccard = (b==0)?65536:a/b*65536;
        
        return (int)jaccard;
    }
    
    private List<String> makeMultiSet (String str) {
        List<String> strArrList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        
        char[] charArr = str.toCharArray();
        
        for(int i=0; i<charArr.length-1; i++) {
            
            if(charArr[i]>='a' && charArr[i]<='z')
                sb.append(charArr[i]);
            
            if(charArr[i+1]>='a' && charArr[i+1]<='z')
                sb.append(charArr[i+1]);
            
            if(sb.length()==2)
                strArrList.add(sb.toString());
            
            sb.setLength(0);
        }

        return strArrList;
    }
    
}
