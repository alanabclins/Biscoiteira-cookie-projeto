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
        String nome = null;
        String telefone = null;
        String instagram = null;
        String endereco = null;
        String zona = null;
        double frete = 0;
        Entrega entrega = new Entrega(nome, telefone, instagram, endereco, zona, frete);
        List<Produto> listaProdutos = Estoque.listaProdutos;
        Scanner s = new Scanner(System.in);
        // Clientes cliente = new Clientes(nome, telefone, instagram, endereco);
        System.out.println("Bem-vindo ao Biscoiteira cookie!");
        boolean continuar = true;
        menu();
        int resposta = s.nextInt();
        while (continuar == true) {
            if (resposta == 1) {
                menuClientes.exibirMenu();
                int escolha = s.nextInt();
                s.nextLine();

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
                menuFuncionario.exibirMenu();
                int escolha = s.nextInt();
                s.nextLine();
                switch (escolha) {
                    case 6:
                        clientes.cadastrarCliente();
                        break;
                    case 7:
                        clientes.atualizarCadastro();
                        break;
                    case 8:
                        clientes.deletarCadastro();
                        break;
                    case 9:
                        /*
                         * frete(entrega);
                         * Double frete = entrega.calcularFrete();
                         */
                        realizarCompra(clientes, frete, estoque);
                        break;
                    case 10:
                        double valorFrete = entrega.calcularFrete();
                        if (valorFrete == 0) {
                            System.out.println("Endereço inválido. Tente novamente.");
                        } else if (valorFrete == 5) {
                            System.out.println("O valor do frete é de R$5,00.");
                        } else if (valorFrete == 7) {
                            System.out.println("O valor do frete é de R$7,00.");
                        } else if (valorFrete == 10) {
                            System.out.println("O valor do frete é de R$10,00.");
                        } else if (valorFrete == 15) {
                            System.out.println("O valor do frete é de R$15,00.");
                        }
                        break;
                    case 11:
                        System.out.println("Finalizando programa:");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Hello, biscoiteiro! Digite uma opção válida :) ");
                        break;
                }
            }
        }

    }

    /*
     * public static void frete(Entrega entrega){
     * // calculando entrega
     * Scanner s = new Scanner(System.in);
     * System.out.println("Qual a sua zona?");
     * String zona = s.nextLine();
     * entrega.setZona(zona);
     * Double frete = entrega.calcularFrete();
     * System.out.println("O valor da entrega é " + frete + " e o tempo será de " +
     * entrega.getTempoDeEntrega() + "min.");
     * 
     * }
     * 
     */
    public static void realizarCompra(Clientes cliente, double frete, Estoque estoque) {
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
                int resposta = s.nextInt();
                while (resposta != 1 && resposta != 2) {
                    System.out.println("Resposta inválida! Digite novamente: ");
                    resposta = s.nextInt();
                }
                if (resposta == 2) {
                    carrinho = true;
                    break;
                }
            }
            System.out.println("Obrigada pela compra, biscoiteir@! O valor total da compra foi " + compra + ".");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
