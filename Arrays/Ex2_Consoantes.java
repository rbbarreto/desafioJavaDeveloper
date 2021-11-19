package Arrays;

/*
 * Faça um Programa qua leia um vetor de 6 caracleres,
 * e diga quantas foram lidas.
 * imprima as consoantes
 * */

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0;

        int count = 0;
        do {

            System.out.println("Letras: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        for (String consoate : consoantes) {

            if(consoate != null)
            System.out.println(consoate + " ");
        }

        System.out.println("Quantidade de Consoantes " + quantidadeConsoantes);
    }
}
