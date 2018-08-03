package picking_numbers;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] a = {4, 6, 5, 3, 3, 1};
		
		System.out.println(pickingNumbers(a));
		System.out.println(pickingNumbers2(a));

	}
	
	static int pickingNumbers(int[] a) {
        Arrays.sort(a);
		int max = 2;
        
        for(int i = 0; i < a.length - 1;){
        	int count = 1;
        	int j = i + 1;
        	
        	while (j < a.length) {
        		int diff = Math.abs(a[i] - a[j]);
        		
        		if (diff <= 1) {
        			++count;
        			++j;
        		}
        		else {
        			j = a.length;
        		}
        		
        	}
        	max = Math.max(max, count);
        	++i;
        }
        
        return max;
	}
	
	static int pickingNumbers2(int[] a) {
		int max = 2;
		int i = 0;
        
		while(i < a.length - 1){
        	int count = 1;
        	int j = i + 1;
        	
        	while (j < a.length) {
        		int diff = Math.abs(a[i] - a[j]);
        		
        		if (diff <= 1) {
        			++count;
        			++j;
        		}
        		else {
        			j = a.length;
        		}
        		
        	}
        	max = Math.max(max, count);
        	++i;
        }
        
        return max;
	}

}
