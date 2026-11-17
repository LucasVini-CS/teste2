package org.example;

import java.util.Scanner;

public class at3 {

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
        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + maior);
    }
}
}