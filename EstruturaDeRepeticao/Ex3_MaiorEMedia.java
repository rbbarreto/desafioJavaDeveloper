package EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número : ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            soma = soma + numero;

            count = count + 1;

        } while (count < 5);

        System.out.println("Média: " + (soma/5));
        System.out.println("Maior:  " + maior);
    }
}
