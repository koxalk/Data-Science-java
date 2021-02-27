package linearalgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class InnerProduct {

    public static void main(String[] args) {
        double[] a = {5, 4, 3};

        double[] b = {3, 2, 1};

        RealVector vectorA = new ArrayRealVector(a);

        RealVector vectorB = new ArrayRealVector(b);

        double dotProduct = vectorA.dotProduct(vectorB);

        System.out.println("Dot product :" + dotProduct);

        //2d arrays
        double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix matrix = new Array2DRowRealMatrix(data2);

        double[][] data3 = {{1.0, 2.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
        RealMatrix matrix2 = new Array2DRowRealMatrix(data3);

        /* matrixA and matrixB are both mx1 column vectors */
        RealMatrix innerProduct = matrix.transpose().multiply(matrix2);
        /* the result is stored in the only entry for the matrix */
        double dotProduct2 = innerProduct.getEntry(0, 0);

        System.out.println("Dot product :" + dotProduct2);
    }

}
