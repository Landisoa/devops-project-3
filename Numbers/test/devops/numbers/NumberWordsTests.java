package devops.numbers;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Test
		public void testonedigit() {
		
		NumberWordsApplication onedigit = new NumberWordsApplication();
		Assert.assertEquals(onedigit.convert(0).trim(), "zero");

	}
	
	@Test
	public void testtwodigits() {
		
		NumberWordsApplication twodigits = new NumberWordsApplication();
		Assert.assertEquals(twodigits.convert(10).trim(), "ten");

	}
	
	@Test
	public void testthreedigit() {
		
		NumberWordsApplication threedigits = new NumberWordsApplication();
		Assert.assertEquals(threedigits.convert(123).trim(), "one hundred twenty three");

	}

}

