package Task_OOP_03;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) throws MatrixException {

        Matrix arr1 = new Matrix(2, 2, new int[][]{{2, 2}, {2, 2}});
        Matrix arr2 = new Matrix();
        Matrix arr3 = new Matrix(new int[][]{{5, 5}, {5, 5}});

        arr2.setArray(new int[][]{{1, 3}, {0, 4}});

        System.out.println("1: " + Arrays.deepToString(arr1.getArray()));
        System.out.println("2: " + Arrays.deepToString(arr2.getArray()));
        //System.out.println(Arrays.deepToString(arr3.getArray()));

        System.out.println("1+2: " + Arrays.deepToString(arr1.sumMatrix(arr2).getArray()));
        System.out.println("1*2: " + Arrays.deepToString(arr1.multiplyMatrix(arr2).getArray()));


        System.out.println("1: " + Arrays.deepToString(arr1.getArray()));
        System.out.println("3: " + Arrays.deepToString(arr3.getArray()));

        System.out.println("1+3: " + Arrays.deepToString(arr1.sumMatrix(arr3).getArray()));
        System.out.println("1*3: " + Arrays.deepToString(arr1.multiplyMatrix(arr3).getArray()));


    }

}
