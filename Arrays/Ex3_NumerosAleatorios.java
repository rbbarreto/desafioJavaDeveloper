package Arrays;

import java.util.Random;

/*
* Faça um programa que leaia 20 numeros inteiros aleatórios (entre 0 e 1000) armazene-os num vetor.
* ao final mostre os numeros e seus sucessores
* */
public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numeroAletorios = new int[20];

        for (int i = 0; i < numeroAletorios.length; i++ ){

            int  numero = random.nextInt(100);

            numeroAletorios[i] = numero;
        }

        System.out.print(" Numero Aleatorios : ");
        for(int numero: numeroAletorios){
            System.out.print( numero + " ");
        }

        System.out.print("\n Sucessores dos Numeros Aleatorios : ");
        for(int numero: numeroAletorios){
            System.out.print(( numero + 1) + " ");
        }

        System.out.print("\n Antecessor dos Numeros Aleatorios : ");
        for(int numero: numeroAletorios){
            System.out.print((numero - 1) + " ");
        }



    }
}
