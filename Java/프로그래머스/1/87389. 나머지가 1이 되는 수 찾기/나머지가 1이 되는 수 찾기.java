class Solution {
    public int solution(int n) {
        for (int answer = 2; answer < n; answer++) {
            if (n % answer == 1) {
                return answer;
            }
        }
        return -1;
    }
}