package vehicle;
import java.util.List;

public class Display {
    public static void printVehicleInfo(List<Vehicle> vehicle) {
        for (Vehicle e: vehicle) {
            System.out.println("Name: " + e.getBrandName());
            System.out.println("Number of Airbags: " + e.getNumberOfAirbags() );
            System.out.println("Seating capacity: " + e.getSeatingCapacity());

            System.out.println("==========================");

        }

    }
}
