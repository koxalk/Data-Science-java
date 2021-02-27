/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra.entrywise;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

/**
 *
 * @author kosta
 */
public class MatrixUtils {
    
    public RealMatrix ebemultiply(RealMatrix a,RealMatrix b){
     int rowdim= a.getRowDimension();
     
     int coldim = a.getColumnDimension();
     
     RealMatrix output = new Array2DRowRealMatrix(rowdim,coldim);
     
     for(int i=0;i<rowdim;i++){
       for(int j=0;j<coldim;j++){
         output.setEntry(i,j,a.getEntry(i,j)*b.getEntry(i,j));
       }
     }
     
     
     return output;
   }
}
