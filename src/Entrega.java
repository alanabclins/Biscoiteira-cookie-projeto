public class Entrega  extends Clientes{
    protected String zona;
    protected double frete;
    protected double tempoDeEntrega;
    
    public Entrega(String nome, double telefone, String instagram, String endereco, String zona,double frete) {
        //super(nome, telefone, instagram, endereco);
        this.zona = zona;
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
    public  double calcularFrete(){
        if(zona.compareToIgnoreCase("ZN")==1){
            this.frete=5;
            calcularTempo();
            return 5;
        } else if(zona.compareToIgnoreCase("centro")==1){
            this.frete=7;
            calcularTempo();
            return 7;
        } else if(zona.compareToIgnoreCase("ZO")==1){
            this.frete=10;
            calcularTempo();
            return 10;
        } else {
            this.frete=15;
            calcularTempo();
            return 15;
        }
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

