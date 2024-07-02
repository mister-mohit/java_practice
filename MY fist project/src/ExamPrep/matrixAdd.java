package ExamPrep;

public  class matrixAdd {
    public static class Matrix{
        int[][] arr;

        public Matrix(int[][] arr){
            this.arr = arr;
        }
    }


    public static int[][] add(Matrix mat1, Matrix mat2){
        int rLength = mat1.arr.length;
        int cLength = mat1.arr[0].length;
        int[][] mat3 = new int[rLength][cLength];

        for(int i = 0; i < rLength; i++){
            for(int j = 0; j < cLength; j++){
                mat3[i][j] = mat1.arr[i][j] + mat2.arr[i][j];
            }
        }

        return mat3;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{7,8,9},{0,1,2}};

        Matrix m1 = new Matrix(matrix1);
        Matrix m2 = new Matrix(matrix2);

        int[][] addedMatrix = add(m1, m2);
        
        for( int[] element: addedMatrix){
            for(int value: element){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
