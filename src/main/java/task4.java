public class task4 {

    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program that will calculate the sum of even and odd
        //numbers separately for that array.

        int[][] ints = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int even = 0;
        int odd = 0;

        for (int i = 0; i < ints.length; i++) {

            for (int j = 0; j < ints[i].length; j++) {

                if (ints[i][j] % 2 == 0) {
                    even += ints[i][j];
                } else {
                    odd += ints[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);

    }
}