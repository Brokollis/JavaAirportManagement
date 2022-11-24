public class Aviao extends Aeronave {
    private String prefixo;
    private int capacidade;
    

    public Aviao(
        String marca, 
        String modelo, 
        String compania,
        String prefixo,
        int capacidade
    ){
        super(marca, modelo, compania);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Aviao{" + "prefixo=" + prefixo + ", capacidade=" + capacidade + '}';
    }
}
