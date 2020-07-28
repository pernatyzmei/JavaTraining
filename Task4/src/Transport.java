/**
 * Created by yuchugunova on 27.07.2020.
 */
public class Transport {
    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        car.stop();

        System.out.println("\n");

        Plane plane = new Plane("TY134", "khaki");
        plane.stop();
    }
}
