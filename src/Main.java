import java.util.Scanner;

public class Main {
    public static void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Você é: ");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cliente");
        int resposta = s.nextInt(); s.nextLine();
        if(resposta == 1){
            System.out.println("Informe a operação que deseja realizar: ");
            System.out.println("1. Criar um novo cadastro de cliente");
            System.out.println("2. Atualizar um cadastro já existente");
            System.out.println("3. Buscar cadastro por nome");
            System.out.println("4. Deletar cadastro");
            System.out.println("5. Adicionar produto no estoque");
            System.out.println("6. Apagar produto do estoque");
            System.out.println("7. Mostrar todo o estoque");
            System.out.println("8. Limpar estoque");
            System.out.println("11. Sair");
        } else {
            System.out.println("Informe a operação que deseja realizar: ");
            System.out.println("9. Realizar compra");
            System.out.println("10. Calcular frete para sua zona");
            System.out.println("11. Sair");
        }
    }
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner s = new Scanner(System.in);
        String nome = null;
        int telefone = 0;
        String instagram = null;
        String endereco = null;
        Clientes cliente = new Clientes(nome, telefone, instagram, endereco);
        Entrega entrega = new Entrega(nome, telefone, instagram, endereco, null, 0);
        System.out.println("Bem-vindo ao Biscoiteira cookie!");
        boolean cadastrado = false;
        boolean continuar = true;
        while (continuar == true) {
            menu();
            int escolha = s.nextInt(); s.nextLine();

            switch (escolha) {
                case 1:
                    cliente.cadastrarCliente();
                    cadastrado = true;
                    break;
                case 2:
                    System.out.println("Atualizando cadastro: ");
                    if (cadastrado == true) {
                        cliente.atualizarCadastro();
                    } else {
                        System.out.println("Cliente não cadastrado. Para cadastrar, digite 1.");
                    }
                    break;
                case 3:
                    cliente.buscarCliente();
                    break;
                case 4:
                    if (cadastrado == true) {
                        cliente.deletarCadastro();
                        cadastrado = false;
                    } else {
                        System.out.println("Hey! Esse usuário ainda não possui um cadastro biscoiteira! Para realizar o cadastro, digite 1");
                    }
                    break;
                case 5:
                    estoque.adicionarProduto();
                    break;
                case 6:
                    estoque.apagarProduto();
                    break;
                case 7:
                    estoque.imprimirEstoque();
                    break;
                case 8:
                    estoque.limparEstoque();
                    break;
                /*case 9:
                    frete(entrega);
                    Double frete = entrega.calcularFrete();
                    //adaptar para estoque
                    realizarCompra(entrega, cliente, produtos, frete) ;
                    break;
                case 10:
                    //calcular frete para a zona dita pelo cliente
                case 11:
                    System.out.println("Finalizando programa:");
                    continuar = false;
                    break;
                default:
                    System.out.println("Hello, biscoiteiro! Digite uma opção válida :) ");
                    break;*/
            }
        }
    } 
    /*public static void frete(Entrega entrega){
        // calculando entrega
        Scanner s = new Scanner(System.in);
        System.out.println("Qual a sua zona?");
        String zona = s.nextLine();
        entrega.setZona(zona);
        Double frete = entrega.calcularFrete();
        System.out.println("O valor da entrega é " + frete + " e o tempo será de " + entrega.getTempoDeEntrega() + "min.");
        
    }

    // Veificar
    public static void realizarCompra(Entrega entrega, Clientes cliente, Produto[] produtos, double frete) {
        Scanner s = new Scanner(System.in);
        int escolha = 0;
        System.out.println("Digite o nome do cliente que irá realizar a compra: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(cliente.nome)) {
            boolean carrinho = false;
            double compra = frete;
            while (carrinho == false) {
                System.out.println("Escolha o produto que deseja adicionar na sacola: ");
                for (int i = 0; i < produtos.length; i++) {
                    System.out.println("Produto " + (i+1) + " " + produtos[i].nome + "=" + produtos[i].preco + "reais");

                }
                escolha=s.nextInt();
                while (escolha != 1 && escolha != 2) {
                    System.out.println("Resposta inválida! Digite novamente: ");
                    escolha = s.nextInt();
                }
                if (produtos[escolha - 1].getQuantidade() > 0) {
                    double preco = produtos[escolha - 1].getPreco();
                    compra = compra + preco;
                    int quant = produtos[escolha - 1].getQuantidade();
                    produtos[escolha - 1].setQuantidade(quant - 1);
                } else {
                    System.out.println("Infelizmente não temos mais esse produto ;(");
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
    }*/
}
