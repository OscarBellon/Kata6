package kata6.toyproduct.models;

import kata6.componentfactories.ComponentFactory;
import kata6.componentfactories.regionalcomponentsfactories.AmericanComponentFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.components.Engine;
import kata6.toyproduct.components.Wheel;

public class AmericanCarToy implements Toy {
    final private Integer serialNumber;
    final private String type = "Car";
    final ComponentFactory factory;
    private Engine engine;
    final private Wheel[] wheels = new Wheel[4];

    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
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
        System.out.printf("packing car '%d'\n", this.serialNumber);
    }

    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        for (int i = 0; i < wheels.length; i++) {
            this.wheels[i] = this.factory.createWheel();
        }
    }

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }
}
