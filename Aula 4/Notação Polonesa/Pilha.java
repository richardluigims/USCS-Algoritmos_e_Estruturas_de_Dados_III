public class Pilha
{
    int capacidade;
    int topo;
    int dados[];
    
    void empilha (int d)
    {
        if (!cheia())
        {
            topo++;
            dados[topo] = d;
        }
    }
    
    boolean cheia()
    {
        return (capacidade == topo + 1);
    }
    
    void imprime ()
    {
        for (int i = 0; i <= topo; i++)
        {
            System.out.println(dados[i]);
        }
    }
    
    void imprimeAoContrario ()
    {
        for (int i = topo; i >= 0; i--)
        {
            System.out.print(dados[i] +  " ");
        }
    }
    
    public Pilha (int c)
    {
        capacidade = c;
        topo = -1;
        dados = new int [c];
    }
    
    public Pilha ()
    {
        capacidade = 100;
        topo = -1;
        dados = new int [100];
    }
    
    char desempilha()
    {
        char retorno = '*';
        
        if (!vazia())
        {
            retorno = (char)dados[topo];
            topo --;
        }
        
        return retorno;
    }
    
    
    boolean vazia()
    {
        return (topo == -1);
    }
}
