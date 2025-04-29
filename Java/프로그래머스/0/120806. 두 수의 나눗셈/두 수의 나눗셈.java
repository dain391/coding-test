class Solution {
    public int solution(int num1, int num2) {
        if (num1 <= 0 || num1 > 100 || num2 <= 0 || num2 > 100) {
            System.out.println("잘못된 숫자 입니다.");
            return 0;
        }
        return (num1 * 1000) / num2;
    }
}