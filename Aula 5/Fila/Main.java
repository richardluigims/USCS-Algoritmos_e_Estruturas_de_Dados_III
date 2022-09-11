/******************************************************************************

Exemplo de Fila

Autor: Richard
Data: 09/09/2022

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Fila f = new Fila();
	    
	    int vetor[] = { 8, 9, 10 };
	    
	    System.out.println(f.conta());
	    
	    if(f.vazia())
	    {
	        System.out.println("Fila vazia");
	    }
	    
	    for (int i = 0; i < vetor.length; i++)
	    {
	        f.enfileira(vetor[i]);
	    }
	    
	    if(f.cheia())
	    {
	        System.out.println("Fila cheia");
	    }
	       
	    f.imprime();
	    
	    System.out.println("Quantidade = " + f.conta());
	    
	    f.desenfileira();
	    f.imprime();
	    
	    System.out.println("Quantidade = " + f.conta());
	}
}
