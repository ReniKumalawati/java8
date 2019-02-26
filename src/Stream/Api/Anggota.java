package Stream.Api;

import Stream.Connection.Conn;
import Stream.Query.DoQuery;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Anggota {
    public List<Stream.Model.Anggota> getAnggota () throws SQLException {
        Conn con = new Conn();
        Connection cn =  con.connect();
        String query = "Select * from anggota";
        DoQuery q = new DoQuery();
        List<Stream.Model.Anggota> rs = q.runQ(cn, query);
        return rs;
    }
}
