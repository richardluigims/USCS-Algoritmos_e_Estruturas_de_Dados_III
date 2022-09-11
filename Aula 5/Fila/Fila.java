public class Fila
{
    int inicio;
    int fim;
    int capacidade;
    int dados[];
    
    public Fila ()
    {
        inicio = -1;
        fim = -1;
        capacidade = 3;
        dados = new int[100];
    }
    
    public void enfileira (int n)
    {
        if (!cheia())
        {
            fim++;
            dados[fim] = n;
        }
    }
    
    public void imprime ()
    {
        for (int i = inicio + 1; i <= fim; i++)
        {
            System.out.println(dados[i]);
        }
    }
    
    public int desenfileira ()
    {
        inicio++;
        return dados[inicio];
    }
    
    public boolean cheia ()
    {
        return (fim == capacidade - 1);
    }
    
    public boolean vazia ()
    {
        return (conta() == 0);
    }
    
    public int conta ()
    {
        return fim-inicio;
    }
}
