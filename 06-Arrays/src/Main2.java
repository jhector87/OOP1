import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        String[] array = {"Hello","World!", "how", "are", "you?"};
            int[] minMax = getMinMax(array);
            System.out.println(Arrays.toString(minMax));
    }

    private static int[] getMinMax(String[] array) {
        int min = array[0].length();
        int max = min;
        for(int i = 1; i < array.length;i++) {
            if (min > array[i].length()) {
                min = array[i].length();
            }

            if (max < array[i].length()) {
                max = array[i].length();
            }
        }

        // creates an anonymous array
        return new int[] {min,max};
    }
}
