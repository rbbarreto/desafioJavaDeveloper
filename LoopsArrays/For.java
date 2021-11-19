package LoopsArrays;

public class For {
    public static void main(String[] args) {

        // <tipo>[] nome <?=valorinicial?>; mais comum
        // ou <tipo> nome[] <?=valorinicial?>;

        int[] idades = new int[]{12, 35, 45, 22, 9, 37, 51, 61};
        idades[0] = 27;
        idades[1] = 31;

        int[] i = {10, 15};
        int[] k = new int[]{1, 2, 3};

        int[] j = new int[2];

        System.out.print("Idade: ");
        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        System.out.print("\nNova Idade: ");
        for (int M = 0; M < idades.length; M++) {
            int idade = idades[M];
            System.out.print(idade + " ");
        }



    }
}
