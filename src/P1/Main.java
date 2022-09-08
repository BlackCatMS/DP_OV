package P1;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:4444/ovchip?user=postgres&password=admin";
        Connection conn = DriverManager.getConnection(url);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM reiziger");
        System.out.println("All travellers:\n");
        while (rs.next()) {
            System.out.println(rs.getString("voorletters") + " " + rs.getString("tussenvoegsel") + " " +  rs.getString("achternaam"));;
        }
        rs.close();
        st.close();


    }
}
