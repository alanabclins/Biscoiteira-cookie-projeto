import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Clientes {
    public static List<Cadastro> listaCadastros = new ArrayList<Cadastro>();
    String nome;
    String telefone;
    String instagram;
    String endereco;
    String zona;
    Cadastro cadastros = new Cadastro(nome, telefone, instagram, endereco, zona);
    Scanner s = new Scanner(System.in);

    public Clientes() {
        this.cadastros = new Cadastro(nome, telefone, instagram, endereco, zona);
    }
    
    public void cadastrarCliente() {
        System.out.println("Digite seu nome: ");
        this.nome = s.nextLine();
        System.out.println("Digite seu telefone (somente números): ");
        this.telefone = s.nextLine(); 
        System.out.println("Digite seu instagram: ");
        this.instagram = s.nextLine();
        System.out.println("Digite seu endereço: ");
        this.endereco = s.nextLine();
        System.out.println("Em que zona de Recife está localizado seu endereço? (Zona Norte, Zona Sul, Zona Oeste ou Centro)");
        this.zona = s.nextLine();
        Cadastro cadastros = new Cadastro(nome, telefone, instagram, endereco, zona);
        listaCadastros.add(cadastros);
        System.out.println("Cadastro concluído com sucesso!");
    }
    
    public void atualizarCadastro() {
        System.out.println("Digite seu nome para atualizar seu cadastro: ");
        String nomeBusca = s.nextLine();
        boolean achou = false;
        for (Cadastro cadastros : listaCadastros) {
            if (nomeBusca.equalsIgnoreCase(cadastros.nome)) {
                System.out.println("Digite seu novo telefone (somente números): ");
                cadastros.telefone = s.nextLine();
                System.out.println("Digite seu novo instagram: ");
                cadastros.instagram = s.nextLine();
                System.out.println("Digite seu novo endereço: ");
                cadastros.endereco = s.nextLine();
                System.out.println("Digite a zona do seu novo endereço (Zona Norte, Zona Sul, Zona Oeste ou Centro): ");
                cadastros.zona = s.nextLine();
                System.out.println("Cadastro atualizado com sucesso!");
                achou = true;
                break;
            } 
        }
        if (achou == false) {
            System.out.println("Poxa, esse nome ainda não foi cadastrado. Confirme o nome exato que você usou no seu cadastro e tente novamente.");
        }
    }
    
    public void buscarCliente() {
        System.out.println("Digite o nome do cliente: ");
        String nomeBusca = s.nextLine();
        boolean achou = false;
        for (Cadastro cadastros : listaCadastros) {
            if (nomeBusca.equalsIgnoreCase(cadastros.nome)) {
                System.out.println("Nome: " + cadastros.nome);
                System.out.println("Telefone: " + cadastros.telefone);
                System.out.println("Instagram: " + cadastros.instagram);
                System.out.println("Endereço: " + cadastros.endereco);
                System.out.println("Zona: " + cadastros.zona);
                achou = true;
                break;
            }
        }
        if (achou == false) {
            System.out.println("Cadastro não encontrado.");
        }
    }
    
    public void deletarCadastro() {
        System.out.println("Digite seu nome para deletar seu cadastro: ");
        String nomeBusca = s.nextLine();
        boolean achou = false;
        for (Cadastro cadastros : listaCadastros) {
            if (nomeBusca.equalsIgnoreCase(cadastros.nome)) {
                listaCadastros.remove(cadastros);
                System.out.println("Cadastro deletado com sucesso!");
                achou = true;
                break;
            } 
        }
        if (achou == false) {
            System.out.println("Cadastro não encontrado.");
        }
    }
}