package com.myself.mockito.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessImplTest {

	@Test
	public void findTheGreatestNumberTest() {
		
		BusinessImpl businessImpl = new BusinessImpl(new DataServiceStubb()); 
		int result=	businessImpl.findTheGreatestOfAllNumbers();
		assertEquals(24, result);	
	
	}
	
}

class DataServiceStubb implements DataService {

	@Override
	public int[] retrieveAllData() {
		
		return (new int[] {24,11,20});
	}
	
}
