/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class Length {
    
    public static void main(String args[]){
         double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
         RealMatrix matrix = new Array2DRowRealMatrix(data2);
         
         System.out.println(matrix);
         
         double norm = matrix.getNorm();
         
         System.out.println("norm of Real matrix= " + norm);
         
        int size = 3;
        double defaultValue = 1.0;
        
        RealVector vector = new ArrayRealVector(size,defaultValue);
   
        System.out.println("vector  = " + vector);

        double norm2= vector.getL1Norm();
        
        System.out.println("norm of Real vector = " + norm2);
        
        /* create a new vector that is the unit vector of vector instance*/
        RealVector unitVector = vector.unitVector();
        
        System.out.println("unit vector  = " + unitVector);
        
        double matrixNorm = matrix.getFrobeniusNorm();
        
        System.out.println("matrix norm  = " + matrixNorm);
    }
}
