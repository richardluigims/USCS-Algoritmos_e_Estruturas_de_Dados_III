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
    
    Pilha (int c)
    {
        capacidade = c;
        topo = -1;
        dados = new int [c];
    }
}
