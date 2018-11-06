import java.util.Arrays;

public class ComapableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(4);
        comparableCircles[1] = new ComparableCircle(5.6);
        comparableCircles[2] = new ComparableCircle(1.9);

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle: comparableCircles){
            System.out.println(comparableCircle);
        }

        Arrays.sort(comparableCircles);

        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle: comparableCircles){
            System.out.println(comparableCircle);
        }
    }
}
