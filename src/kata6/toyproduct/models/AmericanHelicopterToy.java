package kata6.toyproduct.models;

import kata6.toyproduct.Toy;

public class AmericanHelicopterToy implements Toy{
    final private Integer serialNumber;
    final private String type = "Helicopter";

    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing helicopter '%d'\n", this.serialNumber);
    }
    @Override
    public void label(){
        System.out.printf("packing helicopter '%d'\n", this.serialNumber);
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
