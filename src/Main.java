import java.util.Scanner;
import Menu.MenuClientes;
import Menu.MenuFuncionario;
import Brinde.brinde;
import Cliente.Clientes;
import Cliente.Entrega;
import Cliente.RealizarCompra;
import Produto.Estoque;

public class Main {
    public static void menu() {
        System.out.println("Você é: ");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cliente");
    }

    public static void main(String[] args) {
        String nome = null;
        String telefone = null;
        String instagram = null;
        String endereco = null;
        String zona = null;
        double frete = 0;
        Scanner s = new Scanner(System.in);
        Estoque estoque = new Estoque(null,0,0);
        Clientes clientes = new Clientes(null, null, null, null, null);
        MenuClientes menuClientes = new MenuClientes();
        MenuFuncionario menuFuncionario = new MenuFuncionario();
        brinde sorte = new brinde();
        Entrega entrega = new Entrega(nome, telefone, instagram, endereco, zona, frete);

        System.out.println("Bem-vindo ao Biscoiteira cookie!");
        boolean continuar = true;
        while (continuar == true) {
            menu();
            int resposta = s.nextInt(); s.nextLine();
            if (resposta == 1) {
              int  escolha =  menuFuncionario.exibirMenu();
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
            } else  if (resposta == 2){
                int escolh = menuClientes.exibirMenu();
                switch (escolh) {
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
                        RealizarCompra.realizarCompra(clientes, frete, estoque, entrega, sorte);
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
                        System.out.println("Finalizando programa.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Hello, biscoiteiro! Digite uma opção válida :) ");
                        break;
                } 
            }
        }
    }
}
