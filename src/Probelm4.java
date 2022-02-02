public class Probelm4 {
    public static void main(String[] args){
        int mat[][] = { { 40,30,20 },
                        { 39,29,19 },
                        { 38,28,18 }};
        System.out.println(MatrixFind(18,mat));
    }

    public static boolean MatrixFind(int k, int[][] matrix) {
        boolean found = false;
        // Your implementation here.
        int i = 0, j = matrix.length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == k) {
                found = true;
                return found;
            }
            else if (matrix[i][j] < k) {
                j--;
            }
            else {
                //matrix[i][j]>k
                i++;
            }
        }
        return found;
    }
}
