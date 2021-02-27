package linearalgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import java.util.Arrays;

public class OutterProduct {

    public static void main(String[] args) {
        //2d arrays
        double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix matrixA = new Array2DRowRealMatrix(data2);

        double[][] data3 = {{1.0, 2.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
        RealMatrix matrixB = new Array2DRowRealMatrix(data3);

        /* matrixA and matrixB are both nx1 column vectors */
        RealMatrix outerProduct = matrixA.multiply(matrixB.transpose());

        System.out.println("Outer Product: " + outerProduct);

        //real vector single arrays{}
        double[] a = {5, 4, 3};

        double[] b = {3, 2, 1};

        RealVector vectorA = new ArrayRealVector(a);

        RealVector vectorB = new ArrayRealVector(b);

        /* outer product of vector a with vector b */
        RealMatrix outerProduct2 = vectorA.outerProduct(vectorB);

        System.out.println("Outer Product of Real Vector");
        double[][] matrixData = outerProduct2.getData();

        for (double[] matrixData1 : matrixData) {
            System.out.println(Arrays.toString(matrixData1));
        }
    }

}
