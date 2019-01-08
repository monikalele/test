package com.moni.sample;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class testCalc {
	
	@Mock
	service s;
	
	@Rule public MockitoRule mrule= MockitoJUnit.rule();
			

	@Test
	public void test() {
		calculator c = new  calculator(s);
		when(s.calc(2, 3)).thenReturn(5);
		assertEquals(5, c.add(2, 3));
	
	}

}
