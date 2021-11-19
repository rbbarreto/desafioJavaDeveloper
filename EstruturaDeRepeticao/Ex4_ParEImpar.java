package EstruturaDeRepeticao;

import java.util.Scanner;

/*
*  Faça um programa que peça N número inteiros
* calcule e mostre a quantidade de números pares
* e a quantidade de números impares
* */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de Números: ");
        quantNumeros = scanner.nextInt();

        int count = 0;

        do {
            System.out.println("Números : ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while (count < quantNumeros);

        System.out.println("Quantidade Par:  " + quantPares);
        System.out.println("Qunatidade Impar:  "+ quantImpares);
    }
}
