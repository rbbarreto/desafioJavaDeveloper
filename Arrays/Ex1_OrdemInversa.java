package Arrays;

/*
* Crie um vetor de 6 numeros inteiros
* e mostre-os ordem inversa.
* */
public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("vetor: ");

        int count =0;
        while (count < (vetor.length -1)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor inverso:  ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }

}
