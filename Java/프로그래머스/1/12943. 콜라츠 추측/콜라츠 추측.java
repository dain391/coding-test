class Solution {
    public int solution(int num) {
        long n = num;
        
        // 작업 횟수 저장 변수
        int count = 0;
        
        // n이 1이 될 때까지 / 500번 미만일 동안 반복
        while (n != 1 && count < 500) {
            if (n % 2 == 0) {
                n /= 2; // 짝수 처리
            } else {
                n = n * 3 + 1;  // 홀수 처리
            }
            count ++; // 작업 횟수 증가
        }
        // 500번 내에 1이 되면 count, 아니면 -1
        return (n == 1) ? count : -1;
    }
}