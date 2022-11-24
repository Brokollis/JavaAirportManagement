public class Helicoptero extends Aeronave {
    private String cor;
    private int capacidade;

    public Helicoptero(
        String marca, 
        String modelo, 
        String compania,
        String cor,
        int capacidade
    ){
        super(marca, modelo, compania);
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "cor=" + cor + ", capacidade=" + capacidade + '}';
    }

}
    

