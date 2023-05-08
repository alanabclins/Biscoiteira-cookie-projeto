import java.util.Scanner;
import java.util.List;

public class Main {
    public static void menu() {
        System.out.println("Você é: ");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cliente");
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque(null,0,0);
        Clientes clientes = new Clientes(null, null, null, null, null);
        MenuClientes menuClientes = new MenuClientes();
        MenuFuncionario menuFuncionario = new MenuFuncionario();
        brinde sorte = new brinde();
        String nome = null;
        String telefone = null;
        String instagram = null;
        String endereco = null;
        String zona = null;
        double frete = 0;
        Entrega entrega = new Entrega(nome, telefone, instagram, endereco, zona, frete);
        List<Produto> listaProdutos = Estoque.listaProdutos;
        Scanner s = new Scanner(System.in);
        System.out.println("Bem-vindo ao Biscoiteira cookie!");
        boolean continuar = true;
        menu();
        int resposta = s.nextInt(); s.nextLine();
        while (continuar == true) {
            if (resposta == 1) {
              int  escolha=  menuFuncionario.exibirMenu();

                switch (escolha) {
                    case 1:
                        clientes.buscarCliente();
                        break;
                    case 2:
                        estoque.adicionarProduto();
                        break;
                    case 3:
                        estoque.apagarProduto();
                        break;
                    case 4:
                        estoque.imprimirEstoque();
                        break;
                    case 5:
                        estoque.limparEstoque();
                        break;
                    case 6:
                        System.out.println("Finalizando programa:");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Hello, biscoiteiro! Digite uma opção válida :) ");
                        break;
                }
            } else {
                menuClientes.exibirMenu();
                int escolha = s.nextInt(); s.nextLine();
                switch (escolha) {
                    case 1:
                        clientes.cadastrarCliente();
                        break;
                    case 2:
                        clientes.atualizarCadastro();
                        break;
                    case 3:
                        clientes.deletarCadastro();
                        break;
                    case 4:
                        realizarCompra(clientes, frete, estoque, entrega, sorte);
                        break;
                    case 5:
                        double valorFrete = entrega.calcularFrete();
                        if (valorFrete == 0) {
                            System.out.println("Endereço inválido. Tente novamente.");
                        } else if (valorFrete == 5) {
                            System.out.println("O valor do frete é de R$" + valorFrete);
                            System.out.println("O tempo de entrega é de 30 min.");
                        } else if (valorFrete == 7) {
                            System.out.println("O valor do frete é de R$" + valorFrete);
                            System.out.println("O tempo de entrega é de 45 min.");
                        } else if (valorFrete == 10) {
                            System.out.println("O valor do frete é de R$" + valorFrete);
                            System.out.println("O tempo de entrega é de 60 min.");
                        } else if (valorFrete == 15) {
                            System.out.println("O valor do frete é de R$" + valorFrete);
                            System.out.println("O tempo de entrega é de 120 min.");
                        }
                        break;
                    case 6:
                        System.out.println("Finalizando programa:");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Hello, biscoiteiro! Digite uma opção válida :) ");
                        break;
                }
            }
            menu();
            resposta = s.nextInt(); s.nextLine();
        }
    }

    public static void realizarCompra(Clientes cliente, double frete, Estoque estoque, Entrega entrega, brinde sorte) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do cliente que irá realizar a compra: ");
        String nomeBusca = s.nextLine();
        String produto;
        if (nomeBusca.equalsIgnoreCase(cliente.nome)) {
            boolean carrinho = false;
            double compra = frete;
            while (carrinho == false) {
                System.out.println("Escolha o produto que deseja adicionar na sacola: ");
                estoque.imprimirEstoque();
                produto = s.nextLine();
                Produto a = estoque.buscarproduto(produto);
                if (a == null) {
                    System.out.println("Não encontramos esse produto.");
                } else {
                    System.out.println("Produto encontrado!");
                    a.setQuantidade(1);
                    compra = compra + a.getPreco();
                }
                System.out.println("Deseja adicionar mais produtos?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int resposta = s.nextInt(); s.nextLine();
                while (resposta != 1 && resposta != 2) {
                    System.out.println("Resposta inválida! Digite novamente: ");
                    resposta = s.nextInt(); s.nextLine();
                }
                if (resposta == 2) {
                    carrinho = true;
                    break;
                }
            }
            double valorFrete = entrega.calcularFrete();
            if (valorFrete == 0) {
                System.out.println("Endereço inválido. Tente novamente.");
            } else {
                System.out.println("Obrigada pela compra, biscoiteir@! O valor da sua compra foi de R$" + compra + " + o frete de R$" + valorFrete + "; dando um total de R$" + (compra + valorFrete) + ".");
                boolean win = sorte.sortudo();
                if(win==true){
                    System.out.println("Parabéns, você ganhou um adesivo!");
                }
            }
            if(valorFrete == 5) {
                System.out.println("Seu pedido chegará em 30 min.");
            } else if(valorFrete == 7) {
                System.out.println("Seu pedido chegará em 45 min.");
            } else if(valorFrete == 10) {
                System.out.println("Seu pedido chegará em 60 min.");
            } else {
                System.out.println("Seu pedido chegará em 120 min.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
