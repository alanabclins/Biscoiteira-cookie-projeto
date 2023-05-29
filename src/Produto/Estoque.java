package Produto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Estoque extends Produto{
    public static List<Produto> listaProdutos = new ArrayList<>();
    protected Produto produtos;
    Scanner s = new Scanner(System.in);

    public Estoque(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.produtos = new Produto(nome, preco, quantidade);
    }

    public Produto buscarproduto(String x){
        for (Produto produto : listaProdutos) {
            if(produto.nome.equalsIgnoreCase(x)){
                return produto;
            }
        }
        return null;
    }

    public void adicionarProduto() {
        System.out.println("Digite o nome do produto: ");
        this.nome = s.nextLine();
        System.out.println("Digite o valor do produto: ");
        this.preco = s.nextDouble(); s.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        this.quantidade = s.nextInt(); s.nextLine();
        Produto produtos = new Produto(nome, preco, quantidade);
        listaProdutos.add(produtos);
        System.out.println("Produto adicionado com sucesso!");
    }    

    public void apagarProduto() {
        System.out.println("Digite o nome do produto que quer deletar: ");
        String nomeBusca = s.nextLine();
        boolean produtoencontrado=false;
        for (Produto produtos : listaProdutos) {
            if (nomeBusca.equalsIgnoreCase(produtos.nome)) {
                listaProdutos.remove(produtos);
                produtoencontrado=true;
                System.out.println("Produto deletado com sucesso!");
                break;
            } 
        }
        try {
            if(!produtoencontrado){
                throw new NoSuchElementException("Produto não encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void imprimirEstoque() {
        System.out.println("Produtos cadastrados:");
        for (Produto produtos : listaProdutos) {
            System.out.println("Nome: " + produtos.getNome());
            System.out.println("Preço: " + produtos.getPreco());
            System.out.println("Quantidade: " + produtos.getQuantidade());
            System.out.println("------------------------");
        }
        if (listaProdutos.isEmpty()) {
            System.out.println("A lista de produtos está vazia.");
        } 
    }
    
    public static <T> boolean Empty(ArrayList<T> list) {
        return list == null || list.isEmpty();
    }
    
    public void limparEstoque() {
        listaProdutos.clear();
        System.out.println("Estoque limpo com sucesso!");
    }
}
