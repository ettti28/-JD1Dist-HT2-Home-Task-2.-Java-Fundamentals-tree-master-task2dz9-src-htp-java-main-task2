package by.htp.java.main.task2_3;

public class LogicStudent {


    public boolean rating( int[] mass) {

        for( int x: mass) {

            if (x < 9) {  return false;
            }
        }
        return true;
    }

    public void print(Student bestStudent) {

        System.out.println(bestStudent);
    }


}

