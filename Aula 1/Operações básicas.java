/******************************************************************************

Richard - Primeiro Programa Java
12/08/2022

temos aqui:
2 métodos chamados main e println (métodos com letra minúscula)
Nenhum atributo
3 classes chamdas Main, System e String (classes com letra maiúscula)
Println é um método da classe System
String também é classe

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
	    int a = 4, b = 2;
	    
		System.out.println("A + B = " + (a + b)); // printf
		System.out.println("A - B = " + (a - b));
		System.out.println("A / B = " + (a / b));
		System.out.println("A * B = " + (a * b));
		System.out.println("A % B = " + (a % b));
	}
}
