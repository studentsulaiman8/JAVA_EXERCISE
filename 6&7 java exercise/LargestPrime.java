public class LargestPrime {


        // write code here

        public static int getLargestPrime(int number) {
            if (number <= 1) {
                return -1;
            }

            int largestPrime = 2;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                while (number % i == 0) {
                    largestPrime = i;
                    number /= i;
                }
            }

            if (number > 1) {
                largestPrime = number;
            }

            return largestPrime;
        }
    }



