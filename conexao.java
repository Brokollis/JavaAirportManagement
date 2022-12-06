import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection connection = DAO.createConnection();
            Aviao aviao = new Aviao(
                1,
                "Boeing",
                "737",
                "PR-AXX",
                200,
                1
            );

            // PreparedStatement stmt = conexao.prepareStatement(
            //     "INSERT INTO aviao (id, marca, modelo, companhia, prefixo, assentos, id_piloto) VALUES (?, ?, ?, ?, ?, ?, ?)"
            // );
        
            // stmt.setInt(1, aviao.getId());
            // stmt.setString(2, aviao.getMarca());
            // stmt.setString(3, aviao.getModelo());
            // stmt.setString(5, aviao.getPrefixo());
            // stmt.setInt(6, aviao.getCapacidade());
            // stmt.setInt(7, aviao.getId_companhia());

            // stmt.execute();

            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM aviao;");
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("marca"));
                System.out.println(rs.getString("modelo"));
                System.out.println(rs.getString("prefixo"));
                System.out.println(rs.getInt("capacidade"));
                System.out.println(rs.getInt("id_companhia"));
            }

            
        }catch (Exception e) {
            System.out.println(e);
        }



    }

    

    private static PreparedStatement prepareStatement(String string) {
        return null;
    }
            

    
}


    

