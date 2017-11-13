import java.util.Arrays;
import java.util.Random;

public class PermutationClassX11 {

    private Random r = new Random();
    
    public int[] permutate() {
        int[] values = {1, 2,3, 4, 5, 6, 7, 8, 9};
        int[] permutation = new int[values.length];
        
        for (int n = values.length; n > 0; n--) {
            int pos = r.nextInt(n);
            permutation[n-1] = values[pos];
            values[pos] = values[n-1];
        }
        return permutation;
    }

    public static void main(String[] args) {

        PermutationClassX11 p = new PermutationClassX11();
        System.out.println(Arrays.toString(p.permutate()));
    }
}
