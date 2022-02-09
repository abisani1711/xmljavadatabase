package xml;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import vehicle.Vehicle;
@XmlRootElement

public class Vehicles {
    private List<Vehicle> vehiclesList;

    public List<Vehicle> getVehicle() {
        return vehiclesList;
    }

    public void setVehicle(List<Vehicle> vehicles) {
        this.vehiclesList = vehicles;
    }
}
