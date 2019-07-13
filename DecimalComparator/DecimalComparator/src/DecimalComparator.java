public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;

        int firstNumberConvert = (int) firstNumber;
        int SecondNumberConvert = (int) secondNumber;

        if (firstNumberConvert == SecondNumberConvert) {
            return true;
        }

        return false;
    }
}
