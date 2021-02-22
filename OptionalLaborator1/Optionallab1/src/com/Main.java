package com;


import java.util.ArrayList;

public class Main {

    public static void displayMatrix(int[][] matrix, int n) {
        for(int i = 0; i < n; i++) {
            for( int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void displayMatrixTree(ArrayList<Integer> arr, int n) {
        int[][] adjTree = new int[n][n]; // folosim o matrice pe care o intitializam cu 0
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                adjTree[i][j] = 0;
            }
        }

        for (int j = 0; j < n - 1; j++){ // preluam fiecare element din vector impreuna cu vecinul lui si adaugam cifra 1 in matricea respectiva
            int x = arr.get(j);
            int y = arr.get(j+1);
            adjTree[x][y] = 1;
            adjTree[y][x] = 1;

        }
        for(int  i = 0; i < n; i++){                    // afisam matricea
            for(int j = 0; j < n; j++) {
                System.out.print(adjTree[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n)
    {
        int[][] visited = new int[n][n];            // creem o matrice care sa retina daca o valoare din matrice e vizitata sau nu
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                visited[i][j] = 0;
            }
        }
        int[][] adjMatrix = new int[n][n];                  // initializam matricea cu 0
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                adjMatrix[i][j] = 0;
            }
        }

        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i!=j && visited[i][j] == 0)                                        // in caz ca nodurile sunt diferite se va adauga 0 sau 1
                {     adjMatrix[i][j] = (int)Math.round(Math.random());                 // generam numere random intre 0 si 1
                      adjMatrix[j][i] = adjMatrix[i][j];
                      visited[i][j] = 1;                                            // adaugam in matricea visited valoarea 1 care inseamna ca am vizitat acel nod
                      visited[j][i] = 1;
                }
            }
        }
        return adjMatrix;
    }
    public static boolean isConnected(int[][] adjMatrix, int n) {
        int visited[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(adjMatrix[i][j] == 1 && visited[i] == 0)
                {
                    visited[i] = 1;
                }
            }
        }
        boolean connected = false;
        for (int i = 1; i < n; i++)
        {
            if(visited[i] == 1)
            {
                connected = true;
            }
            else
            {
                connected = false;
                break;
            }
        }
        return connected;

    }
    public static void dfs(int node, int[][] adjMatrix, int n, int[] visited, ArrayList<Integer> arr)
    {
        visited[node] = 1;
        arr.add(node);
        for(int i = 0; i<n; i++)
        {
            if(adjMatrix[i][node] == 1 && visited[i] == 0 )
            {
                dfs(i,adjMatrix,n,visited,arr);
            }
        }
    }
    public static void main(String[] args)
    {
        if(args.length < 1) {
            System.err.println("You need to introdude an argument");
        }
        try {
            int[] arr = new int[2];
            int n;
            n = Integer.parseInt(args[0]);

            if(n % 2 == 0) {
                System.err.println("Variable n need to be odd");
            }
            else {
                long startTime = System.nanoTime();
                int[] visited = new int[n];
                for(int i = 0; i < n; i++) {
                    visited[i] = 0;
                }
                ArrayList<Integer> vector = new ArrayList<Integer>(); // creem un vector cu elementele arborelui
                int[][] adjMatrix = new int[n][n];                    // matricea grafului
                int[][] adjMatrixTree = new int[n][n];                  // matricea arborelui
                adjMatrix = generateMatrix(n);                        // generam o matrice
                if( n < 30000) {
                    displayMatrix(adjMatrix,n);
                }
                dfs(0,adjMatrix,n,visited,vector);
                System.out.println(isConnected(adjMatrix,n));           // Afisam daca e conex sau nu
                displayMatrixTree(vector, n);
                System.out.println("The tree is: ");
                for (int i : vector) {
                    System.out.print(vector.get(i) + " ");                  // afisam componentele arborelui
                }
                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println();
                System.out.println(totalTime + " nanosec");
            }
        }
        catch (Exception e) {
            System.out.println("Invalid argument");
        }
    }
}
