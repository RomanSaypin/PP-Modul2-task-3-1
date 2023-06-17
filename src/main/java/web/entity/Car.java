package web.entity;

public class Car {

    private String model;
    private String marka;
    private int year;

    public Car() {
    }

    public Car(String model, String marka, int year) {
        this.model = model;
        this.marka = marka;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
