public class NumberToWords {

        // write code here

        public static void numberToWords(int number) {
            if (number < 0) {
                System.out.println("Invalid Value");
            }

            int reversedNumber = reverse(number);
            int digitCount = getDigitCount(number);

            for (int i = 0; i < digitCount; i++) {
                int digit = reversedNumber % 10;
                reversedNumber /= 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }
        public static int reverse(int number) {
            int reversedNumber = 0;
            int sign = 1;

            if (number < 0) {
                sign = -1;
                number *= -1;
            }

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            return reversedNumber * sign;
        }
        public static int getDigitCount(int number) {
            if (number < 0) {
                return -1;
            }

            if (number == 0) {
                return 1;
            }

            int count = 0;

            while (number > 0) {
                count++;
                number /= 10;
            }

            return count;
        }


    }

