import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задание 1 и 2
        {
            int[] weights = new int[3];
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;
            System.out.println(Arrays.toString(weights));
            double[] b = new double[3];
            b[0] = 1.57d;
            b[1] = 7.654d;
            b[2] = 9.986d;
            System.out.println(Arrays.toString(b));
            int[] c = new int[]{9, 10, 11, 12, 13};
            System.out.println(Arrays.toString(c));
        }

        {
            System.out.println();
            // Задание 3
            {
                int[] weights = new int[3];
                weights[0] = 1;
                weights[1] = 2;
                weights[2] = 3;

                for (int i = weights.length - 1; i >= 0; i--) {
                    System.out.printf(", " + weights[i]);
                }
                System.out.println();
                double[] b = new double[3];
                b[0] = 1.57d;
                b[1] = 7.654d;
                b[2] = 9.986d;
                for (int a = b.length - 1; a >= 0; a--) {
                    System.out.printf("," + b[a]);
                }
                System.out.println();
                int[] c = new int[]{9, 10, 11, 12, 13};
                for (int g = c.length - 1; g >= 0; g--) {
                    System.out.printf("," + c[g]);
                }
            }
            // Задание 4
            System.out.println();
            int[] weights = new int[3];
            weights[0] = 1 + 1;
            weights[1] = 2;
            weights[2] = 3 + 1;
            System.out.println(Arrays.toString(weights));
        }
    }
}
