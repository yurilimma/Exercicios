import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
Menor e Maior valor de um array sem contar um elemento do array
**/

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        int tam = arr.length;
        int resultMin=99999;
        int resultMax=-99999;
        int cont=0;
        int soma=0;
        
        int[] k= new int[tam];
        for(int i=0;i<k.length;i++){
            k[i]=0;
        }
        
        for(int i=0;i<tam;i++){
            for(int j=0; j<tam; j++){
                if(i!=j){
                    k[cont]+= arr[j];
                }
            }
            cont++;
        }
        for(int i=0;i<k.length;i++){
            if(k[i]<resultMin)
                resultMin=k[i];
            if(k[i]>resultMax)
                resultMax=k[i];
        }
        System.out.println(resultMin +" " + resultMax);
            
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
