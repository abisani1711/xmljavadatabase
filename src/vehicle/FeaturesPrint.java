package vehicle;
// import xml.DatabaseManager;

public class FeaturesPrint {
    public static void printSalary(Vehicle vehicle) {
        System.out.println("Name "+vehicle.getBrandName());
        System.out.println("Number of Airbags:" + vehicle.getNumberOfAirbags());
        System.out.println("Seating capacity:" + vehicle.getSeatingCapacity());
    }
}
