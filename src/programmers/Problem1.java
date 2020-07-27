package programmers;

public class Problem1 {

    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        System.out.println(solution.solution(3, 5));

    }
}

class Solution1 {
    public long solution(int a, int b) {

        long sum = 0;

        int temp = 0;

        if ( a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++){
            sum = sum + i;
        }

        return sum;
    }
}