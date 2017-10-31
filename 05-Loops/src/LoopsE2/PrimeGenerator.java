package LoopsE2;

public class PrimeGenerator {

    private int current;

    public PrimeGenerator() {
        current = 0;
    }

    public int nextPrime() {
        if (current == 0) {
            current++;
            return 2;
        }
        do {
            current += 2;
        } while (!isPrime(current));
        return current;
    }

    private boolean isPrime(int n) {
        for (int i = 3; i <= n; i += 2) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

}
