package Cliente;
import java.util.List;
import java.util.Scanner;

public class Entrega  extends Cadastro{
    protected double frete;
    protected List<Cadastro> listaCadastros = Clientes.listaCadastros;
    Scanner s = new Scanner(System.in);
    
    public Entrega(String nome, String telefone, String instagram, String endereco, String zona, double frete) {
        super(nome, telefone, instagram, endereco, zona);
        this.frete = 0;
    }
    
    public double getFrete() {
        return frete;
    }
    
    public void setFrete(double frete) {
        this.frete = frete;
    }
    
    public double calcularFrete() {
        System.out.println("Deseja usar seu endereço cadastrado? 1- Sim; 2- Não, usar outro endereço.");
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
                        return 5;
                    } else if(cadastros.zona.equalsIgnoreCase("Centro")){
                        this.frete = 7;
                        return 7;
                    } else if(cadastros.zona.equalsIgnoreCase("Zona Oeste")){
                        this.frete = 10;
                        return 10;
                    } else {
                        this.frete = 15;
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
                return 5;
            }
            else if (zona.equalsIgnoreCase("Centro")) {
                this.frete = 7;
                return 7;
            }
            else if (zona.equalsIgnoreCase("Zona Oeste")) {
                this.frete = 10;
                return 10;
            } else {
                this.frete = 15;
                return 15;
            }
        }
        return 0;
    }
}