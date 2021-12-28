package kata6.toyproduct.models;

import kata6.componentfactories.ComponentFactory;
import kata6.componentfactories.regionalcomponentsfactories.AmericanComponentFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.components.Engine;

public class AmericanSubmarineToy implements Toy{
    final private Integer serialNumber;
    final private String type = "Submarine";
    final ComponentFactory factory;
    private Engine engine;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
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
    public void prepare() {
        this.engine = this.factory.createEngine();
    }
    
    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
