/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra.affine;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class MatrixOperations {

    public MatrixOperations() {
    }

    public RealMatrix WXplusB(RealMatrix w, RealMatrix x, RealVector b) {
        RealVector h = new ArrayRealVector(x.getRowDimension(), 1.0);

        return x.multiply(w).add(h.outerProduct(b));
    }
}
