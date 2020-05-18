package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.ConversorNumeros;

public class testConversorAlgarismos 
{
	ConversorNumeros conversor;
	
	@Before
	public void inicializaTeste() throws Exception
	{
		conversor = new ConversorNumeros();
	}
	
	@Test
	public void testConverter1() 
	{	
		assertEquals("I", conversor.decimalParaRomano(1));
	}
	
	@Test
	public void testConverter3() 
	{	
		assertEquals("III", conversor.decimalParaRomano(3));
	}
	
	@Test
	public void testConverter10() 
	{	
		assertEquals("X", conversor.decimalParaRomano(10));
	}
	
	@Test
	public void testConverter20() 
	{	
		assertEquals("XX", conversor.decimalParaRomano(20));
	}
	
	@Test
	public void testConverter24() 
	{	
		assertEquals("XXIV", conversor.decimalParaRomano(24));
	}
	
	@Test
	public void testConverter100() 
	{	
		assertEquals("C", conversor.decimalParaRomano(100));
	}
	
	@Test
	public void testConverter151() 
	{	
		assertEquals("CLI", conversor.decimalParaRomano(151));
	}
	
	@Test
	public void testConverter1501() 
	{	
		assertEquals("MDI", conversor.decimalParaRomano(1501));
	}
}
