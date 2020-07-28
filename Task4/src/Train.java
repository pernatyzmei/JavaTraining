/**
 * Created by yuchugunova on 28.07.2020.
 */
public class Train extends Vehicle implements Rideable, Driveable {
    public void ride() {

    }

    public void drive() {

    }

    private String name, color;

    public Train() {
    }

    public Train(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Train(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
