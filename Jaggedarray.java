public class Jaggedarray {
    public class jaggedarray {
    public static void main(String[] args) {
        int [][]arr=new int[3][];
        arr[0]=new int[]{1,2};
         arr[1]=new int[5];
          arr[2]=new int[3];

      
        arr[1][0]=1;
        arr[1][1]=10;
        arr[1][2]=20;
         arr[1][3]=89;
        arr[1][4]=129;

        arr[2][0]=29; 
        arr[2][1]=40;
        arr[2][2]=67;
 for(int i=0;i<arr.length;i++){
        for (int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}
}
