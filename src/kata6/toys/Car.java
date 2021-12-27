package kata6.toys;

public class Car {
    final private Integer serialNumber;
    final private String type = "Car";

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public void pack(){
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    public void label(){
        System.out.printf("packing car '%d'\n", this.serialNumber);
    }
}
