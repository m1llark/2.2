package web.model;

public class Car {
    private String model;
    private String owner;
    private int number;
    public Car(){}

    public Car(String model, String owner, int number) {
        this.model = model;
        this.owner = owner;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                ", number=" + number +
                '}';
    }
}
