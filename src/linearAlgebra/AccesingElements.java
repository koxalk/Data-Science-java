/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra;

import java.util.Arrays;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class AccesingElements {

    public static void main(String args[]) {
        // Setting and getting values uses the setEntry(int index, double value) 
        // and getEntry(int index) methods
        int size = 3;

        RealVector vector = new ArrayRealVector(size);

        vector.setEntry(0, 1.2);
        vector.setEntry(1, 1.2);

        double val = vector.getEntry(0);

        System.out.println(val + " " + vector.getEntry(1));

        System.out.println(vector);

        // 2d array sample 
        int row = 3;
        int col = 3;

        RealMatrix matrix = new Array2DRowRealMatrix(row, col);

        matrix.setEntry(0, 0, 1.2);

        System.out.println(matrix);

        //set all the values for a vector, use the set(double value) method
        vector.set(0);

        System.out.println(vector);

        //retrieve all the values of an exiting vector as an array of doubles
        //using toArray() method;
        double[] vals = vector.toArray();

        for (int i = 0; i < vals.length; i++) {
            System.out.println(vals[i]);
        }

        //2d matrix has no method set()
        //to set all values to  zero
        //we should use a constant with code like this
        
        double defaultValue = 1.0;

        matrix.scalarAdd(defaultValue);

        double[][] matrixData = matrix.getData();

        for (double[] matrixData1 : matrixData) {
            System.out.println(Arrays.toString(matrixData1));
        }
    }
}
