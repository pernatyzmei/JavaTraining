/**
 * Created by yuchugunova on 28.07.2020.
 */
public class Boat extends Vehicle implements Driveable, Swimable {
    public void drive(){

    }
    public void swim(){

    }
    private String name, color;

    public Boat() {
    }

    public Boat(String name, String color) {
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

    public Boat(String name) {

        this.name = name;
    }
}
