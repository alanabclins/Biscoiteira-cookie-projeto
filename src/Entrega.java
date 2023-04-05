public class Entrega {
    protected String endereco;
    protected String zona;
    protected double frete;
    public Entrega(String endereco, String zona) {
        this.endereco = endereco;
        this.zona = zona;
        this.frete = calcularfrete();
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
    public  double calcularfrete(){
        if(zona.compareToIgnoreCase("ZN")==1){
            return 5;
        } else if(zona.compareToIgnoreCase("centro")==1){
            return 7;
        } else if(zona.compareToIgnoreCase("ZO")==1){
            return 10;
        } else {
            return 15;
        }
    }
}
