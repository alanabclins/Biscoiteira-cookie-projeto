public class Fabrica  extends Produto{
    private int fornada;
    private int estoque;
    public int getFornada() {
        return fornada;
    }
    public void setFornada(int fornada) {
        this.fornada = fornada;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public Fabrica(String nome, double preco, int quantidade, int fornada, int estoque) {
        super(nome, preco, quantidade);
        this.fornada = fornada;
        this.estoque = quantidade;
    }
    
    
}
