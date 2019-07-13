public class TeenNumberChecker {

    public static boolean hasTeen(int numberA, int numberB, int numberC){
        if(isTeen(numberA) || isTeen(numberB) || isTeen(numberC)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int singleNumber) {
        if(singleNumber >= 13 && singleNumber <= 19){
            return true;
        }
        return false;
    }
}
