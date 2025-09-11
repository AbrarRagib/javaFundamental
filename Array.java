// public class Array {
//     public static void main(String a[])
//     {
//         int num[] = {10,20,30,40,50};
//         for (int i = 0; i <=3; i++){
//             System.out.println(num[i]);
//         }
   

        
//     }
// }



// public class Array {
//     public static void main(String a[])
//     {

//         int nums[] = new int[4];
//         nums[0] = 0;
//         nums[1] = 1;
//         nums[2] = 2;
//         nums[3] = 3;

//         for(int i = 0; i <=3; i++){
//             System.out.println(nums[i]);
//         }
     
//     }

        
     
// }








// public class Array {
//     public static void main(String a[])
//     {

//         int nums[][] = new int[3][4];


//         for (int i = 0; i < 3; i++){
//             for (int j = 0; j < 4; j++){
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }
//     //  //Enhanced for loop
    
//     //     for (int n[] : nums) {
//     //         for (int m : n) {
//     //             System.out.print(m + " ");
//     //         }
//     //         System.out.println();
//     //     }
 
      
//     }

        
     
// }












// What is a Jagged Array?

// A jagged array is an array of arrays where each row can have a different length.

// In contrast, a 2D array has all rows of the same length.



// public class Array {
//     public static void main(String[] args) {

//         // Declare and initialize a jagged array
//         int[][] jagged = {
//             {1, 2},
//             {3, 4, 5, 6},
//             {7, 8, 9}
//         };

//         // Print jagged array using nested for-loops
//         System.out.println("Printing jagged array with standard for-loop:");
//         for (int i = 0; i < jagged.length; i++) {        // row iteration
//             for (int j = 0; j < jagged[i].length; j++) { // column iteration
//                 System.out.print(jagged[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("--------------------------");

//         // Print jagged array using enhanced for-loop
//         System.out.println("Printing jagged array with enhanced for-loop:");
//         for (int[] row : jagged) {       // outer loop: each row
//             for (int element : row) {    // inner loop: each element in row
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }
//     }
// }























// WWhat is a 3D Array?

// A 3D array is like an array of 2D arrays.

// Conceptually: array[depth][row][column]

// Think of it as a cube of data.

// Example:
// int[][][] array3D = new int[2][3][4];


// 2 - number of 2D layers (depth)

// 3 - number of rows in each layer

// 4 - number of columns in each row










public class Array {
    public static void main(String[] args) {

        // Declare and initialize a 3D array
        int[][][] array3D = {
            {   // Layer 1
                {1, 2, 3},
                {4, 5, 6}
            },
            {   // Layer 2
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Print using nested for-loop
        System.out.println("3D Array using standard nested loops:");
        for (int i = 0; i < array3D.length; i++) {           // Depth / Layer
            System.out.println("Layer " + (i+1) + ":");
            for (int j = 0; j < array3D[i].length; j++) {    // Row
                for (int k = 0; k < array3D[i][j].length; k++) { // Column
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // new line after row
            }
            System.out.println(); // blank line after layer
        }

        System.out.println("--------------------------");

        // Print using enhanced for-loop
        System.out.println("3D Array using enhanced for-loop:");
        int layerNum = 1;
        for (int[][] layer : array3D) {     // each 2D layer
            System.out.println("Layer " + layerNum + ":");
            for (int[] row : layer) {       // each row in layer
                for (int element : row) {   // each element in row
                    System.out.print(element + " ");
                }
                System.out.println(); // new line after row
            }
            layerNum++;
            System.out.println(); // blank line after layer
        }
    }
}
