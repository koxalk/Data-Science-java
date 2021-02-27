package linearAlgebra.mappingFuction;

/*
On some occasions, we want to apply a univariate function to each entry of a matrix. The Apache
Commons Math API provides an elegant way to do this that works efficiently even for sparse matrices. It
is the RealMatrix.walkInOptimizedOrder(RealMatrixChangingVisitor visitor) method. Keep
in mind, there are other options here. We can visit each entry of the matrix in either row or column order,
which may be useful (or required) for some operations. However, if we only want to update each element
of a matrix independently, then using the optimized order is the most adaptable algorithm because it will
work for matrices with either 2D array, block, or sparse storage. The first step is to build a class (which
acts as the mapping function) that extends the RealMatrixChangingVisitor interface and implement the
required methods:*/
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class PoweredMapping implements RealMatrixChangingVisitor {

    private final double val;

    public PoweredMapping(double val) {
        this.val = val;
    }

    @Override
    public void start(int rows, int columns, int startRow, int endRow,
            int startColumn, int endColumn) {
    // called once before start of operations ... not needed here
    }

    @Override
    public double visit(int row, int column, double value) {
        return Math.pow(value, val);
    }

    @Override
    public double end() {
        // called once after all entries visited ... not needed here
        return 0.0;
    }

}
