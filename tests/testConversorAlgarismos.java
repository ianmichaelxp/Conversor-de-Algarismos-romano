package tests;

import org.junit.Assert;
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
		Assert.assertEquals("I", conversor.decimalParaRomano(1));
	}
	
	@Test
	public void testConverter3() 
	{	
		Assert.assertEquals("III", conversor.decimalParaRomano(3));
	}
	
	@Test
	public void testConverter10() 
	{	
		Assert.assertEquals("X", conversor.decimalParaRomano(10));
	}
	
	@Test
	public void testConverter20() 
	{	
		Assert.assertEquals("XX", conversor.decimalParaRomano(20));
	}
	
	@Test
	public void testConverter24() 
	{	
		Assert.assertEquals("XXIV", conversor.decimalParaRomano(24));
	}
	
	@Test
	public void testConverter100() 
	{	
		Assert.assertEquals("C", conversor.decimalParaRomano(100));
	}
	
	@Test
	public void testConverter151() 
	{	
		Assert.assertEquals("CLI", conversor.decimalParaRomano(151));
	}
	
	@Test
	public void testConverter1501() 
	{	
		Assert.assertEquals("MDI", conversor.decimalParaRomano(1501));
	}
}

