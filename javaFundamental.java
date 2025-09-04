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




//  // 1 Integer Literals
//         int decimal = 10;        // Decimal (base 10)
//         int binary = 0b1010;     // Binary (base 2) → equals 10
//         int octal = 012;         // Octal (base 8) → equals 10
//         int hex = 0xA;           // Hexadecimal (base 16) → equals 10

//         System.out.println("Integer Literals:");
//         System.out.println("Decimal: " + decimal);
//         System.out.println("Binary: " + binary);
//         System.out.println("Octal: " + octal);
//         System.out.println("Hexadecimal: " + hex);

//         // 2 Floating-Point Literals
//         double pi = 3.14159;     // By default numbers with decimal are double
//         float rate = 5.75f;      // Must add 'f' or 'F' for float type

//         System.out.println("\nFloating-Point Literals:");
//         System.out.println("Double: " + pi);
//         System.out.println("Float: " + rate);

//         // 3 Character Literals
//         char letter = 'A';       // Single character inside single quotes
//         char newLine = '\n';     // Escape sequence for newline
//         char unicode = '\u0041'; // Unicode representation of 'A'

//         System.out.println("\nCharacter Literals:");
//         System.out.println("Letter: " + letter);
//         System.out.println("Newline (escape sequence used before this line)");
//         System.out.println("Unicode: " + unicode);

//         // 4 String Literals
//         String message = "Hello, Abrar!";
//         System.out.println("\nString Literal:");
//         System.out.println(message);

//         // 5 Boolean Literals
//         boolean isJavaFun = true;
//         boolean isSleeping = false;

//         System.out.println("\nBoolean Literals:");
//         System.out.println("Is Java fun? " + isJavaFun);
//         System.out.println("Am I sleeping? " + isSleeping);

//         // 6 Null Literal
//         String nothing = null; // null means no value/reference
//         System.out.println("\nNull Literal:");
//         System.out.println("Value of nothing: " + nothing);










/**
 * TypeConversionExample.java
 * --------------------------
 * This program demonstrates different types of type conversion in Java.
 * Type Conversion = converting one data type into another.
 *
 * Types of Conversion:
 * 1. Widening Conversion (Implicit / Automatic)
 * 2. Narrowing Conversion (Explicit / Casting)
 * 3. Conversion between Strings and numbers
 */



// // 1. Widening Conversion (Implicit)
//         // Small data type converted automatically to larger data type
//         int intVal = 100;
//         double doubleVal = intVal;  // int → double automatically
//         System.out.println("Widening Conversion:");
//         System.out.println("int value: " + intVal);
//         System.out.println("Converted to double: " + doubleVal);

//         System.out.println("---------------------------------");

//         // 2. Narrowing Conversion (Explicit / Casting)
//         // Large data type converted to smaller data type using cast
//         double doubleNum = 9.78;
//         int intNum = (int) doubleNum; // double → int (fraction lost)
//         System.out.println("Narrowing Conversion:");
//         System.out.println("double value: " + doubleNum);
//         System.out.println("Converted to int: " + intNum);

//         System.out.println("---------------------------------");

//         // 3. Conversion between Strings and numbers
//         String strNum = "50";
//         int parsedInt = Integer.parseInt(strNum);   // String → int
//         double parsedDouble = Double.parseDouble("3.14"); // String → double
//         System.out.println("String to Number Conversion:");
//         System.out.println("String: " + strNum + ", Converted to int: " + parsedInt);
//         System.out.println("String: 3.14, Converted to double: " + parsedDouble);

//         // Number → String conversion
//         int num = 25;
//         String numStr = Integer.toString(num);      // int → String
//         double dbl = 7.89;
//         String dblStr = Double.toString(dbl);      // double → String
//         System.out.println("Number to String Conversion:");
//         System.out.println("int 25 → String: " + numStr);
//         System.out.println("double 7.89 → String: " + dblStr);

//         System.out.println("---------------------------------");

//         // 4. Automatic Type Promotion in Expressions
//         byte a = 10;
//         byte b = 20;
//         int sum = a + b; // byte + byte → int automatically
//         System.out.println("Automatic Type Promotion in Expressions:");
//         System.out.println("byte a + byte b = " + sum);






























/**
 * ArithmeticOperations.java
 * -------------------------
 * This program demonstrates basic arithmetic operations in Java.
 * Arithmetic operations = operations that involve numbers to calculate results.
 *
 * Operations covered:
 * 1. Addition (+)
 * 2. Subtraction (-)
 * 3. Multiplication (*)
 * 4. Division (/)
 * 5. Modulus (%)
 * 6. Increment (++) and Decrement (--)
 */



// // 1. Addition
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println("Addition:");
//         System.out.println(a + " + " + b + " = " + sum);

//         // 2. Subtraction
//         int diff = b - a;
//         System.out.println("\nSubtraction:");
//         System.out.println(b + " - " + a + " = " + diff);

//         // 3. Multiplication
//         int product = a * b;
//         System.out.println("\nMultiplication:");
//         System.out.println(a + " * " + b + " = " + product);

//         // 4. Division
//         int quotient = b / a;   // Integer division
//         System.out.println("\nDivision:");
//         System.out.println(b + " / " + a + " = " + quotient);

//         double preciseQuotient = (double) b / a; // For decimal result
//         System.out.println("Precise division (double): " + b + " / " + a + " = " + preciseQuotient);

//         // 5. Modulus (remainder)
//         int remainder = b % a;
//         System.out.println("\nModulus:");
//         System.out.println(b + " % " + a + " = " + remainder);

//         // 6. Increment and Decrement
//         int x = 5;
//         System.out.println("\nIncrement and Decrement:");
//         System.out.println("Original x = " + x);
//         System.out.println("x++ = " + (x++));  // Post-increment
//         System.out.println("After x++ , x = " + x);
//         System.out.println("++x = " + (++x));  // Pre-increment
//         System.out.println("x-- = " + (x--));  // Post-decrement
//         System.out.println("--x = " + (--x));  // Pre-decrement














/**
 * RelationalOperators.java
 * ------------------------
 * This program demonstrates relational operators in Java.
 * Relational operators are used to compare two values and return a boolean (true/false).
 *
 * Relational operators:
 * 1. Equal to (==)
 * 2. Not equal to (!=)
 * 3. Greater than (>)
 * 4. Less than (<)
 * 5. Greater than or equal to (>=)
 * 6. Less than or equal to (<=)
 */








//  int a = 10;
//         int b = 20;

//         // 1. Equal to
//         boolean isEqual = (a == b);
//         System.out.println("Equal to (==): " + a + " == " + b + " → " + isEqual);

//         // 2. Not equal to
//         boolean isNotEqual = (a != b);
//         System.out.println("Not equal to (!=): " + a + " != " + b + " → " + isNotEqual);

//         // 3. Greater than
//         boolean isGreater = (a > b);
//         System.out.println("Greater than (>): " + a + " > " + b + " → " + isGreater);

//         // 4. Less than
//         boolean isLess = (a < b);
//         System.out.println("Less than (<): " + a + " < " + b + " → " + isLess);

//         // 5. Greater than or equal to
//         boolean isGreaterOrEqual = (a >= b);
//         System.out.println("Greater than or equal to (>=): " + a + " >= " + b + " → " + isGreaterOrEqual);

//         // 6. Less than or equal to
//         boolean isLessOrEqual = (a <= b);
//         System.out.println("Less than or equal to (<=): " + a + " <= " + b + " → " + isLessOrEqual);





























/**
 * LogicalOperators.java
 * ---------------------
 * This program demonstrates logical operators in Java.
 * Logical operators are used to combine multiple boolean expressions.
 *
 * Logical operators:
 * 1. AND (&&)
 * 2. OR (||)
 * 3. NOT (!)
 */









        // // Logical Operators Example
        // boolean boolA = true;
        // boolean boolB = false;

        // // 1. AND (&&)
        // boolean andResult = boolA && boolB;
        // System.out.println("Logical AND (boolA && boolB): " + andResult);

        // // 2. OR (||)
        // boolean orResult = boolA || boolB;
        // System.out.println("Logical OR (boolA || boolB): " + orResult);

        // // 3. NOT (!)
        // boolean notA = !boolA;
        // boolean notB = !boolB;
        // System.out.println("Logical NOT (!boolA): " + notA);
        // System.out.println("Logical NOT (!boolB): " + notB);

        // // Example with expressions
        // int x = 10;
        // int y = 20;
        // boolean result = (x < y) && (y > 15); // true && true → true
        // System.out.println("\nExample with expressions (x < y && y > 15): " + result);














        /**
 * IfElseExample.java
 * ------------------
 * This program demonstrates the usage of if-else statements in Java.
 * The if-else statement is used to execute different blocks of code
 * based on a condition (boolean expression).
 *
 * Types of if statements:
 * 1. if
 * 2. if-else
 * 3. if-else-if ladder
 * 4. nested if
 */




 int num = 15;

        // 1. Simple if
        if (num > 10) {
            System.out.println("Number is greater than 10");
        }

        // 2. if-else
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 3. if-else-if ladder
        if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("Number is zero");
        } else if (num > 0 && num <= 10) {
            System.out.println("Number is positive and less than or equal to 10");
        } else {
            System.out.println("Number is positive and greater than 10");
        }

        // 4. Nested if
        int a = 20, b = 30;
        if (a > 10) {
            if (b > 25) {
                System.out.println("a is greater than 10 and b is greater than 25");
            }
        }

































 



















        
    }
}