package Stream;

import Stream.Model.Anggota;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Stream.Api.Anggota anggota = new Stream.Api.Anggota();
        try {
            System.out.println("Intermediate Operation");
            List<Anggota> mdlAnggota =  anggota.getAnggota();
           // intermedite operation
            List<String> mdlAnggota1 = mdlAnggota.stream().filter((angg) -> angg.getName().contains("a"))
                    .limit(2)
                    .map(s -> s.getName())
                    .collect(Collectors.toList());
            mdlAnggota1.forEach(e -> System.out.println("Namanya " + e));

            System.out.println("==============================================================");
            System.out.println("Terminal Operation");
            // terminal  operation
            mdlAnggota.stream().forEach(anggg -> System.out.println("namanya2 " + anggg.getName()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
