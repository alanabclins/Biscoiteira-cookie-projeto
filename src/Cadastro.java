public class Cadastro {
    protected String nome;
    protected String telefone;
    protected String instagram;
    protected String endereco;
    protected String zona;

    public Cadastro(String nome, String telefone, String instagram, String endereco, String zona) {
        this.nome = nome;
        this.telefone = telefone;
        this.instagram = instagram;
        this.endereco = endereco;
        this.zona = zona;
    }
    public Cadastro(String nome, String telefone, String instagram) {
        this.nome = nome;
        this.telefone = telefone;
        this.instagram = instagram;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
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

    public String getZona() {
        return zona;
    }
    
    public void setZona(String zona) {
        this.zona = zona;
    }
}