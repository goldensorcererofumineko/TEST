package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestTest {

	@Test
	public void test() {
		List<String> mock = mock(List.class);
		List<String> spy = spy(new ArrayList<>());



		when(mock.get(0)).thenReturn("Mission Impossible");

		spy.add(mock.get(0));
		verify(spy).add(mock.get(0));

		assertEquals("Mission Impossible",spy.get(0));
	}

}
