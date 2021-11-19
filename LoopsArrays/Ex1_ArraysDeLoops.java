package LoopsArrays;

public class Ex1_ArraysDeLoops {

    public static void main(String[] args) {

        int[] idades = new int[10];
        idades[0] = 27;
        idades[1] = 31;

        System.out.println("Idade 0:" + idades[0]);
        System.out.println("Idade 1:" + idades[1]);
        System.out.println("Idade 2:" + idades[2]);


        int[] i = {10, 25};
        System.out.println("i 0:" + i[0]);
        System.out.println("i 1:" + i[1]);


        int[] k = new int[]{1, 2, 3};
        System.out.println("K 0:" + k[0]);
        System.out.println("k 1:" + k[1]);
        System.out.println("k 2:" + k[2]);


        int[] j = new int[2];
        System.out.println("j 0:" + j[1]);

        idades = new int[]{12, 35, 45, 22, 9, 37, 51, 61};

        for (int idade : idades) {
            System.out.println("Idade:" + idade);
        }

        for (int a = 0; a < idades.length; a++) {
            int idade = idades[a];
            System.out.println("Idade 0:" + idade);
        }

        for (int idade : idades) {
            if (idade >= 18) {
                System.out.println("Idade " + idade + " é maior que 18 anos");
            }
        }

        for (int a = 0; a < idades.length; a++) {
            int idade = idades[a];
            if (idade >= 18) {
                System.out.println("Idade " + idade + " e maior que 18 anos");
            }
        }


        long[][] m = new long[3][3];

        char[][] jogo = new char[3][3];
        jogo[0][0] = 'X';
        jogo[2][1] = '0';
        System.out.println("Posição 0: " + jogo[0][0]);
        System.out.println("Posição 8:" + jogo[2][1]);

        int[][][] n = new int[3][3][3];
        n[0][0][0] = 10;
        n[1][1][0] = 15;

        int[][] b = new int[][]{{1, 2}, {3, 4}};
        int[][] l = {{5, 6}, {7, 8}};
        int[][][] t = new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        int[][] idades_ = new int[][] {{12,35} ,{45,25}};

        for(int[] id1: idades_){
            for (int id2: id1){
                System.out.println(id2);
            }
        }

        for (int c = 0; c < idades_.length; c++){
            int[] id = idades_[c];
            for (int d = 0; d < id.length; d++){
                System.out.println(idades_[c][d]);
            }
        }

        byte[] bytes = new byte[2];
        bytes[1] = 100;

        float[] floats = new float[2];
        floats[1] = 1098f;

        for (byte bytes_: bytes){
            System.out.println("Byte: "+ bytes_);
        }

        for (float floats_: floats){
            System.out.println("floats: " + floats_);
        }


    }
}
