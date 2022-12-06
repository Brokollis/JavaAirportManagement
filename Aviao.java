public class Aviao extends Aeronave {
    private String prefixo;
    private int capacidade;
    private int id_companhia;

    public Aviao(
        int id,
        String marca, 
        String modelo, 
        String prefixo,
        int capacidade,
        int id_companhia
    ){
        super(id, marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.id_companhia = id_companhia;
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

    public int getId_companhia() {
        return id_companhia;
    }

    public void setId_companhia(int id_companhia) {
        this.id_companhia = id_companhia;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
            "Aviao: " + "\nprefixo= " + prefixo + ", \ncapacidade= " + capacidade + "\nid_companhia= " + id_companhia;
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Aviao)){
            return false;
        }
        final Aviao other = (Aviao) object;

        return this.getId() == other.getId();
    }
}
    
    