import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
Triangulo invertido com valor passado por parâmetro
	 #
    ##
   ###
  ####
 #####
######
**/

public class Solution {

    static void staircase(int n) {
        // Complete this function
        
        int cont =1;
        for(int i=0;i<n;i++){
            for(int j=n;j>=0;j--){
                
                if(j==(n-i-1)){
                    
                   for(int k=0;k<n-i-1;k++){
                        System.out.print(" ");
                   }
                    
                   for(int k=0;k<cont;k++){
                        System.out.print("#");
                   }
                    cont++;
                    System.out.print("\n");
                    
              }
              
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
