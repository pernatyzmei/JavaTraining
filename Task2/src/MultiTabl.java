/**
 * Created by yuchugunova on 27.07.2020.
 */
public class MultiTabl {
    public static void main(String[] args) {
        int x, y;
        for(x=2;x<10;x++){
            for (y = 2; y < 10; y++) {
                System.out.print("\t" + x + " * " + y + " = " + (x * y));
            }
            System.out.print("\n");
        }
    }
}
