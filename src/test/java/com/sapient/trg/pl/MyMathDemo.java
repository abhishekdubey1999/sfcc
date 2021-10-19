package com.sapient.trg.pl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.trg.util.MyMath;


class MyMathDemo {
	private MyMath obj = null;

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}

//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

	@BeforeEach
	void setUp() throws Exception {
		obj = new MyMath();
	}

	@AfterEach
	void tearDown() throws Exception {
		obj=null;
	}

	@Test
	void testIsPerfectNumberforsuccess() {
		//fail("Not yet implemented");
		assertEquals(true,MyMath.isPerfectNumber(6));
	}
	
	@Test
	void testIsPerfectNumberforfailure() {
		//fail("Not yet implemented");
		assertNotEquals(true,MyMath.isPerfectNumber(2));
	}
	
	

	@Test
	void testFactorialforsuccess() {
		// fail("Not yet implemented");
		assertEquals(24,MyMath.factorial(4));
	}
	@Test
	void testFactorialforfailure() {
		// fail("Not yet implemented");
		assertNotEquals(10,MyMath.factorial(3));
	}

   
	@Test
	void testIsPrimeforsuccess() {
	//	fail("Not yet implemented");
		assertEquals(true,MyMath.isPrime(5));
	}
	@Test
	void testIsPrimeforfailure() {
	//	fail("Not yet implemented");
		assertNotEquals(true,MyMath.isPrime(9));
	}


	@Test
	void testSumOfPrimesforsuccess() {
		assertEquals(17,MyMath.sumOfPrimes(7));
	//	fail("Not yet implemented");
	}
	@Test
	void testSumOfPrimesforfailure() {
		assertNotEquals(24,MyMath.sumOfPrimes(7));
	//	fail("Not yet implemented");
	}
	


	@Test
	void testIsArmstrongNumberforsuccess() {
		assertEquals(true,MyMath.isArmstrongNumber(153));
	//	fail("Not yet implemented");
	}
	@Test
	void testIsArmstrongNumberforfailure() {
		assertNotEquals(true,MyMath.isArmstrongNumber(123));
	//	fail("Not yet implemented");
	}


	@Test
	void testReverseNumberforsuccess() {
		assertEquals(321,MyMath.reverseNumber(123));
	//	fail("Not yet implemented");
	}
	@Test
	void testReverseNumberforfailure() {
		assertNotEquals(111,MyMath.reverseNumber(123));
	//	fail("Not yet implemented");
	}


	@Test
	void testDecimalToBinaryforsuccess() {
		assertEquals(1010,MyMath.decimalToBinary(10));
	//	fail("Not yet implemented");
	}
	@Test
	void testDecimalToBinaryforfailure() {
		assertNotEquals(1111,MyMath.decimalToBinary(10));
	//	fail("Not yet implemented");
	}

	@Test
	void testBinaryToDecimalforsuccess() {
		assertEquals(39,MyMath.binaryToDecimal(100111));
	//	fail("Not yet implemented");
	}
	@Test
	void testBinaryToDecimalforfailure() {
		assertNotEquals(24,MyMath.binaryToDecimal(100111));
	//	fail("Not yet implemented");
	}

	@Test
	void testGetSumOfNfibosforsuccess() {
		assertEquals(54,MyMath.getSumOfNfibos(9));
	//	fail("Not yet implemented");
	}
	@Test
	void testGetSumOfNfibosforfailure() {
		assertNotEquals(24,MyMath.getSumOfNfibos(4));
	//	fail("Not yet implemented");
	}

	@Test
	void testIsPalindromeNumberforsuccess() {
		assertEquals(true,MyMath.isPalindromeNumber(121));
	//	fail("Not yet implemented");
	}
	@Test
	void testIsPalindromeNumberforfailure() {
		assertNotEquals(true,MyMath.isPalindromeNumber(123));
	//	fail("Not yet implemented");
	}

}
