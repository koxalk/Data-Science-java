package linearAlgebra.mappingFuction;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperationsv2 {

    public MatrixOperationsv2() {
    }

    public static RealMatrix WXplusB(RealMatrix w, RealMatrix x, RealVector b) {
        RealVector h = new ArrayRealVector(x.getRowDimension(), 1.0);

        return x.multiply(w).add(h.outerProduct(b));
    }

    public static RealMatrix XWplusB(RealMatrix X, RealMatrix W, RealVector b, UnivariateFunction univariatefunction) {
        RealMatrix z = WXplusB(X, W, b);

        z.walkInColumnOrder(new UnivariateFunctionMapper(univariatefunction));

        return z;
    }
}
