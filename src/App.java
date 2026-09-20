import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "5588"      
        );

        // PreparedStatement pds=con.prepareStatement(
        //     "insert into student value(?,?,?)"
        // );
        System.out.print(con);
        System.out.println("Connection created");
        con.close();

    }
}
