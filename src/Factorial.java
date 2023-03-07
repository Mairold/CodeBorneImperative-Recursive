public class Factorial {

    public int calculate(int n) {
        if (n == 0) {
            return 1;
        } else {
            int sum = 1;
            for (int i = 0; i < n; i++) {
                sum *= n - i;
            }
            return sum;
        }
    }
}