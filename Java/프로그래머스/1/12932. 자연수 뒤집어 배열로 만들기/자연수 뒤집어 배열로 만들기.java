class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
        String reversedStr = sb.toString();
        
        int[] answer = new int[reversedStr.length()];
        
        for (int i = 0; i < reversedStr.length(); i++) {
            answer[i] = reversedStr.charAt(i) - '0';
        }
        return answer;
    }
}