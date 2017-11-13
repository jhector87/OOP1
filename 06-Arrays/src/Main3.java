import java.util.Arrays;
import java.util.Random;

public class Main3 {

    private static Random rd = new Random();

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 20, MAX_VALUE = 100;
        int[] values;

        values = getDistinctValues(ARRAY_LENGTH, MAX_VALUE);
        System.out.println(Arrays.toString(values));

        values = getDistinctValues2(ARRAY_LENGTH, MAX_VALUE);
        System.out.println(Arrays.toString(values));
    }

    private static int[] getDistinctValues(int arrayLength, int maxValue) {
        int[] array = new int[arrayLength];
        int i = 0;
        while (i < array.length) {
            array[i] = rd.nextInt(maxValue) + 1;
            boolean found = false;
            for (int j = 0; j < i && !found; j++) {
                if (array[j] == array[i])
                    found = true;
            }
            if (!found)
                i++;

        }
        return array;
    }

    private static int[] getDistinctValues2(int arrayLength, int maxValue) {
        int[] companionArray = new int[maxValue];
        for (int i = 0; i < maxValue; i++)
            companionArray[i] = i + 1;

        int[] array = new int[arrayLength];
        for (int i = 0; i < maxValue; i++) {
            int val = rd.nextInt(maxValue);
            array[i] = companionArray[val];
            companionArray[val] = companionArray[maxValue - 1];
            maxValue--;
        }
        return companionArray;
    }

}
