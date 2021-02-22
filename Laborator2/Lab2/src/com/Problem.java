package com;

import java.util.Scanner;

public class Problem{

    Problem(int n)
    {
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                Scanner myObj = new Scanner(System.in);         //Vom crea un obiect de tip Scanner
                String input = myObj.nextLine();            //Citim input-ul de la tastatura
                matrix[i][j] = Integer.parseInt(input);
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
