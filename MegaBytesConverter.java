
    public class MegaBytesConverter {


            public static void printMegaBytesAndKiloBytes ( int kiloBytes){
                MegaBytesConverter.printMegaBytesAndKiloBytes(2500); // Output: 2500 KB = 2 MB and 452 KB
                MegaBytesConverter.printMegaBytesAndKiloBytes(-1024); // Output: Invalid Value
                MegaBytesConverter.printMegaBytesAndKiloBytes(5000); // Output: 5000 KB = 4 MB and 904 KB
                if (kiloBytes < 0) {
                    System.out.println("Invalid Value");
                } else {
                    int megabytes = kiloBytes / 1024;
                    int remainingKiloBytes = kiloBytes % 1024;
                    System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
                }
            }

        }




