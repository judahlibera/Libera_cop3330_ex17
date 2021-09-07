/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int g = 0;
        do {
            System.out.printf("Enter a 1 if you are male or a 2 if you are female");
            g = sc.nextInt();
            sc.nextLine();
        }while(g != 1 && g != 2);
        double r;
        if(g == 1)
            r = .73;
        else
            r = .66;

        int loop = 0, A = 0, W = 0, H = 0;


        do {
            loop = 0;
            System.out.printf("How many ounces of alcohol did you have? ");
            String As = sc.nextLine();
            try
            {
                A = Integer.parseInt((As));
            }
            catch(NumberFormatException n)
            {
                loop = 1;
            }
        }while(loop == 1);

        do {
            loop = 0;
            System.out.printf("What is your weight in pounds? ");
            String Ws = sc.nextLine();
            try
            {
                W = Integer.parseInt((Ws));
            }
            catch(NumberFormatException n)
            {
                loop = 1;
            }
        }while(loop == 1);

        do {
            loop = 0;
            System.out.printf("How many hours has it been since your last drink? ");
            String Hs = sc.nextLine();
            try
            {
                H = Integer.parseInt((Hs));
            }
            catch(NumberFormatException n)
            {
                loop = 1;
            }
        }while(loop == 1);





        double BAC = (A * 5.14 / W * r) - .015 * H;
        if (BAC < .08)
            System.out.printf("Your BAC is %f\nIt is legal for you to drive.", BAC);
        else
            System.out.printf("Your BAC is %f\nIt is not legal for you to drive.", BAC);

    }
}