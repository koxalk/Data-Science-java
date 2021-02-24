/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

/**
 *
 * @author kosta
 */
public class Multiuplication {

    public static void main(String args[]) {
        double[][] data1 = {{2.0, 3.0, 4.0}, {5.0, 6.0, 7.0}, {8.0, 1.0, 3.0}};
        RealMatrix matrixA = new Array2DRowRealMatrix(data1);

        double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix matrixB = new Array2DRowRealMatrix(data2);

        /* BA explicitly */
        RealMatrix matrixMatrixProduct = matrixB.multiply(matrixA);

        System.out.println(matrixMatrixProduct);
        
        /* BA using premultiply */
        RealMatrix matrixMatrixProduct2 = matrixA.preMultiply(matrixB);
        
        System.out.println(matrixMatrixProduct2);
    }
}
