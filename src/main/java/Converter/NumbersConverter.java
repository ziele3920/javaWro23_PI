package Converter;

public class NumbersConverter {
    public String binaryToDecimal(String binaryNumber) {
        int power = 0, sum = 0;
        char[] binaryCharArray = binaryNumber.toCharArray();
        for(int i = binaryCharArray.length - 1; i>=0; i--) {
            int currentBit = Character.getNumericValue(binaryCharArray[i]);
            sum += currentBit * Math.pow(2, power++);
        }
        return Integer.toString(sum);
    }
}
