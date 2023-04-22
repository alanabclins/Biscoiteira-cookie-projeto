import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> listaProdutos = new ArrayList<>();
    String nome;
    double preco;
    int quantidade;
    Produto produtos = new Produto(nome, preco, quantidade);
    Scanner s = new Scanner(System.in);

    public Estoque() {
        this.produtos = new Produto(nome, preco, quantidade);
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
        for (Produto produtos : listaProdutos) {
            if (nomeBusca.equalsIgnoreCase(produtos.nome)) {
                listaProdutos.remove(produtos);
                System.out.println("Produto deletado com sucesso!");
                break;
            } else {
                System.out.println("Produto não encontrado.");
            }
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
    }

    public void limparEstoque() {
        listaProdutos.clear();
        System.out.println("Estoque limpo com sucesso!");
    }

}
