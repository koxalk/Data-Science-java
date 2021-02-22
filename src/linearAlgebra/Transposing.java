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
public class Transposing {
    
    
    public static void main(String args[]){
        //Transposing the column vector will return a matrix 
        //with one row and columns
        double[] data = {1.2, 3.4, 5.6};
        RealMatrix columnVector = new Array2DRowRealMatrix(data);
        System.out.println(columnVector);
        /* {{1.2}, {3.4}, {5.6}} */
        RealMatrix rowVector = columnVector.transpose();
        System.out.println(rowVector);
        /* {{1.2, 3.4, 5.6}} */
        
        
        //a matrix of dimension is transposed, 
        //the result is an matrix. Simply put, the row
        //and column indices and are reversed
        double[][] data2 = {{1, 2, 3}, {4, 5, 6}};
        RealMatrix matrix = new Array2DRowRealMatrix(data2);
        
        System.out.println(matrix);
        
        RealMatrix transposedMatrix = matrix.transpose();
        /* {{1, 4}, {2, 5}, {3, 6}} */
        System.out.println(transposedMatrix);
    }
}
