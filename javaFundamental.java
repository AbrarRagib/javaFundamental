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




//  int num = 15;

//         // 1. Simple if
//         if (num > 10) {
//             System.out.println("Number is greater than 10");
//         }

//         // 2. if-else
//         if (num % 2 == 0) {
//             System.out.println("Number is even");
//         } else {
//             System.out.println("Number is odd");
//         }

//         // 3. if-else-if ladder
//         if (num < 0) {
//             System.out.println("Number is negative");
//         } else if (num == 0) {
//             System.out.println("Number is zero");
//         } else if (num > 0 && num <= 10) {
//             System.out.println("Number is positive and less than or equal to 10");
//         } else {
//             System.out.println("Number is positive and greater than 10");
//         }

//         // 4. Nested if
//         int a = 20, b = 30;
//         if (a > 10) {
//             if (b > 25) {
//                 System.out.println("a is greater than 10 and b is greater than 25");
//             }
//         }



// //if Else if
//  int num = 75;

//         // Check the grade based on marks
//         if (num >= 90) {
//             System.out.println("Grade: A+");
//         } else if (num >= 80) {
//             System.out.println("Grade: A");
//         } else if (num >= 70) {
//             System.out.println("Grade: B");
//         } else if (num >= 60) {
//             System.out.println("Grade: C");
//         } else if (num >= 50) {
//             System.out.println("Grade: D");
//         } else {
//             System.out.println("Grade: F");
//         }

//         // Example with negative or zero check
//         int value = -10;

//         if (value > 0) {
//             System.out.println("Value is positive");
//         } else if (value == 0) {
//             System.out.println("Value is zero");
//         } else {
//             System.out.println("Value is negative");
//         }












// int a = 10;
// int b = 20;

// if (a > b) {
//     System.out.println("A is greater than B");
// } else { 
//     System.out.println("B is greater than A");
// }




















/**
 * TernaryOperatorExample.java
 * ---------------------------
 * The ternary operator in Java is a shorthand for if-else statements.
 * Syntax:
 *      variable = (condition) ? expression_if_true : expression_if_false;
 */







// // Example 1: Simple number check
//         int num = 10;
//         String result = (num % 2 == 0) ? "Even" : "Odd"; 
//         System.out.println(num + " is " + result);

//         // Example 2: Finding the maximum of two numbers
//         int a = 15, b = 20;
//         int max = (a > b) ? a : b;
//         System.out.println("Maximum: " + max);

//         // Example 3: Nested ternary (for multiple conditions)
//         int marks = 85;
//         String grade = (marks >= 90) ? "A+"
//                         : (marks >= 75) ? "A"
//                         : (marks >= 60) ? "B"
//                         : (marks >= 50) ? "C"
//                         : "F";
//         System.out.println("Marks: " + marks + " → Grade: " + grade);

//         // Example 4: Checking positive, negative, or zero
//         int value = -5;
//         String check = (value > 0) ? "Positive" : (value == 0 ? "Zero" : "Negative");
//         System.out.println("Value " + value + " is " + check);

 











/**
 * SwitchStatementExample.java
 * ---------------------------
 * The switch statement in Java is used to execute one block of code 
 * among many options, based on the value of a variable/expression.
 *
 * Syntax:
 *      switch (expression) {
 *          case value1:
 *              // code block
 *              break;
 *          case value2:
 *              // code block
 *              break;
 *          ...
 *          default:
 *              // code block if no case matches
 *      }
 */








//  int day = 3; // 1 = Monday, 2 = Tuesday, etc.
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day number!");
//         }

//         System.out.println("----------------------------------");

//         // Example 2: Switch with Strings
//         String fruit = "Mango";
//         switch (fruit) {
//             case "Apple":
//                 System.out.println("Red fruit");
//                 break;
//             case "Banana":
//                 System.out.println("Yellow fruit");
//                 break;
//             case "Mango":
//                 System.out.println("King of fruits");
//                 break;
//             default:
//                 System.out.println("Unknown fruit");
//         }

//         System.out.println("----------------------------------");

//         // Example 3: Multiple cases together
//         char grade = 'B';
//         switch (grade) {
//             case 'A':
//             case 'B':
//                 System.out.println("Excellent performance!");
//                 break;
//             case 'C':
//                 System.out.println("Good effort!");
//                 break;
//             case 'D':
//                 System.out.println("Needs improvement.");
//                 break;
//             case 'F':
//                 System.out.println("Failed.");
//                 break;
//             default:
//                 System.out.println("Invalid grade!");
//         }




// New switch Expression (Java 12 preview → stable in Java 14)

// Switch can now return a value (expression).

// Use -> (arrow labels) instead of :.

// No need for break.

// Multiple case labels can be combined with commas.

// int day = 3;

// // Switch Expression returning a value
// String result = switch (day) {
//     case 1 -> "Monday";
//     case 2 -> "Tuesday";
//     case 3 -> "Wednesday";
//     case 4, 5 -> "Almost Weekend";  // Multiple cases together
//     case 6, 7 -> "Weekend";
//     default -> "Invalid day";
// };

// System.out.println(result);


        





// yield in Switch (Java 13+)

// If a case has multiple statements, use yield to return a value.


// int score = 85;

// String grade = switch (score / 10) {
//     case 10, 9 -> "A";
//     case 8 -> "B";
//     case 7 -> "C";
//     case 6 -> "D";
//     default -> {
//         // Multiple statements
//         System.out.println("Score too low!");
//         yield "F";  // return value from block
//     }
// };

// System.out.println("Grade: " + grade);






// int day = 1;
//  String result;

//  switch (day) {
//     case 1: 
//         result = "Saturday";
//         break;
//     case 2:
//         result = "Sunday";
//         break;
//     case 3: 
//         result = "Monday";
//         break;
//     default:
//         result = "Invalid day";
//         break;
        
    
//  }
//  System.out.println(result);






// int day = 1;
// String result = switch (day){
//     case 1 -> "Saturday";
//     case 2 -> "Sunday";
//     case 3 -> "Monday";
//     case 4,5 -> "Almost Weekend";
//     case 6,7 -> "Weekend";
//     default -> "Invalid Day";

// };

// System.out.println(result);






// int score = 1000;

// String grade = switch (score / 10) {
//     case 10,9 -> "A";
//     case 8 -> "B";
//     case 7 -> "C";
//     case 6 -> "D";
//     default -> {
//         if (score > 100){
//             yield "Invalid Score(Too High)";
//         }else if (score < 0){
//             yield "Invalid Score(Negative)";
//         }else{
//             yield "F";
//         }
//     }
// };
// System.out.println("Score: " + score + " Grade: " + grade);

















/**
 * ForLoopExample.java
 * -------------------
 * A for loop in Java is used when you want to repeat a block of code 
 * a specific number of times.
 *
 * Syntax:
 *   for (initialization; condition; update) {
 *       // code block
 *   }
 */





    // System.out.println("Counting from 1 to 5: ");
    // for (int i = 1; i <= 5; i++){
    //     System.out.println("i = " + i);
    // }


    // System.out.println("Counting from 5 to 1: ");
    // for (int i = 5; i >= 1; i--){
    //     System.out.println("i = " + i);
    // }


    
        
// // Example 1: Simple counting loop
//         System.out.println("Counting from 1 to 5:");
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("i = " + i);
//         }

//         System.out.println("----------------------------");

//         // Example 2: Loop with decrement
//         System.out.println("Counting down from 5 to 1:");
//         for (int i = 5; i >= 1; i--) {
//             System.out.println("i = " + i);
//         }

//         System.out.println("----------------------------");

//         // Example 3: For loop with step increment
//         System.out.println("Even numbers from 2 to 10:");
//         for (int i = 2; i <= 10; i += 2) {
//             System.out.println("i = " + i);
//         }

//         System.out.println("----------------------------");

//         // Example 4: Nested for loop
//         System.out.println("Multiplication table (1 to 3):");
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= 3; j++) {
//                 System.out.print((i * j) + "\t"); // print in same line with tab
//             }
//             System.out.println(); // new line after each row
//         }

//         System.out.println("----------------------------");

//         // Example 5: Infinite for loop (use with caution)
//         // Uncomment to test
//         /*
//         for (;;) {
//             System.out.println("This will run forever unless you break!");
//             break; // without this break, it runs infinitely
//         }
//         */
















// While Loop in Java

// A while loop repeats a block of code as long as a condition is true.

// First, it checks the condition.

// If true, the code runs.

// Then it checks again, and keeps looping.

// If false, the loop stops.






//  // Example 1: Simple Counting
//         int count = 1; // initialization
//         while (count <= 5) { // condition checked before every iteration
//             System.out.println("Count: " + count);
//             count++; // increment to avoid infinite loop
//         }
//         System.out.println("----------------------------");

//         // Example 2: Sum of first 10 natural numbers
//         int num = 1;
//         int sum = 0;
//         while (num <= 10) {
//             sum += num; // same as sum = sum + num
//             num++;
//         }
//         System.out.println("Sum of first 10 numbers: " + sum);
//         System.out.println("----------------------------");

//         // Example 3: Multiplication table of 5
//         int i = 1;
//         while (i <= 10) {
//             System.out.println("5 x " + i + " = " + (5 * i));
//             i++;
//         }
//         System.out.println("----------------------------");

//         // Example 4: Infinite loop (⚠ careful – will run forever)
//         // Uncommenting below will cause endless printing
//         /*
//         while (true) {
//             System.out.println("This runs forever!");
//         }
//         */



//SAU Question
    for(int i = 1; i <= 100; i++) {
        if (i % 7 == 0 &&  i % 9 == 0 ) {
            System.out.println("Merge");
        } else if ( i % 7 == 0) {
            System.out.println("seven");
        } else if (i % 9 == 0) {
            System.out.println("nine");
        } else {
            System.out.println(i);
        }
    }











        
    }
}