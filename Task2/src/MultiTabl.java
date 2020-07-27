/**
 * Created by yuchugunova on 27.07.2020.
 */
public class MultiTabl {
    public static void main(String[] args) {
        for(int x=2;x<10;x++){
            for (int y = 2; y < 10; y++) {
                System.out.print("\t" + y + " * " + x + " = " + (x * y));
            }
            System.out.print("\n");
        }
    }
}
