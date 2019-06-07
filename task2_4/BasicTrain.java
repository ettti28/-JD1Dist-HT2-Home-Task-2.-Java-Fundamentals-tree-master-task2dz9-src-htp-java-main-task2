package by.htp.java.main.task2_4;

public class BasicTrain {



    private String address;
    private int numTrain;
    private int departTime;


    public BasicTrain () {

    }

    public BasicTrain (String address, int numTrain, int departTime) {

        this.address = address;
        this.numTrain = numTrain;
        this.departTime = departTime;


    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public int getNumTrain() {
        return numTrain;
    }



    public void setNumTrain(int numTrain) {
        this.numTrain = numTrain;
    }



    public int getDepartTime() {
        return departTime;
    }



    public void setDepartTime(int departTime) {
        this.departTime = departTime;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + departTime;
        result = prime * result + numTrain;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BasicTrain other = (BasicTrain) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (departTime != other.departTime)
            return false;
        if (numTrain != other.numTrain)
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "address=" + address + ", numTrain=" + numTrain + ", departTime=" + departTime / 60 +
                " ч " + departTime % 60 + " мин " ;
    }


}
