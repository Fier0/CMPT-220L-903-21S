public class assgn7 {
    public static void main(String[] args) {
        int[] arr = {50,40,37,60,29,72,5,69,420};
        int n = arr.length;  
        int temp = 0;  //temp to move things aroung
         for(int i=0; i < n; i++){  //for the entire length of the array
                 for(int j=1; j < (n-i); j++){  //for each value go through the length of the array to compare
                          if(arr[j-1] > arr[j]){    
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;
                                 System.out.println("");
                                 for (int x = 0; x < arr.length; x++){//print out the current array
                                    System.out.print(arr[x]+" ");
                                }  
                         }  
                          
                 }  
         }
    }
}
