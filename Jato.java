import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jato extends Aeronave {
    private String cor;
    private int velocidade;

    public Jato(
        int id,
        String marca, 
        String modelo, 
        String cor,
        int velocidade
    )throws SQLException{
        super(id, marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (id, marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, cor);
        stmt.setInt(5, velocidade);
        stmt.execute();
        stmt.close();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    } 

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //LISTAR
    public static void listJato() throws SQLException{
        Connection conn = DAO.createConnection();
        ResultSet rs = conn.createStatement().executeQuery(
            "SELECT * FROM jato;"
        );
        while(rs.next()){
            System.out.println(
                "id: " + rs.getInt("id") + 
                "\nmarca: " + rs.getString("marca") + 
                "\nmodelo: " + rs.getString("modelo") + 
                "\ncor: " + rs.getString("cor") + 
                "\nvelocidade: " + rs.getInt("velocidade")
            );
        }
    }

    //UPDATE
    public static void updateJato(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE jato SET cor = ?, velocidade = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, 100);
        stmt.setInt(3, id);
        stmt.execute(); 
        stmt.close();
    }

    //DELETE
    public static void deleteJato(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM jato WHERE id = ?;"
        );
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }


    @Override
    public String toString() {
        return "Jato:" + "/ncor=" + cor + ", /nvelocidade=" + velocidade;
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Jato)){
            return false;
        }
        final Jato other = (Jato) object;

        return this.getId() == other.getId();

    }

    
}
