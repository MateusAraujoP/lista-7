/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atividadelista7;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo de Paula
 */
public class AtividadeLista7 {

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == 1) {
            return i;
        } else if (j == i) {
            return 1;
        } else {
            return pascal(i - 1, j) + pascal(i - 1, j - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Exercicio 1:");
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor A posicao " + (i + 1));
            vetorA[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor B posicao " + (i + 1));
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - (vetorB[i] * vetorA[i]);
            System.out.println("Vetor C posicao " + (i + 1) + ": " + vetorC[i]);
        }

        System.out.println("\n Exercicio 2:");
        int vetorNaturais[] = new int[100];
        int i = 0;
        int j = 0;
        while (i < 100) {
            j++;
            if (j % 7 != 0 || j % 10 == 7) {
                vetorNaturais[i] = j;
                System.out.println(vetorNaturais[i]);
                i++;
            }
        }

        System.out.println("\n Exercicio 3:");
        int numerosInt[] = new int[6];
        for (i = 0; i < 6; i++) {
            System.out.println("Entre o " + (i + 1) + "º numero:");
            numerosInt[i] = sc.nextInt();
        }
        System.out.println("Numeros pares: ");
        int somaPares = 0;
        for (i = 0; i < 6; i++) {
            if (numerosInt[i] % 2 == 0) {
                System.out.print(numerosInt[i] + " ");
                somaPares = somaPares + numerosInt[i];
            }
        }
        System.out.println("\nSoma dos numeros pares: " + somaPares);
        System.out.println("Numeros impares: ");
        int quantidadeImpares = 0;
        for (i = 0; i < 6; i++) {
            if (numerosInt[i] % 2 != 0) {
                System.out.print(numerosInt[i] + " ");
                quantidadeImpares++;
            }
        }
        System.out.println("\nQuantidade de numeros impares: " + quantidadeImpares);

        System.out.println("\n Exercicio 4:");
        String vetor1[] = new String[10];
        String vetor2[] = new String[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor 1 posicao " + (i + 1));
            vetor1[i] = sc.next();
        }
        for (i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor 2 posicao " + (i + 1));
            vetor2[i] = sc.next();
        }
        System.out.println("Elementos do vetor 3:\n");
        String vetor3[] = new String[20];
        vetor3[0] = vetor1[0];
        if (vetor2[0].equals(vetor3[0])) {
            vetor3[1] = "";
        } else {
            vetor3[1] = vetor2[0];
        }
        j = 1;
        boolean repetido = false;
        for (i = 2; i < 20;) {
            for (int k = i - 1; k >= 0; k--) {
                if (vetor1[j].equals(vetor3[k])) {
                    repetido = true;
                    vetor3[i] = "";
                    break;
                }
            }
            if (repetido == false) {
            vetor3[i] = vetor1[j];    
            }
            repetido = false;
            for (int k = i; k >= 0; k--) {
                if (vetor2[j].equals(vetor3[k])) {
                    repetido = true;
                    vetor3[i + 1] = "";
                    break;
                }
            }
            if (repetido == false) {
            vetor3[i + 1] = vetor2[j];    
            }
            repetido = false;
            i++;
            i++;
            j++;
        }
        for (i = 0; i < 20; i++) {
            if (!vetor3[i].equals("")) {
            System.out.println(vetor3[i]);    
            }
        }

        System.out.println("\n Exercicio 5:");
        System.out.println("Escolha um numero de linhas para o triangulo de pascal:");
        int linhas = sc.nextInt();
        for (i = 0; i < linhas; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }
}
