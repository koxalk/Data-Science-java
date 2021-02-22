package linearAlgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Submatrices {

    public static void main(String args[]) {
        //We often need to work with only a specific part of a matrix or want to include a smaller matrix in a larger
        //one. The RealMatrix class contains several useful methods for dealing with these common cases. For an
        //existing matrix, there are two ways to create a submatrix from it. The first method selects a rectangular
        //region from the source matrix and uses those entries to create a new matrix. The selected rectangular
        //region is defined by the point of origin, the upper-left corner of the source matrix, and the lower-right
        //corner defining the area that should be included. It is invoked as RealMatrix.getSubMatrix(int
        //startRow, int endRow, int startColumn, int endColumn) and returns a RealMatrix object with
        //dimensions and values determined by the selection. Note that the endRow and endColumn values are
        //inclusive.
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix m = new Array2DRowRealMatrix(data);

        int startRow = 0;
        int endRow = 1;
        int startColumn = 1;
        int endColumn = 2;
        RealMatrix subM = m.getSubMatrix(startRow, endRow, startColumn, endColumn);

        System.out.println(subM);

//        We can also get specific rows and specific columns of a matrix. This is achieved by creating an array of
//        integers designating the row and column indices we wish to keep. The method then takes both of these
//        arrays as RealMatrix.getSubMatrix(int[] selectedRows, int[] selectedColumns).
        //example 1
        /* get selected rows and all columns */
        int[] selectedRows = {0, 2};
        int[] selectedCols = {0, 1, 2};
        RealMatrix subM2 = m.getSubMatrix(selectedRows, selectedCols);

        System.out.println(subM2);

        //example 2
        /* get all rows and selected columns */
        int[] selectedRows2 = {0, 1, 2};
        int[] selectedCols2 = {0, 2};
        RealMatrix subM3 = m.getSubMatrix(selectedRows2, selectedCols2);

        System.out.println(subM3);

        //example 3
        /* get selected rows and selected columns */
        int[] selectedRows3 = {0, 2};
        int[] selectedCols3 = {1};
        RealMatrix subM4 = m.getSubMatrix(selectedRows3, selectedCols3);

        System.out.println(subM4);

//        We can also create a matrix in parts by setting the values of a submatrix. We do this by adding a double
//        array of data to an existing matrix at the coordinates specified by row and column in
//        RealMatrix.setSubMatrix(double[][] subMatrix, int row, int column):
        double[][] newData = {{-3, -2}, {-1, 0}};
        int row = 0;
        int column = 0;
        m.setSubMatrix(newData, row, column);

        System.out.println(m);
    }
}
