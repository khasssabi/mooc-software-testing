package tudelft.algorithm;

public class SimpleAlgorithm {

    public Boolean algorithm(int a, int b) {
        boolean result = false;

        if (a > 20) {
            if (a % 2 == 0) {
                System.out.println(a + " A is a large even number");
                result = true;
            } else System.out.println(a + " A is a large uneven number");
        }
        else System.out.println(a + " A is NOT a large number");

        if (b > 100) {
            if (b % 2 == 0) {
                System.out.println(b + " B is a large even number");
                result = true;
            } else System.out.println(b + " B is a large uneven number");
        }
        else System.out.println(b + " B is NOT a large number");
        return result;
    }
}






