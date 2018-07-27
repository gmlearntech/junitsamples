package com.gmsingh.learning.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest {
	private int expectedSum;
	private int firstNumber;
	private int secondNumber;
	
	public CalculateTest(int expected, int first, int second) {
		expectedSum = expected;
		firstNumber = first;
		secondNumber = second;
	}
	
	@Parameters
	public static Collection<Integer[]> getData() {
		return Arrays.asList(new Integer[][] { {2, 1, 1},
			{5, 5, 0},
			{10, 1, 9}
		});
	}
	
	@Test
	public void testAdd() {
		Calculate adder = new Calculate();
		int sum = adder.add(firstNumber, secondNumber);
		assertEquals(expectedSum, sum);
		//fail("Not yet implemented");
	}

}
