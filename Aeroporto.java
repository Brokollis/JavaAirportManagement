public class Aeroporto {
    private String nome;
    private String cidade;
    private String pais;
    private List<Aeronave> aeronaves;

    public Aeroporto(String nome, String cidade, String pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.aeronaves = new ArrayList<>();
    }

    public void addAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public void removeAeronave(Aeronave aeronave) {
        aeronaves.remove(aeronave);
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    @Override
    public String toString() {
        return "Aeroporto{" + "nome=" + nome + ", cidade=" + cidade + ", pais=" + pais + ", aeronaves=" + aeronaves + '}';
    }
}
