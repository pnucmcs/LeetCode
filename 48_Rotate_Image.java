class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int c[][] = makediagonalone(n);
        int d[][] = multiplyMatrix(c, matrix);
        int e[][] = transpose(d);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++ ){
                matrix[i][j]=e[i][j];
            }
        }
    }
    public static int[][] makediagonalone(int n) {
        int diag[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if ((i + j+1) == n) {
                    diag[i][j] = 1;
                }else{
                    diag[i][j] = 0;
                }
            }
        }
        return diag;
    }
    public static int[][] transpose(int A[][]) {
        int i, j;
        int n = A.length;
        int B[][] = new int[A.length][A.length];
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                B[i][j] = A[j][i];
        return B;
    }
    public static int[][] multiplyMatrix(int A[][], int B[][]) {
        int len = A.length;
        int i, j, k;
        int C[][] = new int[len][len];
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                for (k = 0; k < len; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        return C;
    }
    public static void print(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}