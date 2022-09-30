class FilaPessoa
{
    Pessoa dados[];
    int inicio, fim, capacidade;
    
    public FilaPessoa (int n)
    {
        capacidade = n;
        inicio = -1;
        fim = -1;
        dados = new Pessoa[capacidade];
    }
    
    public void enfileira (Pessoa p)
    {
        if (!cheia())
        {
            fim++;
            dados[fim] = p;
        }
    }
    
    public Pessoa desenfileira ()
    {
        inicio++;
        return dados[inicio];
    }
    
    public void imprime ()
    {
        for (int i = inicio + 1; i <= fim; i++)
        {
            dados[i].imprime();
        }
    }
    
    public boolean cheia ()
    {
        return (fim == capacidade - 1);
    }
    
    public boolean vazia()
    {
        return (conta() == 0);
    }
    
    public int conta ()
    {
        return fim - inicio;
    }
    
    public void desmembra (FilaPessoa Idoso, FilaPessoa nnIdoso)
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
