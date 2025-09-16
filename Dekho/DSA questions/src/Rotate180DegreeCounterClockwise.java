public class Rotate180DegreeCounterClockwise {

    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;

        // Swap each element with its opposite
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Only swap if we haven't swapped this pair yet
                if (i < n - 1 - i || (i == n - 1 - i && j < n - 1 - j)) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[n - 1 - i][n - 1 - j];
                    mat[n - 1 - i][n - 1 - j] = temp;
                }
            }
        }

    }
}
