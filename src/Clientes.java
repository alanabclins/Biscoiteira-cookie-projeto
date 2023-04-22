import java.util.Scanner;

public class Clientes {
    protected String nome;
    protected double telefone;
    protected String instagram;
    protected String endereco;
    Scanner s = new Scanner(System.in);

    public Clientes(String nome, double telefone, String instagram, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.instagram = instagram;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getTelefone() {
        return telefone;
    }
    
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    
    public String getInstagram() {
        return instagram;
    }
    
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void cadastrarCliente() {
        System.out.println("Digite seu nome: ");
        this.nome = s.nextLine();
        System.out.println("Digite seu telefone (somente números): ");
        this.telefone = s.nextDouble(); s.nextLine();
        System.out.println("Digite seu instagram: ");
        this.instagram = s.nextLine();
        System.out.println("Digite seu endereço: ");
        this.endereco = s.nextLine();
        System.out.println("Cadastro concluído com sucesso!");
    }
    
    public void atualizarCadastro() {
        System.out.println("Digite seu nome para atualizar seu cadastro: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(this.nome)) {
            System.out.println("Digite seu novo telefone (somente números): ");
            this.telefone = s.nextDouble(); s.nextLine();
            System.out.println("Digite seu novo instagram: ");
            this.instagram = s.nextLine();
            System.out.println("Digite seu novo endereço: ");
            this.endereco = s.nextLine();
            System.out.println("Cadastro atualizado com sucesso!");
        } else {
            System.out.println("Poxa, esse nome ainda não foi cadastrado. Confirme o nome exato que você usou no seu cadastro e tente novamente.");
        }
    }
    
    public void buscarCliente() {
        System.out.println("Digite o nome do cliente: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(this.nome)) {
            System.out.println("Nome: " + this.nome);
            System.out.println("Telefone: " + this.telefone);
            System.out.println("Instagram: " + this.instagram);
            System.out.println("Endereço: " + this.endereco);
        } else {
            System.out.println("Cadastro não encontrado.");
        }
    }
    
    public void deletarCadastro() {
        System.out.println("Digite seu nome para deletar seu cadastro: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(this.nome)) {
            this.nome = "";
            this.telefone = 0;
            this.instagram = "";
            this.endereco = "";
            System.out.println("Cadastro deletado com sucesso!");
        } else {
            System.out.println("Cadastro não encontrado.");
        }
    }
}