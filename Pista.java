public class Pista {
    private int id;
    private String numero;

    public Pista(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // numero

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pista{" + "numero=" + numero + '}';
    }

    
    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Pista)){
            return false;
        }
        final Pista other = (Pista) object;

        return this.getId() == other.getId();

    }

    

    
}
