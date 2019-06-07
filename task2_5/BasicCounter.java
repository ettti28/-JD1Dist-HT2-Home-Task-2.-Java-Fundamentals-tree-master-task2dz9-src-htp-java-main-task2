package by.htp.java.main.task2_5;


import java.util.Objects;

public class BasicCounter {


    private  int counter;


    public BasicCounter( int  counter) {
        this.counter = counter;

    }




    public int getCounter() {
        return counter;
    }




    public void setCounter(int counter) {
        this.counter = counter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicCounter)) return false;
        BasicCounter that = (BasicCounter) o;
        return getCounter() == that.getCounter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCounter());
    }

    @Override
    public String toString() {
        return "BasicCounter{" +
                "counter=" + counter +
                '}';
    }
}








