public class Jato extends Aeronave {
    private String cor;
    private int velocidade;

    public Jato(
        int id,
        String marca, 
        String modelo, 
        String cor,
        int velocidade
    ){
        super(id, marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    } 

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Jato:" + "/ncor=" + cor + ", /nvelocidade=" + velocidade;
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Jato)){
            return false;
        }
        final Jato other = (Jato) object;

        return this.getId() == other.getId();

    }

    
}
