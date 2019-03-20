package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		MyCalculator testObj=new MyCalculator();
		
		// Addition Testing
		assertEquals(10,testObj.addTwoNumbers(4,6));
		assertEquals(-5,testObj.addTwoNumbers(-10,5.0));
		assertEquals(0,testObj.addTwoNumbers(-5.0,5));
		
		// Multiplication Testing
		assertEquals(6,testObj.multiplyTwoNumbers(2.0,3.0));
		assertEquals(-7.5,testObj.multiplyTwoNumbers(-2.5,3));
		assertEquals(0,testObj.multiplyTwoNumbers(0,5.0));
		
		// Division Testing
		assertEquals(2,testObj.divideTwoNumbers(6.0,3.0));
		assertEquals(-0.83,testObj.divideTwoNumbers(-2.5,3),0.1);
		assertEquals(0,testObj.divideTwoNumbers(0,5.0));
		assertEquals(Double.POSITIVE_INFINITY,testObj.divideTwoNumbers(7.0,0));
		assertEquals(Double.NEGATIVE_INFINITY,testObj.divideTwoNumbers(-3,0));
	}

}
