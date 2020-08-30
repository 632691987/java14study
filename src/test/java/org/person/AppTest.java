package org.person;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Test;

public class AppTest
{
	@Test
	public void testCurrencyFormat() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(numberFormat.format(12.5d));
	}
}
