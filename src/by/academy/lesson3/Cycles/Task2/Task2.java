package by.academy.lesson3.Cycles.Task2;
//  Составьте программу, котораЯ вычисляет сумму чисел от 1 до n.значение n вводится с клавиатуры.
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число");
        int n = scan.nextInt();
        int sumOfNumbers = 0;
        for (int number=1; number<=n;number++){ sumOfNumbers = number+sumOfNumbers;
           }
        System.out.println(sumOfNumbers);
    }}

