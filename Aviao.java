import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aviao extends Aeronave {
    private String prefixo;
    private int capacidade;
    private int id_companhia;
    private Companhia companhia;

    public Aviao (
        int id,
        String marca, 
        String modelo, 
        String prefixo,
        int capacidade,
        int id_companhia,
        Companhia companhia
    )throws SQLException{
        super(id, marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.id_companhia = id_companhia;
        this.companhia = Companhia.getByInt(id_companhia);

        PreparedStatement stmt = DAO.createConnection().prepareStatement("INSERT INTO aviao (id, marca, modelo, prefixo, capacidade, id_companhia) VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, prefixo);
        stmt.setInt(5, capacidade);
        stmt.setInt(6, id_companhia);
        stmt.execute();
        stmt.close();
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

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
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
    
    