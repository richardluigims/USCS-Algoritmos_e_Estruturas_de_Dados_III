class FilaCircular
{
    Pessoa dados[];
    int inicio, fim, capacidade;
    
    public FilaCircular (int n)
    {
        capacidade = n;
        inicio = 0;
        fim = 0;
        dados = new Pessoa[capacidade];
    }
    
    public void enfileira (Pessoa p)
    {
        if (!cheia())
        {
            fim = (fim + 1) % capacidade;
            dados[fim] = p;
        }
    }
    
    public Pessoa desenfileira ()
    {
        inicio = (inicio + 1) % capacidade;
        return dados[inicio];
    }
    
    public void imprime ()
    {
        int aux;
        for (int i = 1; i <= conta(); i++)
        {
            aux = (inicio + i) % capacidade;
            dados[aux].imprime();
        }
    }
    
    public boolean cheia ()
    {
        return (inicio == (fim + 1) % capacidade);
    }
    
    public boolean vazia()
    {
        return (inicio == fim);
    }
    
    public int conta ()
    {
        int ret;
        
        if (fim > inicio)
            ret = fim - inicio;
        else
        {
            ret = capacidade - inicio + fim;
        }
        
        return ret;
    }
    
    public void desmembra (FilaCircular Idoso, FilaCircular nnIdoso)
    {
        for (int i = inicio + 1; i <= fim; i++)
        {
            if (dados[i].idade >= 60)
            {
                Idoso.enfileira(desenfileira());
            }
            else
            {
                nnIdoso.enfileira(desenfileira());
            }
        }
    }
}
