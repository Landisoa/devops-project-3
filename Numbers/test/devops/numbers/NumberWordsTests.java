package devops.numbers;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;
import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Test
		public void testonedigit() {
		
		NumberWordsApplication onedigit = new NumberWordsApplication();
		Assert.assertEquals(onedigit.convert(-1).trim(), "negative one");
		System.out.println("*** " + onedigit.convert(-1).trim());

	}
	
	@Test
	public void testtwodigits() {
		
		NumberWordsApplication twodigits = new NumberWordsApplication();
		Assert.assertEquals(twodigits.convert(10).trim(), "ten");
		System.out.println("*** " + twodigits.convert(10).trim());
	}
	
	@Test
	public void testthreedigit() {
		
		NumberWordsApplication threedigits = new NumberWordsApplication();
		Assert.assertEquals(threedigits.convert(123).trim(), "one hundred twenty three");
		System.out.println("*** " + threedigits.convert(123).trim());
	}		
	
}

