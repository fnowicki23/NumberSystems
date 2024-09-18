import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number in binary: ");
        int num = readNumFromUser();
        displayDecimal(num);
        displayOctal(num);
        displayHex(num);
    }

    private static void displayDecimal(int num){
        System.out.println("Decimal: " + num);
    }
    private static void displayOctal(int num){
        System.out.printf("  Octal: %o\n", num);
    }
    private static void displayHex(int num){
        System.out.printf("    Hex: %h\n", num);
    }


    private static int readNumFromUser() throws Exception {
        int number = 0;
        int currentChar;
        while ((currentChar = System.in.read()) != '\n'){
            int inputNum = currentChar - '0';
            if (inputNum < 0 || inputNum > 1)
                throw new Exception("binary numbers can only contain 0 or 1");

            int place = System.in.available()-1;
            if (place > 15)
                throw new Exception("limit of 16 characters");


            number += inputNum << place;
        }

        return number;
    }


}
