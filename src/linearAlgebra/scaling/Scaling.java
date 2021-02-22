/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra.scaling;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class Scaling {

    public static void main(String args[]) {
        //Apache Commons Math implements a mapping method whereby 
        //an existing RealVector is multiplied by
        //a double, resulting in a new RealVector objecτ

        double k = 1.4;
        int size = 3;

        RealVector vector = new ArrayRealVector(size);

        vector.set(3.0);

        RealVector scaledVector = vector.mapMultiply(k);

        System.out.println(scaledVector);

        //Note that a RealVector object may also be scaled in place by altering 
        //the existing vector permanently
        vector.mapMultiplyToSelf(k);

        System.out.println(vector);

        //Similar methods exist for dividing the vector by k to create a new vector
        RealVector scaledVector2 = vector.mapDivide(k);

        System.out.println(scaledVector2);

        //And for division in place:
        vector.mapDivideToSelf(k);

        System.out.println(vector);

        // Here, each value of the matrix is multiplied by a constant of type double.
        //A new matrix is returned:
        double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix matrix = new Array2DRowRealMatrix(data2);

        System.out.println(matrix);

        RealMatrix scaledMatrix3 = matrix.scalarMultiply(k);

        System.out.println(scaledMatrix3);

        System.out.println(scaledMatrix3.subtract(scaledMatrix3));

        
    }
}
