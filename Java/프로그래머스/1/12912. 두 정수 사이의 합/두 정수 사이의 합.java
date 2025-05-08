class Solution {
    public long solution(int a, int b) {
        int start = Math.min(a,b);
        int end = Math.max(a,b);
        
        return (long)(start + end) * (end - start + 1) / 2;
    }
}