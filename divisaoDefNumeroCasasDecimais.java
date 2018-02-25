import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	/**
	Divisã definindo número de casas decimais
	**/
    static void plusMinus(int[] arr) {
        // Complete this function
    
        
        int contPositive=0;
        int contNegative=0;
        int contZeros=0;
        
        float positive = (float)0;
        float negative= (float)0;
        float zeros= (float)0;
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                contPositive++;
            }else if(arr[i]<0){
                contNegative++;
            }else{
                contZeros++;
            }
        }
        positive = (float) contPositive/arr.length;
        negative = (float) contNegative/arr.length;
        zeros = (float) contZeros/arr.length;
        float[] vet = new float[3];
        vet[0]= positive;
        vet[1] = negative;
        vet[2] = zeros;
        for(int i=0; i< vet.length; i++){
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(6);
            df.setMinimumFractionDigits(6);
            String valor = df.format(vet[i]);
            System.out.println(valor);
        }
                
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
