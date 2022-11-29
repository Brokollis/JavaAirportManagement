public class Aviao extends Aeronave {
    private String prefixo;
    private int capacidade;
    

    public Aviao(
        String marca, 
        String modelo, 
        String compania,
        String prefixo,
        int capacidade
    )throws Exception{
        super(marca, modelo, compania);
        this.prefixo = prefixo;
        this.capacidade = capacidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO usuario (user_name, name, password) VALUES (?, ?, ?);"
        );
        stmt.setString(1, this.getPrefixo());
        stmt.setString(2, this.getCapacidade());
        stmt.execute();
        DAO.closeConnection();
    }
    public Aviao(
        String marca, 
        String modelo, 
        String compania,
        String prefixo,
        int capacidade
    )throws Exception{
        this.prefixo = prefixo;
        this.capacidade = capacidade;
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

    @Override
    public String toString() {
        return "Aviao{" + "prefixo=" + prefixo + ", capacidade=" + capacidade + '}';
    }
    
    // @Override
    // public boolean equals(Object object) {
    //     if (object == null || !(object instanceof Usuario)) {
    //         return false;
    //     }
    //     final Usuario other = (Usuario) object;

    //     return this.id == other.id;
    // }
}
