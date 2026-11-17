package org.example;

import java.util.Scanner;

public class at2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriz[i][j] = Integer.parseInt(sc.nextLine());
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma: " + soma);
    }
}
