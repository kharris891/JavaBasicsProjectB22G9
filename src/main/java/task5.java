public class task5 {

    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable.

        // Write a program to swap 2 numbers without a temporary variable

        // assign the value to numbers

        int Number1=20;
        int Number2=40;
        // Print numbers before swap

        System.out.println("Before Swap");
        System.out.println("Number 1 = " +Number1);
        System.out.println("Number 2 = " +Number2);

        // Swapping numbers

        Number1=Number1 + Number2; //(num1=20 num2=40; 20+40=60)
        Number2=Number1 - Number2; //(num2=40 num=20; 60-40=20
        Number1=Number1 -Number2; //( 60-20=40)
        // Print numbers after swap

        System.out.println("After Swap");
        System.out.println("Number 1 = " +Number1);
        System.out.println("Number 2 = " +Number2);

    }
}
