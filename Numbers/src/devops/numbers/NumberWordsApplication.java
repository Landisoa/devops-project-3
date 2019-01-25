package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.text.NumberFormat;

	
public final class NumberWordsApplication {
	
	private final NumberWords numberWords ;
	private final BufferedReader reader ; 
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
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
		    
		    private static String convertless1000(int number) {
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
		                String s = convertless1000(n);
		                current = s + current;
		            }
		            place++;
		            number /= 1000;
		        } while (number > 0);		        
		        return (prefix + current).trim();
       	
		        
		    }
		    
		   
		    public static void main(final String[] args) {

		    	int number;
		    	Scanner s= new Scanner(System.in);
		        System.out.println("Enter a number to convert into word format:");
		    	number = s.nextInt();
		    	System.out.println(NumberFormat.getInstance().format(number) + " ='" + convertless1000(number) + "'");
		    	
		    	
		    }
}