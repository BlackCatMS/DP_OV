package P1;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:4444/ovchip?user=postgres&password=admin";
        Connection conn = DriverManager.getConnection(url);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM reiziger");
        System.out.println("All travellers:");
        while (rs.next()) {
            String output = "";
            output += rs.getString("voorletters") + " ";
            if (rs.getString("tussenvoegsel") != null) {
                output += rs.getString("tussenvoegsel") + " ";
            } else {
                output += "";
            }
            output += rs.getString("achternaam");

            System.out.println(output);
        }
        rs.close();
        st.close();


    }
}
