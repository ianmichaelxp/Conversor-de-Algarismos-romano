package tests;

import org.junit.Assert;
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
		Assert.assertEquals(1, conversor.converterParaDecimal('I'));
	}
	
	@Test
	public void testConverterV() 
	{	
		Assert.assertEquals(5, conversor.converterParaDecimal('V'));
	}
	
	@Test
	public void testConverterX() 
	{	
		Assert.assertEquals(10, conversor.converterParaDecimal('X'));
	}
	
	@Test
	public void testConverterL() 
	{	
		Assert.assertEquals(50, conversor.converterParaDecimal('L'));
	}
	
	@Test
	public void testConverterC() 
	{	
		Assert.assertEquals(100, conversor.converterParaDecimal('C'));
	}
	
	@Test
	public void testConverterD() 
	{	
		Assert.assertEquals(500, conversor.converterParaDecimal('D'));
	}
	
	@Test
	public void testConverterM() 
	{	
		Assert.assertEquals(1000, conversor.converterParaDecimal('M'));
	}
	
	@Test
	public void testConverterII() 
	{	
		Assert.assertEquals(2, conversor.converterParaDecimal("II"));
	}
	
	@Test
	public void testConverterIV() 
	{	
		Assert.assertEquals(4, conversor.converterParaDecimal("IV"));
	}
	
	@Test
	public void testConverterVI() 
	{	
		Assert.assertEquals(6, conversor.converterParaDecimal("VI"));
	}
	
	@Test
	public void testConverterXII() 
	{	
		Assert.assertEquals(12, conversor.converterParaDecimal("XII"));
	}
	
	@Test(expected=IllegalArgumentException.class)
    public void testErroComIMinusculo() {
        conversor.converterParaDecimal('i');
    }
	
}
