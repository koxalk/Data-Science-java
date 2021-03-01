package linearAlgebra;

import java.util.Arrays;
import org.apache.commons.math3.linear.*;

public class Decomposition {

    public static void main(String[] args) {

        /*
        A Cholesky decomposition of a matrix A decomposes the matrix such that A = LL
        T
        , where L is a lower
        triangular matrix, and the upper triangle (above the diagonal) is zero:*/
        //2d arrays
        double[][] data2 = {{1.0, 1.0, -1.0}, {1.0, 2.0, 0.0}, {-1.0, 0.0, 5.0}};

        RealMatrix matrix = new Array2DRowRealMatrix(data2);

        /*
        A Cholesky decomposition is valid only for symmetric matrices. The main use of a Cholesky is in the
        computation of random variables for the multinormal distribution.*/
        CholeskyDecomposition cd = new CholeskyDecomposition(matrix);

        RealMatrix res = cd.getL();

        double[][] data = res.getData();

        System.out.println("Cholesky");

        for (double[] d : data) {
            System.out.println(Arrays.toString(d));
        }

        //LU 
        /*
        The lower-upper (LU) decomposition decomposes a matrix A into a lower diagonal matrix L and an
        upper diagonal matrix U such that A = LU:*/
        LUDecomposition lud = new LUDecomposition(matrix);

        /*
        The LU decomposition is useful in solving systems of linear equations in which the number of unknowns
        is equal to the number of equations.*/
        RealMatrix u = lud.getU();
        RealMatrix l = lud.getL();

        System.out.println("L");

        double[][] L = l.getData();

        for (double[] d : L) {
            System.out.println(Arrays.toString(d));
        }

        System.out.println("U");

        double[][] U = u.getData();

        for (double[] d : U) {
            System.out.println(Arrays.toString(d));
        }

        /*
        The QR decomposition decomposes the matrix 
        A into an orthogonal matrix of column unit 
        vectors Q and
        an upper triangular matrix R such that
         */
        QRDecomposition qrd = new QRDecomposition(matrix);

        RealMatrix q = qrd.getQ();
        RealMatrix r = qrd.getR();

        /*
        One of the main uses of the QR decomposition (and analogous decompositions) is in the calculation of
        eigenvalue decompositions because each column of Q is orthogonal. The QR decomposition is also
        useful in solving overdetermined systems of linear equations. This is usually the case for datasets in
        which the number of data points (rows) is greater than the dimension (number of columns). One advantage
        f using the QR decomposition solver (as opposed to SVD) is the easy access to the errors on the solution
        parameters that can be directly calculated from R.*/
        System.out.println("Q");

        double[][] Q = q.getData();

        for (double[] d : Q) {
            System.out.println(Arrays.toString(d));
        }

        System.out.println("R");

        double[][] R = r.getData();

        for (double[] d : R) {
            System.out.println(Arrays.toString(d));
        }

        /*Singular Value*/
 /*
        The singular value decomposition (SVD) decomposes the m × n matrix A such that A = UΣVT
        , where U
        is an m × m unitary matrix, S is an m × n diagonal matrix with real, non-negative values, and V is an n × n
        unitary matrix. As unitary matrices, both U and V have the property UUT = I, where I is the identity
        matrix.*/
 /*
        n many cases, ; the number of rows in a matrix will be greater than or equal to the number of
        columns. In this case, there is no need to calculate the full SVD. Instead, a more efficient calculation
        called thin SVD can be implemented, where U is m × n, S is n × n, and V is n × n. As a practical matter,
        there may also be cases when so we can then just use the smaller of the two dimensions:
        . The Apache Commons Math implementation uses that practice:*/
        SingularValueDecomposition svd = new SingularValueDecomposition(matrix);

        RealMatrix gu = svd.getU(); // m x p
        RealMatrix gs = svd.getS(); // p x p
        RealMatrix gv = svd.getV(); // p x n

        /* retrieve values, in decreasing order, from the diagonal of S */
        double[] singularValues
                = svd.getSingularValues();

        /* can also get covariance of input matrix */
        double minSingularValue = 0;
        // 0 or neg value means all sv are used
        RealMatrix cov = svd.getCovariance(minSingularValue);

        System.out.println("Singular Value Decomposition u");
        double[][] gd = gu.getData();
        
        for (double[] d : gd) {
            System.out.println(Arrays.toString(d));
        }
        
        System.out.println("Singular Value Decomposition s");
        double[][] gS = gs.getData();
        
        for (double[] d : gS) {
            System.out.println(Arrays.toString(d));
        }
        
        
        System.out.println("Singular Value Decomposition u");
        double[][] gV = gv.getData();
        
        for (double[] d : gV) {
            System.out.println(Arrays.toString(d));
        }
        
        System.out.println("minSingularValue: " +minSingularValue);

        String s= cov.toString();
        
        System.out.println("Covariance: " +s);
        
        /* compute eigenvalue matrix D and eigenvector matrix V */
        EigenDecomposition eig = new EigenDecomposition(matrix);
        
        /* The real (or imag) eigenvalues can be retrieved as an array of doubles */
        double[] eigenValues = eig.getRealEigenvalues();
        /* Individual eigenvalues can be also be accessed directly from D */
        double firstEigenValue = eig.getD().getEntry(0, 0);
        /* The first eigenvector can be accessed like this */
        RealVector firstEigenVector = eig.getEigenvector(0);
        /* Remember that eigenvectors are just the columns of V */
        double[] firstEigenVector2 = eig.getV().getColumn(0);
        
        System.out.println("Eigen Values");
        
        System.out.println(Arrays.toString(eigenValues));
        
         System.out.println("First Eigen Value");
         
         System.out.println(firstEigenValue);
 
         System.out.println(firstEigenVector);
         
         System.out.println(Arrays.toString(firstEigenVector2));
    }

}
