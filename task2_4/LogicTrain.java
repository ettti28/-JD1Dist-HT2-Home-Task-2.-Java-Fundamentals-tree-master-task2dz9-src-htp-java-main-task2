package by.htp.java.main.task2_4;

import java.util.Arrays;




   public class LogicTrain {



        public void makeMass (int nt1 , int nt2 , int nt3 ,int nt4 , int nt5 , int dt1 , int dt2 , int dt3 ,int dt4 ,
                          int dt5 , String add1 , String add2 , String add3 ,String add4 , String add5 , int yourNumberTrain )  {



            int [] massNumberTrain = new int[] { nt1 ,  nt2 ,  nt3 , nt4 ,  nt5};

            int [] massDepartTime = new int[]  { dt1 , dt2 , dt3 , dt4 , dt5};

            String [] massAddressTrain = new String[]  { add1 , add2 , add3 , add4 , add5};




            sortingNumberTrain (massNumberTrain , massDepartTime , massAddressTrain);

            sortingAddressTrain (massNumberTrain , massDepartTime , massAddressTrain);

            inform ( yourNumberTrain , massNumberTrain , massDepartTime , massAddressTrain);


        }







        public void sortingNumberTrain (int[] massNumberTrain , int[] massDepartTime , String[] massAddressTrain ) {


            System.out.println(" Упорядоченое по номерам поездов расписание :  \n");

            for (int x = 1 ; x < 100 ; ++x ) {


                for (int i = 0 ; i < massNumberTrain.length ; ++i  ) {

                    if ( massNumberTrain[i] == x) {

                        System.out.print(massAddressTrain[i] + "          |");

                        System.out.println("  " + massNumberTrain[i] + "         | " + massDepartTime[i] / 60 + " ч " + massDepartTime[i] % 60 + " мин " );

                    }

                }


            }

        }






        public void sortingAddressTrain (int[] massNumberTrain , int[] massDepartTime , String[] massAddressTrain ) {


            String[] x = Arrays.copyOf(massAddressTrain, massAddressTrain.length);

            Arrays.sort(x);




            int[] b1 = Arrays.copyOf(massDepartTime, massDepartTime.length);
            int[] a1 = Arrays.copyOf(massNumberTrain, massNumberTrain.length);;
            String [] c1 = Arrays.copyOf(massAddressTrain, massAddressTrain.length);

            int k = 0;



            for (int j = 0 ; j < 1440 ; ++j ) {


                for (int i = 0 ; i < 5 ; ++i  ) {


                    if ( massDepartTime[i] == j ) {


                        b1[k] = massDepartTime[i];
                        c1[k] = massAddressTrain[i];
                        a1[k] = massNumberTrain[i];

                        k = k+1;

                    }

                }

            }


            System.out.println("\n Упорядоченое по пункту назначения (с учётом по времени отправления, " +
                    "для поездов с одинаковыми пунктами назначения).  \n");


            for (int j = 0 ; j < 5 ; ++j) {

                for (int i = 0 ; i < c1.length ; i++) {


                    if ( x[j] == c1[i]) {


                        System.out.print(c1[i] + "          |");

                        System.out.println("  " + a1[i] + "         | " + b1[i] / 60 + " ч " + b1[i] % 60 + " мин " );

                        c1[i] = "null";

                    }

                }

            }

        }




        public void inform(int x , int[] a , int[] b , String[] c ) {


            if ( x == 76 ) {

                System.out.print( "\n \n \n   ---  Информация о вашем поезде № 76  ---  ");

                System.out.print(c[0] + "          номер|");

                System.out.println("  " + a[0] + "         отправления| " + b[0] / 60 + " ч " + b[0] % 60 + " мин " );


            }

            if ( x == 43 ) {

                System.out.print( "\n \n \n   ---  Информация о вашем поезде № 43  ---  ");

                System.out.print(c[1] + "          номер|");

                System.out.println("  " + a[1] + "         отправления| " + b[1] / 60 + " ч " + b[1] % 60 + " мин " );


            }

            if ( x == 98 ) {

                System.out.print( "\n \n \n   ---  Информация о вашем поезде № 98  ---  ");

                System.out.print(c[2] + "          номер|");

                System.out.println("  " + a[2] + "         время отправления| " + b[2] / 60 + " ч " + b[2] % 60 + " мин " );


            }

            if ( x == 53 ) {

                System.out.print( "\n \n \n   ---  Информация о вашем поезде № 53  ---  ");

                System.out.print(c[3] + "          номер|");

                System.out.println("  " + a[3] + "         время отправления| " + b[3] / 60 + " ч " + b[3] % 60 + " мин " );


            }

            if ( x == 18 ) {

                System.out.print( "\n \n \n   ---  Информация о вашем поезде № 18  ---  ");

                System.out.print(c[4] + "          номер|");

                System.out.println("  " + a[4] + "          время отправления| " + b[4] / 60 + " ч " + b[4] % 60 + " мин " );


            }

            if ( x != 18 && x != 53 && x != 98 && x != 43 && x != 76 ) {


                System.out.print( "\n \n \n   ---  Поезд с введённым вами  номером в системе отсутствует.  ---  ");


            }



        }




   }

