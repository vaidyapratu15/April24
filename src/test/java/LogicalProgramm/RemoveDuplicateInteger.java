package LogicalProgramm;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RemoveDuplicateInteger{

    @Test

    public void integerduplicateData() {
		
		int [] ar  = {1,  1, 2, 4 ,3 ,4 ,3, 4, 4 };
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<=ar.length; i++) {
			int s1 = ar[i];
			
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			}else {
				map.put(s1, 1);
			}
		}
		
		Set<Integer> k = map.keySet();
		for(Integer key : k) {
			System.out.println(key + ":"+ map.get(key));
		}
		
		System.out.println("++++++++++++  Duplicate data only +++++++++");
		
		Set<Integer> k1 = map.keySet();
		for(Integer key : k1) {
			if (map.get(key)>1) {
				System.out.println(key + ":"+ map.get(key));	
			}
		}
					
	}

    public void removeDuplicate() {
        int[] ar = {1, 1, 2, 3, 4, 3, 4, 4};

        Map<Integer, Integer> countMap = new HashMap<>();

        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();

        for (int num : ar) {
    
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (countMap.get(num) == 2) {
                // Add the number to the duplicates set
                duplicates.add(num);
            }
        }

        // Print the unique duplicates in the order they first appeared
        for (int duplicate : duplicates) {
            System.out.print(duplicate);
        }
    }

   
     public void m2() {
        int[] numbers =  {1, 1, 2, 3, 4, 3, 4, 4};

        // Create a HashMap to store frequencies of integers
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each integer in the array
        for (int num : numbers) {
            // Increment the frequency count
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print all integers and their frequencies
        Set<Map.Entry<Integer, Integer>> entrySet = frequencyMap.entrySet();
        System.out.println("All integers and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("++++++++++++ Duplicate data only +++++++++");

        // Print only integers with frequency greater than 1 (duplicates)
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

    

