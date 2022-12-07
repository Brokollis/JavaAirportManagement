public class Helicoptero extends Aeronave {
    private String cor;
    private int capacidade;

    public Helicoptero(
        int id,
        String marca, 
        String modelo, 
        String cor,
        int capacidade
    ){
        super(id, marca, modelo);
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

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Helicoptero)){
            return false;
        }
        final Helicoptero other = (Helicoptero) object;

        return this.getId() == other.getId();

    }

}
    

