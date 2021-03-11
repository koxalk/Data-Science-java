/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra;

import org.apache.commons.math3.linear.*;

public class SolvingSystems {

    public static void main(String args[]) {
        /* data */
        double[][] xData = {{0, 0.5, 0.2}, {1, 1.2, .9}, {2, 2.5, 1.9}, {3, 3.6, 4.2}};
        double[][] yData = {{-1, -0.5}, {0.2, 1}, {0.9, 1.2}, {2.1, 1.5}};
        /* create X with offset as last column */
        double[] ones = {1.0, 1.0, 1.0, 1.0};
        int xRows = 4;
        int xCols = 3;
        
        RealMatrix x = new Array2DRowRealMatrix(xRows, xCols + 1);
        
        x.setSubMatrix(xData, 0, 0);
        x.setColumn(3, ones); // 4th column is index of 3 !!!
        
        /* create Y */
       
        RealMatrix y = new Array2DRowRealMatrix(yData);
        
        /* find values for W */
        
        SingularValueDecomposition svd = new SingularValueDecomposition(x);
        RealMatrix solution = svd.getSolver().solve(y);
        System.out.println(solution);
        
        // {{1.7,3.1},{-0.9523809524,-2.0476190476},
        // {0.2380952381,-0.2380952381},{-0.5714285714,0.5714285714}}
    }
}
