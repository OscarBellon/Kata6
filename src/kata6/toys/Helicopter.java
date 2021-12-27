package kata6.toys;

public class Helicopter {
    final private Integer serialNumber;
    final private String type = "Helicopter";

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public void pack(){
        System.out.printf("Packing helicopter '%d'\n", this.serialNumber);
    }
    
    public void label(){
        System.out.printf("packing helicopter '%d'\n", this.serialNumber);
    }
}
