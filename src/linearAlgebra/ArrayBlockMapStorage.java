package linearAlgebra;

import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class ArrayBlockMapStorage {

    public static void main(String args[]) {

//        For large matrices with dimensions greater than 50, it is recommended to use block storage with the
//        BlockRealMatrix class. Block storage is an alternative to the two-dimensional array storage discussed
//        in the previous section. In this case, a large matrix is subdivided into smaller blocks of data that are
//        easier to cache and therefore easier to operate on. To allocate space for a matrix, use the following constructor:
        RealMatrix blockMatrix = new BlockRealMatrix(50, 50);

        double[][] data = {{1.0, 2.2, 3.3}, {2.2, 6.2, 6.3}, {3.3, 6.3, 5.1}};
        RealMatrix blockMatrix2 = new BlockRealMatrix(data);

        System.out.println(blockMatrix2);

//        When a large vector or matrix is almost entirely zeros, it is termed sparse. Because it is not efficient to
//        store all those zeros, only the positions and values of the nonzero elements are stored. Behind the scenes,
//        this is easily achieved by storing the values in a HashMap. To create a sparse vector of known dimension,
//        use the following:  
        int dim = 10000;
        RealVector sparseVector = new OpenMapRealVector(dim);
        
        
        //create a sparse matrix, just add another dimension:
        int rows = 10000;
        int cols = 10000;
        RealMatrix sparseMatrix = new OpenMapRealMatrix(rows, cols);
    }
}
