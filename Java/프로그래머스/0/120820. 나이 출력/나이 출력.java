class Solution {
    public int solution(int age) {
        if (age <= 0 || age > 120) {
            System.out.println("잘못된 나이입니다.");
            return 0;
        }

        int answer = 2022 - age + 1;
        System.out.println("2022년 기준 " + age + "살이므로 " + answer + "년생입니다.");
        return answer;
    }
}