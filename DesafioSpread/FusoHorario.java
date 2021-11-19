package DesafioSpread;

import java.util.Scanner;

public class FusoHorario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        int horaDeChegada = (horasaida + tempoviagem);

        if (horaDeChegada > 24){
            int diferenca = horaDeChegada - 24;
            horaDeChegada = 0;
            horaDeChegada += diferenca;
        }
        //Escreva a sua lógica aqui
        if(horaDeChegada == 24){
            horaDeChegada = 0;
        }

        horaDeChegada += fuso;

        System.out.println(horaDeChegada);

        sc.close();
    }

}
