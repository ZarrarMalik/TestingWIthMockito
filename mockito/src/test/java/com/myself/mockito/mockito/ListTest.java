package com.myself.mockito.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void testSize() {
		
		List mockList= mock(List.class);
		when(mockList.size()).thenReturn(10);
		assertEquals(10, mockList.size());
	}

	@Test
	public void testSize_multipleReturns() {
		
		List mockList= mock(List.class);
		when(mockList.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, mockList.size());
		assertEquals(20, mockList.size());
	}
	
	@Test
	public void testGet_SpecificParameters() {
		
		List mockList= mock(List.class);
		when(mockList.get(0)).thenReturn("Index is at zero");
		assertEquals("Index is at zero", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}
	
	@Test
	public void testGet_GenericParameter() {
		
		List mockList= mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("Something Happened");
		assertEquals("Something Happened", mockList.get(0));
		assertEquals("Something Happened", mockList.get(1));
	}
	
}
