import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
Calcular menor e maior valor de um array somando todos os valores do array -1
**/

public class Solution {


    static void miniMaxSum(int[] arr) {
        // Complete this function
        int tam = arr.length;
	//BigInteger porque os valores estouravam com int, 32 bits muito pouco
        BigInteger resultMin=new BigInteger("2744467344");
        BigInteger resultMax=new BigInteger("-2744467344");
        int cont=0;
        
        long[] k= new long[tam];
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
            if(k[i]<resultMin.longValue())
                resultMin=new BigInteger(Long.toString(k[i]));
            if(k[i]>resultMax.longValue())
                resultMax=new BigInteger(Long.toString(k[i]));
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
