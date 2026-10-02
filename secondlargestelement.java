public class secondlargestelement {
    public static void main(String[] args) {
        int arr[]={8,8,7,6,5};
        int first=Integer.MIN_VALUE;
       int second=Integer.MAX_VALUE;
       for(int i=1;i<arr.length;i++){
        if(arr[i] >first){
            second=first;
            first=arr[i];
        }else if(arr[i]>second ){
            second=arr[i];
        }
       }
       System.out.println("second largest element:"  +second);
    }
}
