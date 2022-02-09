package xml;

import vehicle.Vehicle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class VehicleXmlParser {
    public static List<Vehicle> parsing(String path){
        File file = new File(path);

        JAXBContext jaxbContext;
        try {

            jaxbContext = JAXBContext.newInstance(Vehicles.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Vehicles vehicles = (Vehicles)jaxbUnmarshaller.unmarshal(file);
            List<Vehicle> vehiclesList = vehicles.getVehicle();

            return vehiclesList;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
