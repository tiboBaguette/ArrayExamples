package be.vdab;

import java.util.Arrays;

public class Arrays101 {
    public static void main(String[] args) {
        int[] tabel = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(tabel));

        tabel = new int[3];
        tabel[0] = 10;
        tabel[1] = 20;
        tabel[2] = 30;
        System.out.println(Arrays.toString(tabel));

        int getal = tabel[1] + tabel[2];
        System.out.println(getal);

        int tabelLengte = tabel.length;
        System.out.println(tabelLengte);

        int som = 0;
        for (int value : tabel) {
            som += value;
        }
        int gemiddelde = som / tabel.length;
        System.out.println("De som van de tabel is: " + som);
        System.out.println("Het gemiddelde van de tabel is " + gemiddelde);

        String[] trees = new String[] {"Birch", "Oak", "Spruce"};
        for (String tree : trees) {
            System.out.println(tree);
        }

        String treehugger = "Trees are the lungs of the earth";
        String[] words = treehugger.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        int[][] array2d = { {3, 7, 9}, {2, 1}, {3, 5, 9}, {9, 9, 9, 9, 9} };

        float[][] floatArray2d = new float[4][];
        for (int i = 0; i < floatArray2d.length; i++) {
            floatArray2d[i] = new float[5];
        }
        floatArray2d[0][0] = 3.14159f;

        System.out.println(floatArray2d.length);
        System.out.println(floatArray2d[2].length);

        boolean[][] booleanArray2d = new boolean[5][];

        for (int i = 0; i < 5; i++) {
            booleanArray2d[i] = new boolean[5];
            for (int j = 0; j < 5; j++) {
                booleanArray2d[i][j] = true;
                System.out.print(booleanArray2d[i][j] + " ");
            }
            System.out.println("Row " + i );
        }
    }
}
