package Giris5;

public class transpoz {
	
	static void print(int[][] matrix) {
        System.out.println("******************");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };

        print(matrix);

        int[][] t_matrix = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                t_matrix[j][i] = matrix[i][j];
            }
        }
        print(t_matrix);

	}

}
