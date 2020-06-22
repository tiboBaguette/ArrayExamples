package be.vdab;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give array length: ");
        int arrayLength = input.nextInt();

        System.out.println("Give the number to insert: ");
        int insertNumber = input.nextInt();
        System.out.println("Give the posistion to insert: ");
        int insertSpot = input.nextInt();

        int[] list = getNewArray(arrayLength);
        int[] newList = returnNewArray(list, insertSpot, insertNumber);
        printArray(newList);
    }

    static int[] getNewArray(int arrayLenght) {
        int[] list = new int[arrayLenght];
        Random generator1 = new Random();

        for (int i = 0; i < arrayLenght ; i++) {
            list[i] = generator1.nextInt(100);
            System.out.print(list[i] + ", ");
        }

        return list;
    }

    static int[] returnNewArray(int[] list, int insertSpot, int insertNumber) {
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
