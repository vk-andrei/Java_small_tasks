package Task_OOP_03;

public class Matrix {

    private int[][] array;
    private int row;
    private int column;

    /**************** CONSTRUCTORS *********************/
    public Matrix(int row, int column, int[][] array) {
        this.row = row;
        this.column = column;
        this.array = array;
    }

    public Matrix() {
        this.row = 1;
        this.column = 1;
        this.array = new int[row][column];
    }

    public Matrix(int row, int column) throws MatrixException {
        if (row <= 0 || column <= 0) {
            throw new MatrixException("Not available size of matrix!");
        }
        this.row = row;
        this.column = column;
        this.array = new int[row][column];
    }

    public Matrix(int[][] array) {
        this.row = array.length;
        this.column = array[0].length;
        this.array = array;
    }

    /************** SETTERS & GETTERS *******************/
    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
        this.row = array.length;
        this.column = array[0].length;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    /****************** SUM of MATRIX *******************/

    public Matrix sumMatrix(Matrix anyMatrix) throws MatrixException {

        if (anyMatrix.getRow() != this.row || anyMatrix.getColumn() != this.column) {
            throw new MatrixException("Matrix's sizes are not equal");
        } else {

            Matrix sumMatrix = new Matrix(this.row, this.column);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sumMatrix.array[i][j] = this.array[i][j] + anyMatrix.array[i][j];
                }
            }
            System.out.println("SUM OF MATRIXXs:");
            return sumMatrix;
        }
    }
    /****************** MULTIPLY of MATRIX *******************/

    public Matrix multiplyMatrix(Matrix anyMatrix) throws MatrixException {

        if (anyMatrix.getRow() != this.row || anyMatrix.getRow() != this.column) {
            throw new MatrixException("Matrix's sizes are not equal");
        } else {

            Matrix multiMatrix = new Matrix(this.row, this.column);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    multiMatrix.array[i][j] = this.array[i][j] * anyMatrix.array[i][j];
                }
            }
            return multiMatrix;
        }
    }
}