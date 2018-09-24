package lesson1;

/**
 * Finds the longest sequence of zeros in a binary representation of an integer.
 * Created by Jonas Eiselt on 2018-09-23.
 */
public class BinaryGap {
	public int getLongestGap(int N) {
        long start = System.currentTimeMillis();
        
        String binaryString = Integer.toBinaryString(N);
        System.out.println(N + ": " + binaryString);
        
        int longestBinaryGap = 0, binaryGapCounter = 0;
        if (N%16 == 15) {
            longestBinaryGap = 0;
        }
        else {
            // Traverse each character in string
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '0') {
                    binaryGapCounter++;
                }
                else {
                    if (binaryGapCounter >= longestBinaryGap) {
                        longestBinaryGap = binaryGapCounter;
                    }
                    binaryGapCounter = 0;
                    
                    // Check if a bigger gap can appear at next iteration
                    if (longestBinaryGap+i+1 >= binaryString.length()) {
                        break;
                    }
                }
            }
        }
                
        long end = System.currentTimeMillis();
        System.out.println("Time taken to execute function: " + (end - start) + " ms");
        
        return longestBinaryGap;
    }
}
