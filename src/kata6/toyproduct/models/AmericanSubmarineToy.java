package kata6.toyproduct.models;

import kata6.toyproduct.Toy;

public class AmericanSubmarineToy implements Toy{
    final private Integer serialNumber;
    final private String type = "Submarine";

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing submarine '%d'\n", this.serialNumber);
    }
    @Override
    public void label(){
        System.out.printf("packing submarine '%d'\n", this.serialNumber);
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
