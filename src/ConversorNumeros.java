package src;
import java.util.ArrayList;
import java.util.List;

public class ConversorNumeros {

	private class algarismoRomano 
    {
        private Integer numDecimal;
        private String algRomano;

        public algarismoRomano(String algRomano, Integer numDecimal) 
        {
            this.numDecimal = numDecimal;
            this.algRomano = algRomano;
        }

    }

    List<algarismoRomano> algarismos = new ArrayList<algarismoRomano>();

    public ConversorNumeros() 
    {   
        algarismos.add(new algarismoRomano("M", 1000));
        algarismos.add(new algarismoRomano("D", 500));
        algarismos.add(new algarismoRomano("C", 100));
        algarismos.add(new algarismoRomano("L", 50));
        algarismos.add(new algarismoRomano("X", 10));
        algarismos.add(new algarismoRomano("V", 5));
        algarismos.add(new algarismoRomano("I", 1));
    }
	
	public int converterParaDecimal (char algarismo) 
	{
		switch (algarismo) 
		{
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
                throw new IllegalArgumentException();			
		}
	}
	
	public int converterParaDecimal (String algarismoRomano) 
	{
		int valorResultante = 0;
		
		for(int i = 0; i < algarismoRomano.length(); i++) 
		{
			int valorAtual = converterParaDecimal(algarismoRomano.charAt(i));
			int valorAnterior = i - 1 >= 0 ? converterParaDecimal(algarismoRomano.charAt(i-1)) : 0;
			
			if(valorAnterior < valorAtual) 
			{
                valorResultante = valorAtual - valorResultante;
            } 
			else 
            {
                valorResultante = valorResultante + valorAtual;
            }
		}
		
		return valorResultante;
	}
	
	public String decimalParaRomano(Integer numDecimal) 
    {
        if (numDecimal <= 0) 
        {
            throw new RuntimeException("Digite um número válido!");
        }

        String romano = "";

        while (numDecimal > 0) 
        {
            for (algarismoRomano num : algarismos) 
            {
                if (numDecimal / num.numDecimal > 0) 
                {
                    romano += num.algRomano;
                    numDecimal -= num.numDecimal;
                    break;
                }
            }
        }

        return validaSeTemQuatroAlgarismos(romano);
    }

    private String validaSeTemQuatroAlgarismos(String romano) 
    {
        String superiorRomano = null;

        for (algarismoRomano algarismo : algarismos) 
        {
            if (superiorRomano == null) 
            {
                superiorRomano = algarismo.algRomano;
                continue;
            }


            int ultimaPosicao = romano.lastIndexOf(algarismo.algRomano + algarismo.algRomano + algarismo.algRomano + algarismo.algRomano);
            if (ultimaPosicao >= 0) 
            {
                romano = romano.substring(0, ultimaPosicao) + algarismo.algRomano + superiorRomano + romano.substring(ultimaPosicao + 4);
            }

            superiorRomano = algarismo.algRomano;
        }
        return romano;
    }
}
