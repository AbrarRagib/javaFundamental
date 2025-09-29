// public class Test {
//     public static void main(String[] args) {

//         // final int A = 9;
//         int A = 9;
//         A = 6;
//         A = 7;
//         A = 8;
//         A = 10;


//         System.out.println(A);
//     }
// }



public class Test {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0 && i % 9 == 0){
                System.out.println("Divisible by both 7 and 9: " + i);
            } else if (i % 7 == 0){
                System.out.println("Divisible by 7: " + i);
            } else if (i % 9 == 0){
                System.out.println("Divisible by 9: " + i);
            }else{
                System.out.println(i);
            }
        }
    }
}




// // Reverse ArrayList without Collections.reverse()

// import java.util.ArrayList;

// public class Test {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 1; i <= 5; i++) list.add(i);

//         for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
//             int temp = list.get(i);
//             list.set(i, list.get(j));
//             list.set(j, temp);
//         }

//         System.out.println("Reversed List: " + list);
//     }
// }


// import java.util.ArrayList;

// public class Test{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 1; i <= 5; i++) list.add(i);
//         System.out.println("Original List: " + list);

//         for (int i =  0, j = list.size() - 1; i < j; i++, j--) {
//             int temp = list.get(i);
//             list.set(i, list.get(j));
//             list.set(j, temp);
//         }
//         System.out.println("Reversed List: " + list);
        
//         // System.out.println("Original List: " + list.size()  );
//     }
// }
