package Cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 5;
        int z = 101;
        System.out.printf("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        //System.out.printf("Привет");
        for (int i = 0; i < size; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
        System.out.println();
    }
}
