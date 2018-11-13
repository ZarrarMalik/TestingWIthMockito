package com.myself.mockito.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class BusinessImplMockAnnotationsTest {

	
	@Mock
	DataService dataserviceMock;
	
	@InjectMocks
	BusinessImpl businessImpl;
	
	@Test
	public void findTheGreatestNumberTest() {
		when(dataserviceMock.retrieveAllData()).thenReturn(new int [] {24,11,3});
		assertEquals(24, businessImpl.findTheGreatestOfAllNumbers());	
	
	}

	@Test
	public void findTheGreatestOfOneNumberTest() {
		when(dataserviceMock.retrieveAllData()).thenReturn(new int [] {15});
		assertEquals(15,businessImpl.findTheGreatestOfAllNumbers());	
	
	}	
	
	@Test
	public void findTheGreatestOfZeroNumberTest() {
		when(dataserviceMock.retrieveAllData()).thenReturn(new int [] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestOfAllNumbers());	
	
	}	
	
}
