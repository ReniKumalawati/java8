package Stream.Query;

import Stream.Model.Anggota;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoQuery {
    public List<Anggota> runQ(Connection conn, String Query) throws SQLException {
        Statement stmt = null;
        List<Anggota> ls = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                String name = rs.getString("name");
                Anggota em = new Anggota();
                em.setName(name);
                ls.add(em);
            }
            return ls;
        } catch (SQLException e ) {
            e.printStackTrace();
            return ls;
        } finally {
            if (stmt != null) { stmt.close(); }
            return ls;
        }
    }
}
