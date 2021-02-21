package linearAlgebra;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class ArrayStorage {

    public static void main(String args[]) {
        //CONSTRUCTORS
        //To instantiate an empty, ndimensional
        //vector of type RealVector, use the ArrayRealVector 
        //class with an integer size

        int size = 3;

        RealVector vector = new ArrayRealVector(size);

        System.out.println(vector);

        //vector with values
        double[] data = {1.0, 2.2, 4.5};
        RealVector vector1 = new ArrayRealVector(data);

        System.out.println(vector1);

        //A new vector can also be created by deep copying 
        //an existing vector into a new instance:
        RealVector realVector = new ArrayRealVector(vector1);

        System.out.println(realVector);

        //set a default value for all elements of a vector
        //include that value in the constructor along with the size
        double defaultValue = 1.0;

        RealVector realVector2 = new ArrayRealVector(size, defaultValue);

        System.out.println(realVector2);

        //A similar set of constructors follows for instantiating matrices, 
        //an empty matrix of known dimensions is
        //instantiated with the following
        int rowDimension = 10;
        int colDimension = 10;
        RealMatrix realVector3 = new Array2DRowRealMatrix(rowDimension, colDimension);

        System.out.println(realVector3);

        //two-dimensional array of doubles passed in the array
        double[][] data2 = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix matrix = new Array2DRowRealMatrix(data2);

        System.out.println(matrix);

        //Although there is no method for setting the entire matrix to a default value 
        //(as there is with a vector),instantiating a new matrix sets all elements to zero,
        //so we can easily add a value to each element afterward
        RealMatrix matrix2 = new Array2DRowRealMatrix(rowDimension, colDimension);
        matrix.scalarAdd(defaultValue);

        System.out.println(matrix2);

        /* deep copy contents of matrix */
        RealMatrix anotherMatrix = matrix.copy();
        
        System.out.println(anotherMatrix);
    }
}
