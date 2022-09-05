/******************************************************************************

Nome: Richard
Data: 19/08/2022

Exemplo de pilha - notação polonesa

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
		Pilha p = new Pilha ();
		
		String expressao = "53+4+";
		int a = 0, b = 0;
		char aux; int resultado = 0;
		
		for(int i = 0; i < expressao.length(); i++)
		{
            aux = expressao.charAt(i);
            
		    if (aux >= '0' && aux <= '9')
		    {
		        p.empilha(Character.getNumericValue(aux));
		    }
		    else
		    {
		        a = p.desempilha();
		        b = p.desempilha();
		      
		        if (aux == '+') resultado = a + b;
		        if (aux == '-') resultado = a - b;
		        if (aux == '*') resultado = a * b;
		        if (aux == '/') resultado = a / b;
		        if (aux == '%') resultado = a % b;
		        
		        p.empilha(resultado);
		    }
		}
		
		resultado = p.desempilha();
		
		System.out.print(expressao + " = " + resultado);
	}
}
