import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hangar {
    private int id;
    private String local;
    private int idAviao;
    Aviao aviao;

    public Hangar(
        int id, 
        String local, 
        int idAviao, 
        Aviao aviao
    )throws SQLException{
        this.id = id;
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = Aviao.getById(id);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO hangar (id, local, idAviao) VALUES (?, ?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setString(2, local);
        stmt.setInt(3, idAviao);
        stmt.execute();
        stmt.close();
    }

    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    };

    // local
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // idAviao
    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    // Aviao
    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }



    // LISTAR
    public static void listHangar() throws SQLException{
        Connection conn = DAO.createConnection();
        ResultSet rs = conn.createStatement().executeQuery(
            "SELECT * FROM hangar;"
        );
        while(rs.next()){
            System.out.println(
                "id: " + rs.getInt("id") + 
                "\nlocal: " + rs.getString("local") + 
                "\nidAviao: " + rs.getInt("idAviao")
            );
        }
    }

    // UPGRADE
    public static void updateHangar(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE hangar SET local = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, id);
        stmt.execute(); 
        stmt.close();
    }

// DELETAR
    public void deleteHangar() throws SQLException {
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM hangar WHERE id = ?"
        );
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    @Override
    public String toString() {
        return "Hangar{" + "local=" + local + ", idAviao=" + idAviao + ", aviao=" + aviao + '}';
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Hangar)){
            return false;
        }
        final Hangar other = (Hangar) object;

        return this.getId() == other.getId();

    }
}
