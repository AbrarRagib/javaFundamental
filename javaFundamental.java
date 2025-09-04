// public class javaFundamental {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 20;
//         int sum = num1 + num2;

//         System.out.println("The sum is: " + sum);
//     }
// }

public class javaFundamental {
    public static void main(String[] args) {
        // int num1 = 20;
        // int num2 = 20;
        // int sum = num1 + num2;

        // System.out.println("The sum is: " + sum);












        /**
 * LiteralsExample.java
 * ---------------------
 * A literal in Java is a constant/fixed value written directly in the code.
 * It represents the actual value that is assigned to a variable.
 *
 * Types of Literals in Java:
 * 1. Integer Literals (Decimal, Binary, Octal, Hexadecimal)
 * 2. Floating-Point Literals
 * 3. Character Literals
 * 4. String Literals
 * 5. Boolean Literals
 * 6. Null Literal
 */




 // 1 Integer Literals
        int decimal = 10;        // Decimal (base 10)
        int binary = 0b1010;     // Binary (base 2) → equals 10
        int octal = 012;         // Octal (base 8) → equals 10
        int hex = 0xA;           // Hexadecimal (base 16) → equals 10

        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);

        // 2 Floating-Point Literals
        double pi = 3.14159;     // By default numbers with decimal are double
        float rate = 5.75f;      // Must add 'f' or 'F' for float type

        System.out.println("\nFloating-Point Literals:");
        System.out.println("Double: " + pi);
        System.out.println("Float: " + rate);

        // 3 Character Literals
        char letter = 'A';       // Single character inside single quotes
        char newLine = '\n';     // Escape sequence for newline
        char unicode = '\u0041'; // Unicode representation of 'A'

        System.out.println("\nCharacter Literals:");
        System.out.println("Letter: " + letter);
        System.out.println("Newline (escape sequence used before this line)");
        System.out.println("Unicode: " + unicode);

        // 4 String Literals
        String message = "Hello, Abrar!";
        System.out.println("\nString Literal:");
        System.out.println(message);

        // 5 Boolean Literals
        boolean isJavaFun = true;
        boolean isSleeping = false;

        System.out.println("\nBoolean Literals:");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Am I sleeping? " + isSleeping);

        // 6 Null Literal
        String nothing = null; // null means no value/reference
        System.out.println("\nNull Literal:");
        System.out.println("Value of nothing: " + nothing);



        
    }
}