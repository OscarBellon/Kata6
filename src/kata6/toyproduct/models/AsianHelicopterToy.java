package kata6.toyproduct.models;

import kata6.componentfactories.ComponentFactory;
import kata6.componentfactories.regionalcomponentsfactories.AsianComponentFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.components.Engine;
import kata6.toyproduct.components.RotorBlade;

public class AsianHelicopterToy implements Toy{
    final private Integer serialNumber;
    final private String type = "Helicopter";
    final ComponentFactory factory;
    private Engine engine;
    private RotorBlade rotorBlade;
    
    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();
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
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.rotorBlade = this.factory.createRotorBlade();
    }
    
    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
