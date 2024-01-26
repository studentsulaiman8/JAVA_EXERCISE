public class FlourPackProblem {

        // write code here
        public static boolean canPack(int bigCount, int smallCount, int goal) {
            if (bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }

            int bigKilos = bigCount * 5;
            int smallKilos = smallCount * 1;

            if (bigKilos + smallKilos < goal) {
                return false;
            }

            if (goal % 5 > smallKilos) {
                return false;
            }

            return true;
        }

    }

