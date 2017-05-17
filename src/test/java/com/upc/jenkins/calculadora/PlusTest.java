package com.upc.jenkins.calculadora;

import junit.framework.TestCase;

public class PlusTest extends TestCase {

	public void test() {
		int r = Plus.execute(3, 2);
		assertEquals(r,5);
	}
}
