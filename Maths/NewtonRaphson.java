public class NewtonRaphson {

    public static void main(String[] args) {
        System.out.println(square(40));
    }

    public static double square(int n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.2) {
                break;
            }
            x = root;
        }
        return x;
    }
}
