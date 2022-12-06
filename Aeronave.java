public abstract class Aeronave {
    private int id;
    private String marca;
    private String modelo;

    public Aeronave( int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Aeronave{" + "modelo=" + modelo + '}';
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Aeronave)){
            return false;
        }
        final Aeronave other = (Aeronave) object;

        return this.getId() == other.getId();

    }

}