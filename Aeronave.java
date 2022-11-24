public abstract class Aeronave {
    private String marca;
    private String modelo;
    private String compania;

    public Aeronave(
            String marca,
            String modelo,
            String compania) {
        this.marca = marca;
        this.modelo = modelo;
        this.compania = compania;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Aeronave{" + "modelo=" + modelo + ", compania=" + compania + '}';
    }
}