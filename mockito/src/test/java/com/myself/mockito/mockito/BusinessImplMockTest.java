package com.myself.mockito.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class BusinessImplMockTest {

	@Test
	public void findTheGreatestNumberTest() {
		
		DataService dataserviceMock = mock(DataService.class);
		//dataservicemock should return a set of [] values
		//dataservicemock.retreivealldata()-> int[]{24, 11, 14}
		when(dataserviceMock.retrieveAllData()).thenReturn(new int [] {24,11,3});
		BusinessImpl businessImpl = new BusinessImpl(dataserviceMock); 
		int result=	businessImpl.findTheGreatestOfAllNumbers();
		assertEquals(24, result);	
	
	}

	@Test
	public void findTheGreatestOfOneNumberTest() {
		
		DataService dataserviceMock = mock(DataService.class);
		//dataservicemock should return a set of [] values
		//dataservicemock.retreivealldata()-> int[]{24, 11, 14}
		when(dataserviceMock.retrieveAllData()).thenReturn(new int [] {15});
		BusinessImpl businessImpl = new BusinessImpl(dataserviceMock); 
		int result=	businessImpl.findTheGreatestOfAllNumbers();
		assertEquals(15, result);	
	
	}	
	
	
}
