/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author zhenhao luo
 */
public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        //Step1: do the transpose
        //Step2: swap it horizontally
        
        int len = matrix.length;
        for (int i=0;i<len;i++){
            for (int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        
       for (int r=0;r<len;r++){
           int i =0;int j=len-1;
           while(i<j){
               int temp = matrix[r][i];
               matrix[r][i] = matrix[r][j];
               matrix[r][j] = temp;
               i++;
               j--;
           }
       }
        
        printArray(matrix);

    }
    
    
  public static void printArray(int[][] arr){
         for (int i = 0; i < arr.length; i++){ 
            for (int j = 0; j < arr.length; j++){ 
                System.out.print(arr[i][j] + " ");}
            System.out.println();}
  }
    
    
    
    public static void main(String[] args) {
       
        
      int[][] matrix = { { 1, 2 }, 
                         { 3, 4 } };
      rotate(matrix);
      
      
      //printArray(matrix);
      
      
         
         }
    
    
}
