package vehicle;

import javax.xml.bind.annotation.XmlRootElement;

import jakarta.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Vehicle {

    private String brandName;
    private int seatingCapacity;
    private int numberOfAirbags;

    public Vehicle() {
        System.out.println("Default Constructor");
       
    }
  
    @XmlElement
    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    @XmlElement
    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    @XmlElement
    public int getNumberOfAirbags() {
        return this.numberOfAirbags;
    }

    public void setNumberOfAirbags(int numberOfAirbags) {
        this.numberOfAirbags = numberOfAirbags;
    }
}
