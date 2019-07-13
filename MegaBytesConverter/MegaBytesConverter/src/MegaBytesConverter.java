public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            long megaBytes = Math.round(kiloBytes / 1024);
            long kiloBytesRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "+ megaBytes + " MB and " + kiloBytesRemainder + " KB");
        }
    }


}
