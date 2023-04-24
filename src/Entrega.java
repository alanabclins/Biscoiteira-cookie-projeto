import java.util.List;
import java.util.Scanner;

public class Entrega  extends Cadastro{
    protected double frete;
    protected double tempoDeEntrega;
    private List<Cadastro> listaCadastros = Clientes.listaCadastros;
    Scanner s = new Scanner(System.in);
    
    public Entrega(String nome, String telefone, String instagram, String endereco, String zona, double frete) {
        super(nome, telefone, instagram, endereco, zona);
        this.tempoDeEntrega= 0;
        this.frete = 0;
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
    public double getFrete() {
        return frete;
    }
    public void setFrete(double frete) {
        this.frete = frete;
    }
    public double calcularFrete() {
        System.out.println("Deseja usar seu endereço cadastrado? 1- Sim, 2- Não, usar outro endereço.");
        int resposta = s.nextInt(); s.nextLine();
        if (resposta == 1) {
            System.out.println("Digite seu nome de cadastro: ");
            String nomeBusca = s.nextLine();
            boolean achou = false;
            for (Cadastro cadastros : listaCadastros) {
                if (nomeBusca.equalsIgnoreCase(cadastros.nome)) {
                    achou = true;
                    if(cadastros.zona.equalsIgnoreCase("Zona Norte")){
                        this.frete = 5;
                        //rever - calcularTempo();
                        return 5;
                    } else if(cadastros.zona.equalsIgnoreCase("Centro")){
                        this.frete = 7;
                        //rever - calcularTempo();
                        return 7;
                    } else if(cadastros.zona.equalsIgnoreCase("Zona Oeste")){
                        this.frete = 10;
                        //rever - calcularTempo();
                        return 10;
                    } else {
                        this.frete=15;
                        //rever - calcularTempo();
                        return 15;
                    }
                
                }
                if (achou == false) {
                    System.out.println("Poxa, esse nome ainda não foi cadastrado. Confirme o nome exato que você usou no seu cadastro e tente novamente.");
                }
            }
        } else {
            System.out.println("Digite o endereço de entrega: ");
            String endereco = s.nextLine();
            System.out.println("Em que zona de Recife está localizado esse endereço? (Zona Norte, Zona Sul, Zona Oeste ou Centro)");
            String zona = s.nextLine();
            if (zona.equalsIgnoreCase("Zona Norte")) {
                this.frete = 5;
                //rever - calcularTempo();
                return 5;
            }
            else if (zona.equalsIgnoreCase("Centro")) {
                this.frete = 7;
                //rever - calcularTempo();
                return 7;
            }
            else if (zona.equalsIgnoreCase("Zona Oeste")) {
                this.frete = 10;
                //rever - calcularTempo();
                return 10;
            } else {
                this.frete=15;
                //rever - calcularTempo();
                return 15;
            }
        }
        return 0;
    }
    public  void calcularTempo(){
        if(zona.compareToIgnoreCase("ZN")==1){
            this.tempoDeEntrega= 30;
        } else if(zona.compareToIgnoreCase("centro")==1){
            this.tempoDeEntrega= 45;
        } else if(zona.compareToIgnoreCase("ZO")==1){
            this.tempoDeEntrega= 60;
        } else {
            this.tempoDeEntrega= 120;
        }
    }
    public double getTempoDeEntrega() {
        return tempoDeEntrega;
    }
    public void setTempoDeEntrega(double tempoDeEntrega) {
        this.tempoDeEntrega = tempoDeEntrega;
    }
}

