/******************************************************************************

Desmembra fila

Autor: Richard
Data: 23/09/2022

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
		FilaPessoa f = new FilaPessoa(100);
		FilaPessoa nnIdoso = new FilaPessoa(100);
		FilaPessoa Idoso = new FilaPessoa(100);
		
		Pessoa p;
		Pessoa aux;
		
		p = new Pessoa(18, 'M', "nnIdoso1");
		f.enfileira(p);
		p = new Pessoa(20, 'F', "nnIdoso2");
		f.enfileira(p);
		p = new Pessoa(45, 'M', "nnIdoso3");
		f.enfileira(p);
		p = new Pessoa(30, 'M', "nnIdoso4");
		f.enfileira(p);
		p = new Pessoa(11, 'F', "nnIdoso5");
		f.enfileira(p);
		
		p = new Pessoa(67, 'F', "Idoso1");
		f.enfileira(p);
		p = new Pessoa(70, 'F', "Idoso2");
		f.enfileira(p);
		p = new Pessoa(88, 'M', "Idoso3");
		f.enfileira(p);
		p = new Pessoa(63, 'M', "Idoso4");
		f.enfileira(p);
		p = new Pessoa(80, 'F', "Idoso5");
		f.enfileira(p);
		
		f.desmembra(Idoso, nnIdoso);
		
		// printa o maior, se for igual printa nnIdoso 
		/* while(Idoso.conta() > 0 || nnIdoso.conta() > 0) 
		{
		    if (Idoso.conta() > nnIdoso.conta())
		    {
		        System.out.println("Entrei no if");
		        aux = Idoso.desenfileira();
		        System.out.println(aux.nome);
		    }
		    else
		    {
		        System.out.println("Entrei no else");
		        aux = nnIdoso.desenfileira();
		        System.out.println(aux.nome);
		    }
		}
		*/
		
		// printa dois idosos, e um jovem
		while(Idoso.conta() > 0 || nnIdoso.conta() > 0) 
		{
		    for (int i = 0; i < 2; i++)
		    {
		        Pessoa aux2 = Idoso.desenfileira();
		        if (aux2 != null)
		            System.out.println(aux2.nome);
		    }
		    for (int i = 0; i < 1; i++)
		    {
		        Pessoa aux2 = nnIdoso.desenfileira();
		        if (aux2 != null)
		        {
		            System.out.println(aux2.nome);
		        }
		    }
		}
	}
}
