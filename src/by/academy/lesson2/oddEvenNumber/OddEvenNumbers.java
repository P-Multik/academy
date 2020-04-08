package by.academy.lesson2.oddEvenNumber;

import java.util.Scanner;

public class OddEvenNumbers {
        public static void main(String[] args) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Привет! Введи любое число, я скажу четное ли оно или нет!");
            int x = scan1.nextInt();
            if(x%2==0){System.out.println("Твое число " + x + " четное! Пока:)");
}else if (x % 2 != 0){System.out.println("Твое число " + x + " нечетное! Пока:)");
}}}
