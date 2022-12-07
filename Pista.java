import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.Result;

public class Pista {
    private int id;
    private String numero;

    public Pista(int id, String numero) throws SQLException {
        this.id = id;
        this.numero = numero;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (id, numero) VALUES (?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numero);
        stmt.execute(); 
        stmt.close();
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


    public static void listPista() throws SQLException{
        Connection conn = DAO.createConnection();
        ResultSet rs = conn.createStatement().executeQuery(
            "SELECT * FROM pista;"
        );
        while(rs.next()){
            System.out.println(
                "id: " + rs.getInt("id") + ", numero: " + rs.getString("numero")
            );
        }
    }

    public static void updatePista(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE pista SET numero = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, id);
        stmt.execute(); 
        stmt.close();
    }

    public static void deletePista(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM pista WHERE id = ?;"
        );
        stmt.setInt(1, id);
        stmt.execute(); 
        stmt.close();
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
