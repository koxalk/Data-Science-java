package linearAlgebra.Randomization;

import java.util.Arrays;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.linear.RealMatrix;

public class DemoRandomization {

    public static void main(String args[]) {
        int numRows = 3;
        int numCols = 4;
        long seed = 0L;
        RandomizedMatrix rndMatrix = new RandomizedMatrix(
                new NormalDistribution(0.0, 0.5), seed);
        RealMatrix matrix = rndMatrix.getMatrix(numRows, numCols);
        
       // System.out.println(matrix);
        
        double[][] matrixData = matrix.getData();

        for (double[] matrixData1 : matrixData) {
            System.out.println(Arrays.toString(matrixData1));
        }
    }
}
