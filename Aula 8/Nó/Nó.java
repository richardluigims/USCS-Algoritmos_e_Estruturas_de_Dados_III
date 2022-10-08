class No
{
    int dados;
    No proximo;
    
    public No (int i)
    {
        dados = i;
        proximo = null;
    }
    
    public void imprime()
    {
        System.out.println(dados);
    }
}
