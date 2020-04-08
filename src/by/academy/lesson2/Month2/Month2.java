package by.academy.lesson2.Month2;

import java.util.Scanner;

/**
 * Created by user on 08.04.2020.
 */
public class Month2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the month's name!");
        String text = sc.nextLine();
        switch (text){

            case "January": System.out.println ("1");
                break;
            case "February": System.out.println ("2");
                break;
            case "March": System.out.println ("3");
                break;
            case "April": System.out.println ("4");
                break;
            case "May": System.out.println ("5");
                break;
            case "June": System.out.println ("6");
                break;
            case "July": System.out.println ("7");
                break;
            case "August": System.out.println ("8");
                break;
            case "September": System.out.println ("9");
                break;
            case "October": System.out.println (10);
                break;
            case "November": System.out.println (11);
                break;
            case "December": System.out.println (12);
                break;
            default:
                System.out.println ("I don't know such month");

    }
}}
