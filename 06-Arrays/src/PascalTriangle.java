import java.util.Arrays;

public class PascalTriangle {

    private static final int NUM_ROWS = 10;

    public static void main(String[] args) {
        int[][] triangle = new int[NUM_ROWS][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = triangle[i][i] = 1;
            // same thing as above
//            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        for (int[] row : triangle){
            for(int value : row){
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        for (int i = 0; i<triangle.length;i++){
            System.out.printf("%" + (NUM_ROWS - i) * 2 + "s", " ");
            for(int j =0; j < triangle[i].length; j++) {
                System.out.printf("%4d", triangle[i][j]);
            }
            System.out.println();
        }
    }
}
