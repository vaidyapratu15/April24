package LogicalProgramm;

import org.testng.annotations.Test;

public class code1line {
	

	
   @Test
	public void program() {


		int[][] bulbs = {
            {1, 20, 19},
            {2, 21, 21},
            {3, 20, 20},
            {4, 22, 22},
            {5, 21, 13},
            {6, 15, 7},
            {7, 19, 21},
            {8, 20, 20},
            {9, 21, 22},
            {10, 18, 20}
        };

        // Initialize variables to store the superlative bulb number and its brightness
        int superlativeBulbNumber = -1;
        double maxBrightness = Double.MAX_VALUE; // Start with a very high value

        // Iterate through each bulb in the batch
        for (int[] bulb : bulbs) {
            // Calculate the brightness using the formula
            double brightness = bulb[1] * 0.6 + bulb[2] * 0.4;
            // Update the superlative bulb number if this bulb has higher brightness
            if (brightness < maxBrightness) {
                maxBrightness = brightness;
                superlativeBulbNumber = bulb[0];
            }
        }

        // Output the superlative bulb number
        System.out.println(superlativeBulbNumber);
    




















		
		
	}

}
