public class PaintJob {


        // write code here
        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;
            }

            double wallArea = width * height;
            double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);
            int totalBucketsNeeded = (int) bucketsNeeded - extraBuckets;

            return totalBucketsNeeded > 0 ? totalBucketsNeeded : 0;
        }
        public static int getBucketCount(double width, double height, double areaPerBucket) {
            return getBucketCount(width, height, areaPerBucket, 0);
        }
        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) {
                return -1;
            }

            double bucketsNeeded = Math.ceil(area / areaPerBucket);
            return (int) bucketsNeeded;
        }



    public static void main(String[] args) {
        // Example 1
        int bucketsNeeded1 = getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println("Buckets needed: " + bucketsNeeded1); // Output: -1

        // Example 2
        int bucketsNeeded2 = getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println("Buckets needed: " + bucketsNeeded2); // Output: 3

        // Example 3
        int bucketsNeeded3 = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println("Buckets needed: " + bucketsNeeded3); // Output: 3

        // Example 4
        int bucketsNeeded4 = getBucketCount(-3.4, 2.1, 1.5);
        System.out.println("Buckets needed: " + bucketsNeeded4); // Output: -1

        // Example 5
        int bucketsNeeded5 = getBucketCount(3.4, 2.1, 1.5);
        System.out.println("Buckets needed: " + bucketsNeeded5); // Output: 5

        // Example 6
        int bucketsNeeded6 = getBucketCount(7.25, 4.3, 2.35);
        System.out.println("Buckets needed: " + bucketsNeeded6); // Output: 14

        // Example 7
        int bucketsNeeded7 = getBucketCount(3.4, 1.5);
        System.out.println("Buckets needed: " + bucketsNeeded7); // Output: 3

        // Example 8
        int bucketsNeeded8 = getBucketCount(6.26, 2.2);
        System.out.println("Buckets needed: " + bucketsNeeded8); // Output: 3

        // Example 9
        int bucketsNeeded9 = getBucketCount(3.26, 0.75);
        System.out.println("Buckets needed: " + bucketsNeeded9); // Output: 5
    }

}

