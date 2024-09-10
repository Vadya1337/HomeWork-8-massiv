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
            System.out.println(" Задание 3");
            // Задание 3
            {
                int[] weights = new int[3];
                weights[0] = 1;
                weights[1] = 2;
                weights[2] = 3;
                for (int i = weights.length - 1; i >= 0; i--) {
                    System.out.print(weights[i]);
                    if (i != 0) {
                        System.out.printf(",");
                    }
                }

                System.out.println();
                double[] b = new double[3];
                b[0] = 1.57d;
                b[1] = 7.654d;
                b[2] = 9.986d;
                for (int a = b.length - 1; a >= 0; a--) {
                    System.out.print(b[a]);
                    if (a != 0) {
                        System.out.print(",");
                    }
                }
            }
            System.out.println();
            int[] c = new int[]{9, 10, 11, 12, 13};
            for (int g = c.length - 1; g >= 0; g--) {
                System.out.print(c[g]);
                if (g != 0) {
                    System.out.printf(",");
                }
            }
        }
        // Задание 4
        System.out.println();
        System.out.println("Задание 4");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int l = 0; l < weights.length; l++) {
            if (weights[l] % 2 == 1) ;
            weights[l] = weights[l] + 1;
        }
        System.out.println(Arrays.toString(weights));
    }
}

