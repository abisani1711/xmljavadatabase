package xml;

import vehicle.Vehicle;
import java.sql.*;
import java.util.*;

public class DatabaseManager {
    public static final String username = "root";
    public static final String password = "";
    public static final String url = "jdbc:mysql://localhost:3306/?user=root";

    public static void insertingInDatabase(List<Vehicle> vehicleList1) {
        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);
            Statement statement = con.createStatement();
            for (Vehicle veh : vehicleList1) {
                statement.execute("INSERT INTO `vehicle`.`car` ( `brandName`, `seatingCapacity`, `numberOfAirbags`) VALUES ( '" + veh.getBrandName() + "', '" + veh.getSeatingCapacity() + "', '" + veh.getNumberOfAirbags() +
                        "'+);");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Vehicle> fetchingFromDatabase() throws SQLException{
        Connection con  = DriverManager.getConnection(
                url, username, password);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM vehicle.car;");
        List<Vehicle> vehicle = new ArrayList<>();

        while(rs.next()) {
            Vehicle e = new Vehicle();
            // e.setVehicleId(rs.getInt(1));
            e.setBrandName(rs.getString(1));
            e.setSeatingCapacity(rs.getInt(2));
            e.setNumberOfAirbags(rs.getInt(3));
           

            vehicle.add(e);
        }
        return vehicle;
    }
}
