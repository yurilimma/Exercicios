import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int contEsq = 0;
        int contDir= 0;
        int i;
        int j=0;
        int result;
        for(i =0; i<a.length; i++){
            for(j=0; j<a.length;j++){
                if(i==j){
                    
                    contEsq+= a[i][j];
                }
                if ((i + j) == (a.length - 1)) {
                    
                    contDir += a[i][j]; // Soma os elementos à variável somadora da diagonal secundária
                }
            }
        }
        
        if(contEsq<contDir){
            result = contEsq - contDir;
            
        }else{
            result =  contDir -  contEsq;
        }
        
        result = result<0? result * -1 : result;
       
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}