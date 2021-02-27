package linearAlgebra.mappingFuction;

/*
We can also utilize Apache Commons Math built-in analytic functions that implement the
UnivariateFunction interface to easily map any existing function over each entry of a matrix:*/
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class UnivariateFunctionMapper implements
        RealMatrixChangingVisitor {

    UnivariateFunction univariateFunction;

    public UnivariateFunctionMapper(UnivariateFunction univariateFunction) {
        this.univariateFunction = univariateFunction;
    }

    @Override
    public void start(int rows, int columns, int startRow, int endRow,
            int startColumn, int endColumn) {
// called once before start of operations ... not needed here
    }

    @Override
    public double visit(int row, int column, double value) {
        return univariateFunction.value(value);
    }

    @Override
    public double end() {
        // called once after all entries visited ... not needed here
        return 0.0;
    }
}
