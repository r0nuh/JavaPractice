
public class Solution {

	public static void main(String[] args) {
		int n = 11;
		int p = 8;
		
		System.out.println(pageCount(n, p));

	}
	
	static int pageCount(int n, int p) {
        int count = 0;
        
        if (n % 2 != 0 && p >= n - 1 || p == 1){
            return count;
        }
        else if (p <= n / 2){
            int curr = 1;
            while(curr < p){
                curr += 2;
                ++count;
            }            
        }
        else if (n % 2 != 0){
            int curr = n;
            while(curr - 1 > p){
                curr -= 2;
                ++count;
            }
        }
        else {
            int curr = n;
            while(curr > p){
                curr -= 2;
                ++count;
            }
        }
        
        return count;
    }


}
