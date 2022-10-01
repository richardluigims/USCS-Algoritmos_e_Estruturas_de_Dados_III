/******************************************************************************

Fila Circular

Autor: Richard
Data: 23/09/2022

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
	    FilaCircular f =  new FilaCircular(5);
	    
	    Pessoa p = new Pessoa(18, 'M', "nnIdoso1");
		f.enfileira(p);
		Pessoa p2 = new Pessoa(20, 'F', "nnIdoso2");
		f.enfileira(p2);
		Pessoa p3 = new Pessoa(45, 'M', "nnIdoso3");
		f.enfileira(p3);
		Pessoa p4 = new Pessoa(30, 'M', "nnIdoso4");
		f.enfileira(p4);
		Pessoa p5 = new Pessoa(11, 'F', "nnIdoso5");
		f.enfileira(p5);
	    
	    System.out.println(f.conta());
	    f.imprime();
	    
	    f.desenfileira();
	    f.desenfileira();
	    
	    Pessoa p6 = new Pessoa(14, 'M', "nnIdoso6");
	    f.enfileira(p6);
	    Pessoa p7 = new Pessoa(20, 'F', "nnIdoso7");
	    f.enfileira(p7);
	    
	    System.out.println("\n ---- Circulou ----");
	    f.imprime();
	}
}
