package kata6.toyproduct.models;

import kata6.toyproduct.Toy;

public class AsianCarToy implements Toy {
    final private Integer serialNumber;
    final private String type = "Car";

    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling car '%d'\n", this.serialNumber);
    }

    @Override
    public String toString() {
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
}
