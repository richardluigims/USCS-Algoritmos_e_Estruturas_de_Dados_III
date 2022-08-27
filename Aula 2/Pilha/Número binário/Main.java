/******************************************************************************

Nome: Richard
Data: 19/08/2022

Imprimir número binário com pilha

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
		Pilha p = new Pilha ();
		
		int n = 100;
		
		while (n > 0)
		{
		    p.empilha(n%2);
		    n = n / 2;
		}
		
		p.imprimeAoContrario();
	}
}
