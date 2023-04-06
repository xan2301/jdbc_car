package pl.wiktorowski.jdbccar;

public class Car {

    private long carId;
    private String mark;
    private String model;
    private String colour;


    public Car(long carId, String mark, String model, String colour) {
        this.carId = carId;
        this.mark = mark;
        this.model = model;
        this.colour = colour;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
