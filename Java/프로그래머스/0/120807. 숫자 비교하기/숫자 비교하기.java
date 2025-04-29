class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000) {
            if (num1 == num2) {
            answer = 1;
            System.out.println("num1이 " + num1 + "이고, num2가 " + num2 + "이므로 같습니다. 따라서 " + answer + "을 return합니다.");
        } else {
            answer = -1;
            System.out.println("num1이 " + num1 + "이고, num2가 " + num2 + "이므로 다릅니다. 따라서 " + answer + "을 return합니다.");
        }
        }
        
        return answer;
    }
}