public class twoDimensional {
       public static void main(String[] args) {
        int [][] arr=new int [3][2];

        
arr[0]=new int[]{1,2};
arr[1]=new int[]{3,4};  
arr[2]=new int[]{5,2};
        

         for(int i=0;i<arr.length;i++){  // no of rows 
             int []singlerow=arr[i];    // variable create singlerow, entire row
             for(int j=0;j<singlerow.length;j++){   
                 System.out.print(singlerow[j]+" ");
             }
             System.out.println();
    
         }      
     }
}
