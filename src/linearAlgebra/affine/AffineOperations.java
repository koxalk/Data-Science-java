/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra.affine;

import java.util.Arrays;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class AffineOperations {
     public static void main(String[] args) {
        //2d arrays
        double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix matrix = new Array2DRowRealMatrix(data2);

        double[][] data3 = {{1.0, 2.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
        RealMatrix matrix2 = new Array2DRowRealMatrix(data3);

        //single array
        double[] a = {5, 4, 3};

        RealVector vectorA = new ArrayRealVector(a);

        // instance of class
        MatrixOperations mo = new MatrixOperations();

        RealMatrix res = mo.WXplusB(matrix, matrix2, vectorA);

        double[][] matrixData = res.getData();

        for (double[] matrixData1 : matrixData) {
            System.out.println(Arrays.toString(matrixData1));
        }
    }
}
