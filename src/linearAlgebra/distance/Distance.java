/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearAlgebra.distance;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author kosta
 */
public class Distance {
    
    public static void main(String args[])
    {
        //The distance between any two vectors a and b may be calculated in several ways. 
        //The L1 distance between a and b is shown here:
        
        double[] a={5,4,3};
        
        double[] b={3,2,1};
        
         RealVector vectorA = new ArrayRealVector(a);
        
         System.out.println(vectorA);
         
         RealVector vectorB = new ArrayRealVector(b);
         
         System.out.println(vectorB);
         
         //The distance between any two vectors a and b
         double l1Distance = vectorA.getL1Distance(vectorB);
         
         System.out.println("L1 distance : " +l1Distance);
         
         //The L2 distance (also known as the Euclidean distance)
         double l2Distance = vectorA.getDistance(vectorB);
         
         System.out.println("L2 distance : " +l2Distance);
         
         //The cosine distance is a measure between –1 and 1 that is not so much
         //a distance metric as it is a “similarity” measure. If d = 0, the two 
         //vectors are perpendicular (and have nothing in common). If d = 1,
         //the vectors point in the same direction. If d = –1, 
         //the vectors point in exact opposite directions
         double cosineDistance = vectorA.cosine(vectorB);
         
         System.out.println("cosine distance : " +cosineDistance);
         //If both a and b are unit vectors, the cosine distance is just their inner product
         
         /* for unit vectors a and b */
        vectorA.unitize();
        vectorB.unitize();
        double innerDistance = vectorA.dotProduct(vectorB);
        System.out.println("inner product:  " +innerDistance);
    }
}
