import java.util.Arrays;

public class MagicSquare {

    private int[][] square;
    private int size;

    public MagicSquare(int size) {
        square = new int[size][size];
        this.size = size;
    }

    private int[][] create() {
        int i = size - 1;
        int j = size / 2;
        square[i][j] = 1;

        for (int k = 1; k < size * size; k++) {
            int i2 = (i + 1) % size;
            int j2 = (j + 1) % size;

            if (square[i2][j2] == 0) {
                //free
                i = i2;
                j = j2;
            } else {
                while (square[i][j] != 0) {
                    i = i == 0 ? size - 1 : i - 1;
                }
            }
            square[i][j] = k + 1;
        }
        return square;
    }

    private boolean isMagic(){
        int length = square.length;
        int magicSum = 0;
        for(int i = 0; i < length; i++ ) {
            magicSum += square[0][i];
        }

        // check lines
        for(int i = 1; i < length; i++ ) {
            int sum = 0;
            for (int j = 0; j < length; j++) sum += square[i][j];
            if (sum != magicSum) return false;
        }

        // check columns
        for(int j = 0; j < length; j++ ) {
            int sum = 0;
            for (int i = 0; i < length; j++) sum += square[i][j];
            if (sum != magicSum) return false;
        }

        // check diagonals
        int sum = 0;
        for(int i = 0, j = 0; i < length && j < length; i++, j++)
            sum += square[i][j];
            if (sum != magicSum) return false;

            sum = 0;
        for(int i = 0, j = length -1 ; i < length && j < length; i++, j--)
            sum += square[i][j];
            if (sum != magicSum) return false;
        return true;
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                r.append(String.format("%4d", square[i][j]));
                r.append("\n");
            }
        }
        return r.toString();
    }

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare(5);
        for (int[] magic : magicSquare.create()) {
            System.out.println(Arrays.toString(magic));
        }
        magicSquare.isMagic();

    }
}
