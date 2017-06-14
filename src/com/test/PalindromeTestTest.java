package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PalindromeTestTest{

	@Test
	public void checkNotNull() {
		Palendrome ob=new Palendrome();
		assertNotNull(ob);
		
	}
	
	
	@Test
	public void checkIfPalidrome() {
		Palendrome ob=new Palendrome();
//		assertTrue(ob.callPalin(20));
//		assertFalse(ob.callPalin(21));
		ob.reversString("","abcd");
		
		
	}
	

}
