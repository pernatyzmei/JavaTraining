/**
 * Created by yuchugunova on 28.07.2020.
 */
public class Plane extends Vehicle implements Driveable, Flyable {
    public void drive(){

    }
    public void fly(){

    }
    private String name, color;

    public Plane(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Plane() {

    }

    public Plane(String name) {
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
