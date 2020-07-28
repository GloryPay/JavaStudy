package programmers;

public class Problem2 {

    public static void main(String[] args) {

        Solution2 a = new Solution2();

        System.out.println(a.solution(12));


    }


    static class Solution2 {

        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    answer = answer + i;
                }
            }

            return answer + n;
        }

    }



}
