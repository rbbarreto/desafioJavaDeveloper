package EstruturaDeRepeticao;

import java.util.Scanner;
/*
* Desenvolva um gerador de tabuada
* capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
* o usuário deve informar de qual número ele deseha ver a tabuada
* a saída deve ser conforme o exemplo abaixo
*
* exemplo:
* tabuada de 5
*
* 5 X 1 = 5
* 5 X 2 = 10
* 5 x 3 = 15
* .....
* 5 x 10 = 50
* */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();

        for (int i = 1 ; i <= 10; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
