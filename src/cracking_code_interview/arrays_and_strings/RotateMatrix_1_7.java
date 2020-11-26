package cracking_code_interview.arrays_and_strings;

public class RotateMatrix_1_7 {
    public static void main(String[] args) {
        int n = 3;
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrixRotated = new int[n][n];
        System.out.println("matrix before rotate : ");
        for(int i = 0; i< n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i< n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrixRotated[i][j] = matrix[n-j-1][i];
            }
        }
        System.out.println("matrix after rotate : ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrixRotated[i][j]);
            }
            System.out.println();
        }
    }
}
