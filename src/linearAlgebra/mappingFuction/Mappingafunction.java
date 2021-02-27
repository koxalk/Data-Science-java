package linearAlgebra.mappingFuction;

import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Sigmoid;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Mappingafunction {

    public static void main(String[] args) {
        /*
    Often we need to map a function over the contents of a vector z such that the result is a new vector y of
    the same shape as z:
    y=φ(z)
    
    The Commons Math API contains a method RealVector.map(UnivariateFunction function), which
    does exactly that. Most of the standard and some other useful functions are included in Commons Math
    that implement the UnivariateFunction interface. It is invoked with the following:*/
        double[] a = {5.8, 4.6, 3.3};

        RealVector input = new ArrayRealVector(a);

        // map exp over vector input into new vector output
        RealVector output = input.map(new Exp());

        String s = output.toString();

        System.out.println(s);

        /*
        It is straightforward to create your own UnivariateFunction classes for forms that are not included in
        Commons Math. Note that this method does not alter the input vector. If you would like to alter the input
        vector in place, use this:*/
        // map exp over vector input rewriting its values
        String in = input.mapToSelf(new Exp()).toString();

        System.out.println(in);

        //
        double[][] aData = {{1, 3, 1}, {0, 2, 0}, {1, 5, 3}};

        RealMatrix matrix = new Array2DRowRealMatrix(aData);

        /*Then to map the required function over an existing matrix, pass an instance of the class to the
        walkInOptimizedOrder() method like so:*/
        System.out.println(matrix);
        /* each element 'x' of matrix is updated in place with x^1.2 */
        matrix.walkInColumnOrder(new PoweredMapping(1.2));

        System.out.println(matrix);

        /*So, for example, if we wanted to map the sigmoid (logistic) function over an affine transformation, we
        would do this:*/
        // for input matrix x, weight w and bias b, mapping sigmoid over all entries
        
        RealMatrix res = MatrixOperationsv2.XWplusB(matrix, matrix, input, new Sigmoid());

        System.out.println(res);
    }

}
