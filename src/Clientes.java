import java.util.Scanner;

public class Clientes {
    protected String nome;
    protected int telefone;
    protected String instagram;
    protected String endereco;
    Scanner s = new Scanner(System.in);

    public Clientes(String nome, int telefone, String instagram, String endereco) {
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
    
    public int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
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
        System.out.println("Digite o nome do cliente: ");
        this.nome = s.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        this.telefone = s.nextInt();
        System.out.println("Digite o instagram do cliente: ");
        this.instagram = s.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        this.endereco = s.nextLine();
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    public void atualizarCadastro() {
        System.out.println("Digite o nome do cliente para atualizar seu cadastro: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(this.nome)) {
            System.out.println("Digite o novo telefone: ");
            this.telefone = s.nextInt();
            System.out.println("Digite o novo instagram: ");
            this.instagram = s.nextLine();
            System.out.println("Digite o novo endereço: ");
            this.endereco = s.nextLine();
            System.out.println("Cadastro atualizado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado.");
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
            System.out.println("Usuário não encontrado.");
        }
    }
    
    public void deletarCadastro() {
        System.out.println("Digite o nome do cliente para deletar seu cadastro: ");
        String nomeBusca = s.nextLine();
        if (nomeBusca.equalsIgnoreCase(this.nome)) {
            this.nome = "";
            this.telefone = 0;
            this.instagram = "";
            this.endereco = "";
            System.out.println("Cadastro deletado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}