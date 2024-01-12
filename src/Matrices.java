public class Matrices {
    public static void main(String[] args) {
        
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[1][1] = 2;
        array[2][2] = 3;
        System.out.println(array[1][1]);


        //forma sencilla
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(array2[2][2]);
        //recorrido de la matriz
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array2[i][j]);
            }
        }
    }
}
