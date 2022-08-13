/******************************************************************************

Richard - Função
12/08/2022

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
	    int a = 4, b = 2;
	    
		calculadora(a,b);
	}
	
	public static void calculadora(int a, int b)
	{
	    System.out.println("A + B = " + (a + b)); // printf
		System.out.println("A - B = " + (a - b));
		System.out.println("A / B = " + (a / b));
		System.out.println("A * B = " + (a * b));
		System.out.println("A % B = " + (a % b));
	}
}
