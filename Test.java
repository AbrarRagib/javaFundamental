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

