import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Helicoptero extends Aeronave {
    private String cor;
    private int capacidade;

    public Helicoptero(
        int id,
        String marca, 
        String modelo, 
        String cor,
        int capacidade
    )throws SQLException{
        super(id, marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement("INSERT INTO helicoptero (id, marca, modelo, cor, capacidade) VALUES (?, ?, ?, ?, ?)");

        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, cor);
        stmt.setInt(5, capacidade);
        stmt.execute();
        stmt.close();
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

    public static Helicoptero getByInt(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement("SELECT * FROM helicoptero WHERE id = ?");
        stmt.setInt(1, id);
        stmt.execute();
        Helicoptero helicoptero = new Helicoptero(
            stmt.getResultSet().getInt("id"),
            stmt.getResultSet().getString("marca"),
            stmt.getResultSet().getString("modelo"),
            stmt.getResultSet().getString("cor"),
            stmt.getResultSet().getInt("capacidade")
        );
        stmt.close();
        return helicoptero;
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
    

