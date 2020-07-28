/**
 * Created by yuchugunova on 28.07.2020.
 */
public class Bike   extends Vehicle implements Rideable, Driveable{
    public void ride(){

    }
    public void drive(){

    }
    private String name, color;

    public Bike() {
    }

    public Bike(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Bike(String name) {
        this.name = name;
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
