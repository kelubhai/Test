
        public static int countWays(int n) {
            if (n < 0)
                return 0;
            if (n <= 2)
                return 1;
            int thirdLast = 1; //ways to reach third last stair
            int secondLast = 1; //ways to reach second last stair
            int last = 2; //ways to reach last stair
            int current = 0; //ways to reach current stair
            for (int i = 3; i <= n; i++) {
                current = last + secondLast + thirdLast; //summing ways to reach previous three stairs
                thirdLast = secondLast;
                secondLast = last;
                last = current;
            }
            return current;
        }
        public static void main(String args[]) {
            System.out.println(countWays(6));
        }
