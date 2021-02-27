/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra.entrywise;

import java.util.Arrays;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class EntryWiseProduct {

    public static void main(String[] args) {

        //real vector single arrays{}
        double[] a = {10.4, 4.6, 3.8};

        double[] b = {3.5, 2.9, 1.7};

        RealVector vectorA = new ArrayRealVector(a);

        RealVector vectorB = new ArrayRealVector(b);

        /* compute the entrywise multiplication of vector a and vector b */
        RealVector vectorATimesVectorB = vectorA.ebeMultiply(vectorB);

        String data = vectorATimesVectorB.toString();
        // double[] data= vectorATimesVectorB.toArray();
/*
    for(double d: data){
      System.out.println(d);
    }*/

        System.out.println(data);

        //instance of class MatrixUtils
        MatrixUtils mu = new MatrixUtils();

        //2d arrays
        double[][] data2 = {
            {1.0, 2.2, 3.3},
            {2.2, 6.2, 6.3},
            {3.3, 6.3, 5.1}
        };

        RealMatrix matrixA = new Array2DRowRealMatrix(data2);

        double[][] data3 = {{1.0, 2.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
        RealMatrix matrixB = new Array2DRowRealMatrix(data3);

        /* element-by-element product of matrixA and matrixB */
        RealMatrix output = mu.ebemultiply(matrixA, matrixB);

        double[][] matrixData = output.getData();

        for (double[] matrixData1 : matrixData) {
            System.out.println(Arrays.toString(matrixData1));
        }

    }
}
