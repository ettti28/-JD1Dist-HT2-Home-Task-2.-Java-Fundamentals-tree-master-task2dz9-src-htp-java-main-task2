package by.htp.java.main.task2_4;

import java.util.Random;

import java.util.Scanner;




  public class Train {

        public static void main(String[] args) {

            Random rand = new Random();

            BasicTrain bt1 = new BasicTrain( "Minsk    " , 76 , rand.nextInt(1440) );
            BasicTrain bt2 = new BasicTrain( "Gomel    " , 43 , rand.nextInt(1440) );
            BasicTrain bt3 = new BasicTrain( "Gomel    " , 98  , rand.nextInt(1440) );
            BasicTrain bt4 = new BasicTrain( "Lida     " , 53  , rand.nextInt(1440) );
            BasicTrain bt5 = new BasicTrain( "Minsk    " , 18 , rand.nextInt(1440) );


            Scanner scan = new Scanner(System.in);

            System.out.println("\n\n  Введите номер рейса интересующего вас поезда  и нажмите ввод :  ");
            System.out.print(" INFO :  № 76 Minsk ,  № 43 Gomel  , № 98 Gomel , № 53 Lida , № 18 Minsk " );



            while (!scan.hasNextInt() ) {

                String a = scan.nextLine();

                System.out.println(" Введённое значение не корректно : " + a);
                System.out.println("\n\n  Введите номер рейса интересующего вас поезда  и нажмите ввод :  ");
                System.out.println("  INFO :  № 76 Minsk ,  № 43 Gomel  , № 98 Gomel , № 53 Lida , № 18 Minsk " );

            }

            int yourNumberTrain = scan.nextInt();


            LogicTrain lt = new LogicTrain();



            lt.makeMass( bt1.getNumTrain(), bt2.getNumTrain(), bt3.getNumTrain(), bt4.getNumTrain(), bt5.getNumTrain(),
                    bt1.getDepartTime(), bt2.getDepartTime(), bt3.getDepartTime(), bt4.getDepartTime(), bt5.getDepartTime(),
                    bt1.getAddress(), bt2.getAddress(), bt3.getAddress(), bt4.getAddress(), bt5.getAddress() , yourNumberTrain  );



        }

    }


