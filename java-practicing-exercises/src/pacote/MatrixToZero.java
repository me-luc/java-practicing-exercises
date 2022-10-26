package pacote;

public class MatrixToZero {
    public void setToZero(int matrix[][]) {
        int row = -1, column = -1;

        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        int result[][] = matrix;

        // going through the matrix to get the 0 position
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (matrix[i][j] == 0) {
                    row = i;
                    column = j;
                    System.out.println("row -> " + row + " column -> " + column);

                    // setting row to 0
                    for (int r = row; r <= row; r++) {
                        for (int c = 0; c < columnLength; c++) {
                            result[r][c] = 0;
                            System.out.println("setting row");
                        }
                    }

                    // setting column to 0
                    for (int c = column; c <= column; c++) {
                        for (int r = 0; r < rowLength; r++) {
                            result[r][c] = 0;
                            System.out.println("setting column");
                        }
                    }
                } else {
                    result[i][j] = matrix[i][j];
                }
            }
        }
        if (row != -1 || column != -1) {

        } else {
            System.out.println("\n-- 0 not found --\n");
        }

        // printing
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MatrixToZero m = new MatrixToZero();
        m.setToZero(new int[][] {
                new int[] { 1, 1, 1, 1 },
                new int[] { 1, 1, 1, 1 },
                new int[] { 7, 1, 1, 1 },
                new int[] { 1, 1, 0, 4 },
                new int[] { 1, 1, 1, 1 } });
    }
}
