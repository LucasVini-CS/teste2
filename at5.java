package org.example;

import java.util.Scanner;

public class at5 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Diagonal");

        for (int i = 0; i < 3; i++)
        {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}