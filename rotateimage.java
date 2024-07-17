
public class rotateimage {
    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};
        
              int n = matrix.length;          
              for(int row =0; row <n-1; row++)
              {
                  
              for(int column=row+1; column <n; column++) 
              {  
                 int temp = matrix[row][column]; 
                 matrix[row][column] = matrix[column][row];
                 matrix[column][row] = temp;


              }
                
               }
               for(int row =0; row <n; row++)
               {
                    
               for(int column=0; column <n; column++) 
               {  
                 System.out.print(matrix[row][column] + " ");
               }
                 System.out.println();
                }
                for(int row =0; row <n; row++)
               {
                    
               for(int column=0; column <n/2; column++) 
               {  
                 int temp = matrix[row][column];
                 matrix[row][column] = matrix[row][n-1-column];
                 matrix[row][n-1-column] = temp;
               }
                 
                }
                for(int row =0; row <n; row++)
                {
                     
                for(int column=0; column <n; column++) 
                {  
                  System.out.print(matrix[row][column] + " ");
                }
                  System.out.println(); 
                 }
                

    }

    
}

// class Solution {
//     public void rotate(int[][] matrix) {
//          for(int row =0; row <matrix.length-1; row++)
//               {
                  
//               for(int column=row+1; column <matrix[row].length; column++) 
//               {  
//                  int temp = matrix[row][column]; 
//                  matrix[row][column] = matrix[column][row];
//                  matrix[column][row] = temp;


//               }
                
//                }
//                for(int row =0; row <matrix.length; row++)
//                {
                    
//                for(int column=0; column <matrix[row].length/2; column++) 
//                {  
//                  int temp = matrix[row][column];
//                  matrix[row][column] = matrix[row][matrix.length-1-column];
//                  matrix[row][matrix.length-1-column] = temp;
//                }
                 
//                 }
//     }
// }
