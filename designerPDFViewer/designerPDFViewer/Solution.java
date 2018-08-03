package designerPDFViewer;

import java.util.Scanner;

public class Solution {
	/*In this challenge, you will be given a list of letter heights 
	 * in the alphabet and a string. Using the letter heights given, 
	 * determine the area of the rectangle highlight in mm2 assuming 
	 * all letters are 1mm wide.
	 */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		int[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
		
		scanner.close();
		
		int area = designerPdfViewer(heights, word);
		
		System.out.println("The area of the rectangle highlight in the PDF Viewer is " + area
				+ " mm2");
	}
	
    static int designerPdfViewer(int[] h, String word) {
        int a = 'a';
        int maxHeight = 1;
        int length = word.length();
        char[] chars = word.toCharArray();
        
        for (char character : chars){
            int height = h[character - a];
            maxHeight = Math.max(maxHeight, height);
        }
        
        return maxHeight * length;

    }


}
