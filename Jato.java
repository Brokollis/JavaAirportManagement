public class Jato extends Aeronave {
    private int velocidade;
    private String cor;

    public Jato(
        String marca, 
        String modelo, 
        String compania,
        int velocidade,
        String cor
    ){
        super(marca, modelo, compania);
        this.velocidade = velocidade;
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Jato{" + "velocidade=" + velocidade + ", cor=" + cor + '}';
    }
        
}
