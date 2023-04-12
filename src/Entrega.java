public class Entrega  extends Clientes{
    protected String zona;
    protected double frete;
    protected double tempoDeEntrega;
    public Entrega(String nome, double telefone, String instagram, String endereco, String zona,double frete) {
        super(nome, telefone, instagram, endereco);
        this.zona = zona;
        this.tempoDeEntrega= calcularTempo();
        this.frete = calcularFrete();
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
    public  double calcularFrete(){
        if(zona.compareToIgnoreCase("ZN")==1){
            this.frete=5;
            return 5;
        } else if(zona.compareToIgnoreCase("centro")==1){
            this.frete=7;
            return 7;
        } else if(zona.compareToIgnoreCase("ZO")==1){
            this.frete=10;
            return 10;
        } else {
            this.frete=15;
            return 15;
        }
    }
    public  double calcularTempo(){
        if(zona.compareToIgnoreCase("ZN")==1){
            return 30;
        } else if(zona.compareToIgnoreCase("centro")==1){
            return 45;
        } else if(zona.compareToIgnoreCase("ZO")==1){
            return 60;
        } else {
            return 120;
        }
    }
    public double getTempoDeEntrega() {
        return tempoDeEntrega;
    }
    public void setTempoDeEntrega(double tempoDeEntrega) {
        this.tempoDeEntrega = tempoDeEntrega;
    }
}

