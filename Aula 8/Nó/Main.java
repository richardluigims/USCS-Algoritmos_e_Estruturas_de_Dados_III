/******************************************************************************

Exemplo de Nó

Autor: Richard
Data: 07/10/2022

*******************************************************************************/

public class Main
{
	public static void main(String[] args)
	{
	    Lista L = new Lista();
	    
        No n;
        
        n = new No(5);
        L.InsereNoFinal(n);
        
        n = new No(6);
        L.InsereNoFinal(n);
        
        n = new No(7);
        L.InsereNoFinal(n);
        
        L.imprimeLista();
	}
}
