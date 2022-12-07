public class Companhia{

    private int id;
    private String nome;
    private String cnpj;

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // cnpj
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Companhia{" + "nome=" + nome + ", cnpj=" + cnpj + '}';
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Companhia)){
            return false;
        }
        final Companhia other = (Companhia) object;

        return this.getId() == other.getId();

    }

    public static Companhia getByInt(int id) {
        return new Companhia();
    }
} 