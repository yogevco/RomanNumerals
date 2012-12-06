import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("IX", number.toRoman(9));
		assertEquals("MMM", number.toRoman(3000));
		assertEquals("MCMX", number.toRoman(1910));
		assertEquals("MCMLIV", number.toRoman(1954));
		assertEquals("MCMXC", number.toRoman(1990));
		assertEquals("DLXXXVII", number.toRoman(587));
		assertEquals("MMCCCLXXIII", number.toRoman(2373));
	}
	

}
