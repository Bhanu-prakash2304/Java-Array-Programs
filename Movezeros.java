public class Movezeros {
    public static void main(String[]args){
int[]arr={0,1,0,3,12};
int index=0;
// move non zero elements to front
for(int i=0;i<arr.length;i++){
if(arr[i]!=0){
    arr[index]=arr[i];
    index++;
}
}
//fill remeining positions with zeros
while(index<arr.length){
   arr[index]=0;
    index++;
}
// print the array
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}

