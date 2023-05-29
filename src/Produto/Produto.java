package Produto;

public class Produto  {
    protected String nome;
    protected double preco;
    protected int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int x) {
        this.quantidade = quantidade-x;
    }
    
    /*public void delete (String nome){
        if(nome.equals(this.nome)){
        this.nome = null;
        this.preco = 0;
        this.quantidade = 0;
        }
    }*/
}
