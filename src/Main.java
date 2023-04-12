import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = null;
        int telefone = 0;
        String instagram = null;
        String endereco = null;
        Scanner s = new Scanner(System.in);

        System.out.println("1. Criar um novo cadastro de cliente");
        System.out.println("2. Atualizar um cadastro já existente");
        System.out.println("3. Buscar cadastro por nome");
        System.out.println("4. Deletar cadastro");
        System.out.println("5. ");
        System.out.println("6. Sair");
        System.out.println("Informe a operação que deseja realizar: ");
        int escolha = s.nextInt();

        switch (escolha) {
            case 1:
                Clientes cliente = new Clientes(nome, telefone, instagram, endereco);
                cliente.cadastrarCliente();
                break;
            case 2:

                
        }
    }

    //Adaptar para o main e terminar
    /*public void realizarCompra() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do cliente que irá realizar a compra: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(this.nome)) {
            boolean carrinho = false;
            while(carrinho = false){
                System.out.println("Escolha o produto que deseja adicionar na sacola: ");
                //imprimir produtos existentes e opções para a pessoa escolher

                System.out.println("Deseja adicionar mais produtos?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int resposta = s.nextInt();
                while (resposta != 1 || resposta != 2){
                    System.out.println("Resposta inválida! Digite novamente: ");
                    resposta = s.nextInt();
                }
                if (resposta == 2) {
                    carrinho = true;
                    break;
                }
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }*/
}
