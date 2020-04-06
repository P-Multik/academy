package by.academy.lesson2.twoNumbers;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Хай! Введи первое число!");
        int x = scan1.nextInt();
        System.out.println("Отлично! У нас есть число " + x);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Теперь введи второе число");
        int y = scan2.nextInt();
        System.out.println("Хорошая работа! Второе число " + y);
        System.out.println("Теперь у нас есть " + x + " и " + y + "!");
        Scanner text = new Scanner(System.in);
        float theArithmeticMean = (x+y)/2f;
        System.out.println("Хочешь открою тайну этих чисел?:)");
        String string = text.nextLine();
        switch (string) {
            case "нет":
            System.out.println("Тогда пока:-(");
            break;
         case "да":
            System.out.println("Секрет этих чисел прост!");
            if (x>y){System.out.println("Короче, " + x + " больше " + y);}
            else if (x<y){System.out.println("Короче, " + x + " меньше " + y);}
            else if (x==y){System.out.println("Надо же! Твои числа равны!");}
             System.out.println("А среднее арифметическое этих чисел будет " + theArithmeticMean);
             System.out.println("Пока:-)");
            break;
            default:
            System.out.println("Надо было 'да' говорить! Я пока еще не знаю, что делать в этом случае, поэтому - Пока:-/");
        }
    }
}