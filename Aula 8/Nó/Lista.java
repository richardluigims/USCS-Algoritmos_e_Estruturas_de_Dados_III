class Lista
{
    No inicio;
    
    public Lista ()
    {
        inicio = null;
    }
    
    public void InsereNoFinal (No aux)
    {
        if (vazia())
            inicio = aux;
        else
        {
            No atual;
            atual = inicio;
            while (atual.proximo != null)
            {
                atual = atual.proximo;
            }
            atual.proximo = aux;
        }
    }
    
    public void imprimeLista()
    {
        No atual;
        atual = inicio;
        while (atual != null)
        {
            atual.imprime();
            atual = atual.proximo;
        }
    }
    
    public boolean vazia()
    {
        return (inicio == null);
    }
}
