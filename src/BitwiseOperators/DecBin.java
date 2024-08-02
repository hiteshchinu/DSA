package BitwiseOperators;

class Converter {
    public String toBinary(int decimal) {
        String result = "";
        while (decimal != 0) {
            int lastBit = decimal & 1;
            result = lastBit + result;
            decimal = decimal >> 1;
        }
        return result;
    }

    public int toDecimal(int binary) {
        int result = 0;
        int power = 0;
        while (binary != 0) {
        int lastDigit = binary % 10;
        if (lastDigit == 1)
        result = result + (int) Math.pow(2, power);
        power = power + 1;
        binary = binary / 10;
        }
        return result;
    }

}

public class DecBin {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.toBinary(10));
        System.out.println(converter.toBinary(20));
        System.out.println(converter.toBinary(42));
        System.out.println(converter.toBinary(17));

        System.out.println(converter.toDecimal(1010));
        System.out.println(converter.toDecimal(10100));
        System.out.println(converter.toDecimal(101010));
        System.out.println(converter.toDecimal(10001));
    }
}
