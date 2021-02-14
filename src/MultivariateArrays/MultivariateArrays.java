package MultivariateArrays;

public class MultivariateArrays {

  public static void main(String[] args) {
    int[] row={1,2014,1};
    int[] row2={2,2015,1};
    int[] row3={3,2024,2}; 
     
    int[][] array={
             {1,2014,1},
             {2,2015,1},
             {3,2014,2}
             };
     
     System.out.println("<=== single array ===>");
     System.out.println("id :" +row[0]
     + " Date: " +row[1] + " value: " + row[2]);
     
     System.out.println("id :" +row2[0]
     + " Date: " +row2[1] + " value: " + row2[2]);
     
     
     System.out.println("id :" +row3[0]
     + " Date: " +row3[1] + " value: " + row3[2]);
     
     System.out.println("<=====>");
     System.out.println("<=== two dimensional  array ===>");
     
     for(int i=0;i<3;i++){
         System.out.println(
       "id:" +array[i][0] +
       " Date: " +array[i][1] +
       " value: " +array[i][2]);
     }
     
   }
}
