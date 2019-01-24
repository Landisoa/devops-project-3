package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	
public final class NumberWordsApplication {
	
	 
		    
		    private static final String[] tens = {
		        "",
		        " ten",
		        " twenty",
		        " thirty",
		        " forty",
		        " fifty",
		        " sixty",
		        " seventy",
		        " eighty",
		        " ninety"
		    };
		    
		    private static final String[] nums = {
		        "",
		        " one",
		        " two",
		        " three",
		        " four",
		        " five",
		        " six",
		        " seven",
		        " eight",
		        " nine",
		        " ten",
		        " eleven",
		        " twelve",
		        " thirteen",
		        " fourteen",
		        " fifteen",
		        " sixteen",
		        " seventeen",
		        " eighteen",
		        " nineteen"
		    };
		    
		    private String convertLessThanOneThousand(int number) {
		        String current;
		        
		        if (number % 100 < 20){
		            current = nums[number % 100];
		            number /= 100;
		        }
		        else {
		            current = nums[number % 10];
		            number /= 10;
		            
		            current = tens[number % 10] + current;
		            number /= 10;
		        }
		        if (number == 0) return current;
		        return nums[number] + " hundred" + current;
		    }
		    
		    public String convert(int number) {

		        if (number == 0) { return "zero"; }
		        
		        String prefix = "";
		        
		        if (number < 0) {
		            number = -number;
		            prefix = "negative";
		        }
		        
		        String current = "";
		        int place = 0;
		        
		        do {
		            int n = number % 1000;
		            if (n != 0){
		                String s = convertLessThanOneThousand(n);
		                current = s + current;
		            }
		            place++;
		            number /= 1000;
		        } while (number > 0);		        
		        return (prefix + current).trim();
       	
		        
		    }
		    

}
