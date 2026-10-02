public class sumofarray {
    
    public static void main(String[] args) {
        int sum=0;
        int [][] arr={{1,8,4},{9,7,2},{7,6,4}};
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
         sum +=arr[i][j];
     System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
        System.out.println("sum="+sum);
    }
}
