package kata6.business;

import java.util.HashMap;
import java.util.Map;
import kata6.factories.SerialNumberGenerator;
import kata6.toyproduct.Toy;
import kata6.factories.ToyFactory;

public class ToyBusiness {
    private final Map<String, ToyFactory> toyfactories = new HashMap<>();
    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();


    /*public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }*/
    public void add(String name, ToyFactory toyFactory){
        this.toyfactories.put(name, toyFactory);
    }
    
    public Toy produceToy(String type){
        return this.toyfactories.get(type).produceToy(this.serialNumberGenerator.next());
    }
}
