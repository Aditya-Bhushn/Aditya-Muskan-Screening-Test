// Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//   (examples)
//   input: [1,2,8,9,12,46,76,82,15,20,30]
//   Output: 
//     {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
 package org.Tandemloop;

import java.util.LinkedHashMap;
import java.util.Map;

public class TotalCount {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

	        Map<Integer, Integer> divisorCount = new LinkedHashMap<>();

	        
	        for (int i = 1; i <= 9; i++) {
	            divisorCount.put(i, 0);
	        }

	        for (int num : numbers) {
	            for (int i = 1; i <= 9; i++) {
	                if (num % i == 0) {
	                    divisorCount.put(i, divisorCount.get(i) + 1);
	                }
	            }
	        }
	        System.out.print("{");
	        int index = 1;
	        for (Map.Entry<Integer, Integer> entry : divisorCount.entrySet()) {
	            System.out.print(entry.getKey() + ": " + entry.getValue());
	            if (index < divisorCount.size()) {
	                System.out.print(", ");
	            }
	            index++;
	        }
	        System.out.println("}");
}
}
