package Cliente;

import java.util.Scanner;
import Brinde.brinde;
import Produto.Estoque;
import Produto.Produto;

public class RealizarCompra {

    public static void realizarCompra(Clientes cliente, double frete, Estoque estoque, Entrega entrega, brinde sorte) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do cliente que irá realizar a compra: ");
        String nomeBusca = s.nextLine();
        String produto;

        if (nomeBusca.equalsIgnoreCase(cliente.getNome())) {
            boolean carrinho = false;
            double compra = frete;

            while (!carrinho) {
                System.out.println("Escolha o produto que deseja adicionar na sacola: ");
                estoque.imprimirEstoque();
                produto = s.nextLine();
                Produto a = estoque.buscarProduto(produto);

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
                s.nextLine();

                while (resposta != 1 && resposta != 2) {
                    System.out.println("Resposta inválida! Digite novamente: ");
                    resposta = s.nextInt();
                    s.nextLine();
                }

                if (resposta == 2) {
                    carrinho = true;
                    break;
                }
            }

            System.out.println("Sua compra será: 1- Retirada; 2- Entrega");
            int retirada = s.nextInt();
            s.nextLine();

            if (retirada == 2) {
                double valorFrete = entrega.calcularFrete();

                if (valorFrete == 0) {
                    System.out.println("Endereço inválido. Tente novamente.");
                } else {
                    System.out.println("Obrigada pela compra, biscoiteir@! O valor da sua compra foi de R$" + compra + " + o frete de R$" + valorFrete + "; dando um total de R$" + (compra + valorFrete) + ".");
                    boolean win = sorte.sortudo();

                    if (win) {
                        System.out.println("Parabéns, você ganhou um adesivo!");
                    }
                }

                if (valorFrete == 5) {
                    System.out.println("Seu pedido chegará em 30 min.");
                } else if (valorFrete == 7) {
                    System.out.println("Seu pedido chegará em 45 min.");
                } else if (valorFrete == 10) {
                    System.out.println("Seu pedido chegará em 60 min.");
                } else {
                    System.out.println("Seu pedido chegará em 120 min.");
                }
            } else {
                System.out.println("Retire em nosso ponto, Rua Dr. Fernando, 300, em 120 minutos.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
