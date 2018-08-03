/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseexercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szilard
 */
public class BitwiseExercise {

    /**
     * @param args the command line arguments
     */
   static int findMax(int n, int k){
        
        int max = 0;
        
        for (int i = 1; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                int result = i & j;
                if (result < k){
                    max = Math.max(max, result);
                } 
            }           
        }
        
        return max;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int t = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int t = 1;
        List<Integer> results = new ArrayList();

        for (int tItr = 0; tItr < t; tItr++) {
            //String[] nk = scanner.nextLine().split(" ");
            String[] nk = {"955", "236"};

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            results.add(findMax(n, k));
        }

        //scanner.close();
        
        for (int elem : results){
            System.out.println(elem);
        }
    }

    
}
