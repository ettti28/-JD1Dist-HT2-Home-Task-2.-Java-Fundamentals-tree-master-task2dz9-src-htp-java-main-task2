package by.htp.java.main.task2_3;

public class MainStudent {



        public static void main(String[] args) {


            Student  student1   =  new Student ("Ivan" ,  3336 ,  new int[]  { 10 , 7, 8 , 10 , 7 }  );

            Student  student2  =  new Student ("Petr" ,  3336 , new int[]  { 9 , 10, 10 , 9 , 10 } );

            Student  student3  =  new Student ("Alexandra"  , 3388 , new int[]  { 10 , 10 , 10 , 10 , 10}  );

            Student  student4  =  new Student ("Marfa"  , 3214 , new int[]  { 9 , 9 , 9 , 10 , 8 }  );

            Student  student5   =  new Student ("Egor" ,  3336 ,  new int[]  { 10 , 7, 8 , 10 , 7 }  );

            Student  student6  =  new Student ("Nina" ,  3336 , new int[]  { 9 , 10, 10 , 9 , 10 } );

            Student  student7  =  new Student ("Alexandr"  , 3214 , new int[]  { 10 , 7 , 10 , 10 , 10}  );

            Student  student8  =  new Student ("Masha"  , 3214 , new int[]  { 9 , 9 , 9 , 10 , 10 }  );



            LogicStudent  ls = new LogicStudent();



            boolean x1 = ls.rating( student1.getArray()  );

            if ( x1 ) {  ls.print(student1);
            }


            boolean x2 = ls.rating( student2.getArray()  );

            if ( x2 ) {  ls.print( student2);
            }


            boolean x3 = ls.rating( student3.getArray()  );

            if ( x3 ) {  ls.print( student3);
            }


            boolean x4 = ls.rating( student4.getArray()  );

            if ( x4 ) {  ls.print( student4);
            }


            boolean x5 = ls.rating( student5.getArray()  );

            if ( x5 ) {  ls.print( student5);
            }


            boolean x6 = ls.rating( student6.getArray()  );

            if ( x6 ) {  ls.print( student6);
            }


            boolean x7 = ls.rating( student7.getArray()  );

            if ( x7 ) {  ls.print( student7);
            }


            boolean x8 = ls.rating( student8.getArray()  );

            if ( x8 ) {  ls.print( student8);
            }


            System.out.println(student2);

        }




    }


