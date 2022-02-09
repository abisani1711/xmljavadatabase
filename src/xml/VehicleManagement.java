package xml;
import vehicle.Display;
import vehicle.Vehicle;
import java.util.List;
import java.sql.SQLException;
// import java.sql.*;

public class VehicleManagement {
    public static void main(String[] args) throws SQLException {


        String path = "C:\\Users\\aayus\\OneDrive\\Desktop\\xmljavadb\\src\\xml\\vehicle.xml";

        List<Vehicle> vehicle = VehicleXmlParser.parsing(path);
        DatabaseManager.insertingInDatabase(vehicle);
       List<Vehicle> vehicleList = DatabaseManager.fetchingFromDatabase();

        Display.printVehicleInfo(vehicleList);
    }
}
