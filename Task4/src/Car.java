/**
 * Created by yuchugunova on 28.07.2020.
 */
public class Car extends Vehicle implements Rideable, Driveable {
    public void ride() {

    }
    public void drive() {

    }

    private String name, color;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }


    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}