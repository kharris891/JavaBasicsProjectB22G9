public class task3 {

    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers. Develop a program
        //that will identify/print the even numbers only.
        int[][] numbers = {
                {69, 12, 46, 70, 22, 8, 37, 90, 10, 77, 44, 30, 52, 14, 108}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
