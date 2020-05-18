package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.ConversorNumeros;

public class testConversorNumeros 
{
	ConversorNumeros conversor;
	
	@Before
	public void inicializaTeste() 
	{
		conversor = new ConversorNumeros();
	}
	
	@Test
	public void testConverterI() 
	{	
		assertEquals(1, conversor.converterParaDecimal('I'));
	}
	
	@Test
	public void testConverterV() 
	{	
		assertEquals(5, conversor.converterParaDecimal('V'));
	}
	
	@Test
	public void testConverterX() 
	{	
		assertEquals(10, conversor.converterParaDecimal('X'));
	}
	
	@Test
	public void testConverterL() 
	{	
		assertEquals(50, conversor.converterParaDecimal('L'));
	}
	
	@Test
	public void testConverterC() 
	{	
		assertEquals(100, conversor.converterParaDecimal('C'));
	}
	
	@Test
	public void testConverterD() 
	{	
		assertEquals(500, conversor.converterParaDecimal('D'));
	}
	
	@Test
	public void testConverterM() 
	{	
		assertEquals(1000, conversor.converterParaDecimal('M'));
	}
	
	@Test
	public void testConverterII() 
	{	
		assertEquals(2, conversor.converterParaDecimal("II"));
	}
	
	@Test
	public void testConverterIV() 
	{	
		assertEquals(4, conversor.converterParaDecimal("IV"));
	}
	
	@Test
	public void testConverterVI() 
	{	
		assertEquals(6, conversor.converterParaDecimal("VI"));
	}
	
	@Test
	public void testConverterXII() 
	{	
		assertEquals(12, conversor.converterParaDecimal("XII"));
	}
	
	@Test(expected=IllegalArgumentException.class)
    public void testErroComIMinusculo() {
        conversor.converterParaDecimal('i');
    }
	
}
