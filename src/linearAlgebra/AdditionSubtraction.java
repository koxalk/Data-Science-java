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
public class AdditionSubtraction {
    
    public static void main(String args[]){
        double[] a={5,4,3};
        
        double[] b={3,2,1};
        
         RealVector vectorA = new ArrayRealVector(a);
        
         System.out.println(vectorA);
         
         RealVector vectorB = new ArrayRealVector(b);
         
         System.out.println(vectorB);
         
         RealVector vectorC = vectorA.add(vectorB);
         
         System.out.println(vectorC);
         
         RealVector aMinusB = vectorA.subtract(vectorB);
         
         System.out.println(aMinusB);
         
         //2d arrays
         double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
         RealMatrix matrix = new Array2DRowRealMatrix(data2);
         
         System.out.println(matrix);
         
         double[][] data3 = {{1.0, 2.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
         RealMatrix matrix2 = new Array2DRowRealMatrix(data3);
         
         System.out.println(matrix2);
         
         RealMatrix matrix3 = matrix.add(matrix2);
         
         System.out.println(matrix3);
         
         RealMatrix matrix4 = matrix.subtract(matrix2);
         
         System.out.println(matrix4);
    }
}
