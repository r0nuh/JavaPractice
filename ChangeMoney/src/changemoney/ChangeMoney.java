/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changemoney;

/**
 *
 * @author Szilard
 */
public class ChangeMoney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Change.giveBack(199, 2000);
    }
    
    public static class Change {

        final static int[] CASH = {
            20000, 10000, 5000,
            2000, 1000, 500, 200,
            100, 50, 20, 10, 5};

        private static void giveBack(int owing, int paid) {
            if (owing < 0 || paid < 0) {
                throw new IllegalArgumentException("Value can not be negative");
            }
            if (owing > paid) {
                System.out.println("Insufficient paid money");
            }

            int sum = 0;
            int difference = paid - owing;
            int i = 0;

            while (difference > 2) {
                if (difference >= CASH[i]) {
                    sum += CASH[i];
                    difference -= CASH[i];
                } else if (difference < 5 && difference >= 3) {
                    sum += 5;
                    difference -= difference;
                } else {
                    ++i;
                }
            }

            System.out.println(sum);
        }
    }
}
