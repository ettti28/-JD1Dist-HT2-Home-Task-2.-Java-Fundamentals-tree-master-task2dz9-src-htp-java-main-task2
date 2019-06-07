package by.htp.java.main.task2_5;

import java.util.Scanner;

public class LogicCounter {


    public int manualControl() {

        String a;
        int b;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значение десятичного счётчика от 0 до 9 включительно: ");

        do {

            while (!scan.hasNextInt() ) {

                a = scan.nextLine();

                System.out.println(" Введённое значение не корректно : " + a);
                System.out.println("Введите значение десятичного счётчика от 0 до 9 включительно: ");

            }

            b = scan.nextInt();

            if (b < 0 || b > 9) {


                System.out.println("Введите значение десятичного счётчика от 0 до 9 включительно: ");

            }

        }   while ( b < 0 || b > 9);

        return b;
    }



    public int plusMinus(int x) {

        int b;
        int z1;
        int e;


        Scanner scan = new Scanner(System.in);


        do {

            System.out.print("Введите значение  \" 1 \"  или  \" -1 \"  ,   оно прибавится к значению счётчика: ");

            do {

                while (!scan.hasNextInt()) {

                    String a = scan.nextLine();

                    System.out.println(" Введённое значение не корректно : " + a);
                    System.out.println("Введите значение  \" 1 \"  или  \" -1 \"  ,   оно прибавится к значению счётчика: ");

                }

                b = scan.nextInt();

                if (b != 1 && b != -1) {

                    System.out.println(" Введённое значение не корректно : " + b);
                    System.out.println("Введите значение  \" 1 \"  или  \" -1 \"  ,   оно прибавится к значению счётчика: ");

                }


            } while (b != 1 && b != -1);

            z1 = x + b;
            x = z1;

            if (z1 > 9 || z1 < 0) {

                System.out.println(" Переполнение счётчика : значение больше \"9\" или меньше \"0\" ");
                System.out.print(" счётчик сброшен до значения по умолчанию [0,0,0,0,0,1] \n\n");

                z1 = 1;

                return z1;
            }


            print(z1);

            System.out.print("Продолжить вычисления?");
            System.out.print("  Нажмите \"1\" если ДА |  Нажмите \"2\" если НЕТ | ");


            Scanner scan2 = new Scanner(System.in);



            e = scan2.nextInt();


        } while (e == 1);

        return z1;
    }



    public void print(int  a)  {

        System.out.print( "Значение десятичного счётчика :   " );

        System.out.println(String.format("%4s",
                Integer.toBinaryString(a)).replaceAll(" ", "0"));

    }
}



