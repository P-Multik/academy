package by.academy.lesson3.Task1;

import java.util.Random;

/**
 * Created by user on 08.04.2020.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[20];
        Random rand = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(10);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                System.out.print(array2[i] + " ");
            }
        }

    }
}
