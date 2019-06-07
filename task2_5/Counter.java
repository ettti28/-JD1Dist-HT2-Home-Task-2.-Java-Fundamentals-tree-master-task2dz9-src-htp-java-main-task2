package by.htp.java.main.task2_5;

public class Counter {



    public static void main( String[] args) {


        BasicCounter bc = new BasicCounter(  0b1 ); //  значения десятичного счётчика по умолчанию;

        LogicCounter lc = new LogicCounter();

        lc.print(bc.getCounter());  // вывод значения десятичного счётчика по умолчанию;

        int b = lc.manualControl();    //  ввод значения десятичного счётчика  с консоли;

        bc.setCounter(b);

        lc.print(bc.getCounter());    // печать значения десятичного счётчика введённого с консоли;

        int b2 = lc.plusMinus(bc.getCounter());   //  печать значения десятичного счётчика после сложения , вычитания;

        bc.setCounter(b2);

        lc.print(bc.getCounter());




    }


}





