package linearalgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class CompoundOperations {

    public static void main(String[] args) {
        /*
    
  You will often run into compound forms involving several vectors and matrices, such as x
TAx, which
results in a singular, scalar value. Sometimes it is convenient to work the calculation in chunks, perhaps
even out of order. In this case, we can first compute the vector v = Ax and then find the dot (inner)
product x · v:*/

        double[] xData = {1, 2, 3};
        double[][] aData = {{1, 3, 1}, {0, 2, 0}, {1, 5, 3}};

        RealVector vectorX = new ArrayRealVector(xData);

        RealMatrix matrixA = new Array2DRowRealMatrix(aData);

        double d = vectorX.dotProduct(matrixA.operate(vectorX));

        System.out.println(d);

        /*
        Another method is to first multiply the vector by the matrix by using 
        RealMatrix.premultiply() and
        then compute the inner product (dot product) between the two vectors*/
        double d2 = matrixA.preMultiply(vectorX).dotProduct(vectorX);

        System.out.println(d2);

        /*If the vectors are in matrix format as column vectors, 
        we can exclusively use matrix methods. However,
        note that the result will be a matrix as well:
         */
        RealMatrix matrixX = new Array2DRowRealMatrix(xData);
        /* result is 1x1 matrix */
        RealMatrix matrixD = matrixX.transpose().multiply(matrixA).multiply(matrixX);
        d = matrixD.getEntry(0, 0); // 78

        double l = matrixD.getEntry(0, 0);

        System.out.println(l);
    }

}
