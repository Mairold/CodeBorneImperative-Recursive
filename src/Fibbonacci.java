import java.util.ArrayList;

public class Fibbonacci {

    public int returnFibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            ArrayList<Integer> fibSec = new ArrayList<>();
            fibSec.add(0);
            fibSec.add(1);
            addNumbersToFibSec(n,fibSec);
            return fibSec.get(n - 1);
        }
    }

    private void addNumbersToFibSec (int n, ArrayList<Integer> fibSec) {
        if (n >= fibSec.size()) {
            fibSec.add(fibSec.get(fibSec.size() - 1) + fibSec.get(fibSec.size() - 2));
            addNumbersToFibSec(n,fibSec);
        }
    }
}
