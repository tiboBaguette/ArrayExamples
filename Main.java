package be.vdab;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int insertSpot = 7;
        int insertNumber = 180;

        int[] list = new int[10];
        Random generator1 = new Random();

        for (int i = 0; i < 10 ; i++) {
            list[i] = generator1.nextInt(100);
            System.out.print(list[i] + ", ");
        }

        int[] newList = returnNewArray(list, insertSpot, insertNumber);
        printArray(newList);
    }

    static int[] returnNewArray(int list[], int insertSpot, int insertNumber) {
        int[] newList = new int[list.length + 1];

        for (int i = 0; i < insertSpot; i++) {
            newList[i] = list[i];
        }
        newList[insertSpot - 1] = insertNumber;
        for (int i = insertSpot; i < newList.length; i++) {
            newList[i] = list[i - 1];
        }
        return newList;
    }

    static void printArray(int[] array) {
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
