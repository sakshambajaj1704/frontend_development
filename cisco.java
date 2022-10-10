import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;

public class cisco {
    
    public static int[] takeInput(){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
       // int m=s.nextInt();
        int arr[]=new int [n];
        
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
        
        
    }
    
     public static int[] removeElement(int[]arr,int index){
        int[] anotherArray=new int[arr.length-1];
    //     for (int i=0,k=0;i<arr.length;i++){
    //         if (i==index){
    //             continue;
    //         }
    //         anotherArray[k++]=arr[i];
            
    //     }
        
        
        
    //     return anotherArray;
    for (int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
         }

         for int(i=0;i<arr.length-1;i++){
         anotherArray[i]=s.nextInt();
         }
         return anotherArray;


    }
    
    
    
    
    public static int answer(int arr[]){
        int sum=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            int result =arr[i]*arr[i-1]*arr[i+1];
            // for (int j=i;j<arr.length-1;j++){
            //     arr[j]=arr[j+1];
            // }
            arr= removeElement(arr,i);
           sum=result+sum;
           
         }
         return(sum);
    }
    
    
    
    
    
    
    
       
    public static void main(String[] args) throws IOException {
        
        int[] arr=takeInput();
        
        int ans=answer(arr);
        System.out.println(ans);
        
 
    }
}
