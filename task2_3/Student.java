package by.htp.java.main.task2_3;

import java.util.Arrays;
import java.util.Objects;


public class Student {


    private String firstName;
    private int groupNumber;
    private int[] rating;


    public Student(String firstName, int groupNumber, int[] rating) {

        this.firstName = firstName;
        this.groupNumber = groupNumber;
        this.rating = rating;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getArray() {
        return Arrays.copyOf(rating, rating.length);
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return
                "\n Name=   '" + firstName + '\'' +
                ", Group Number=  " + groupNumber  ;
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getGroupNumber());
        result = 31 * result + Arrays.hashCode(rating);
        return result;
    }
}






