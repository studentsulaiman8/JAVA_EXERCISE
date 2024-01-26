public class SharedDigit {

        public static boolean hasSharedDigit(int num1, int num2) {
            if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
                return false;
            }

            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            num1 /= 10;
            num2 /= 10;

            return (num1 == num2 || num1 == digit2 || digit1 == num2 || digit1 == digit2);
        }
    }


