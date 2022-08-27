/******************************************************************************

Autor: Richard
Data: 26/08/2022

Análise de String

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String n = "Richard";
		int len = n.length();
		
		char primeiro = n.charAt(0);
		char ultimo = n.charAt(len-1);
		
		System.out.print(primeiro + "\n" + ultimo + "\n" + len);
	}
}
