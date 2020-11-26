package cracking_code_interview.arrays_and_strings;

import java.util.ArrayList;

public class ZeroMatrix_1_8 {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,0},{3,9,5},{6,7,8}};
        int m = 3, n = 3;
        ArrayList<Integer> rows =new ArrayList<Integer>();
        ArrayList<Integer> columns =new ArrayList<Integer>();
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
               if(matrix[i][j] == 0)
               {
                   rows.add(i);
                   columns.add(j);
               }
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(Integer j : columns)
            {
                matrix[i][j] = 0;
            }
        }
        for(int j = 0; j < m; j++)
        {
            for(Integer i : rows)
            {
                matrix[i][j] = 0;
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
