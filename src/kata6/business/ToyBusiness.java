package kata6.business;

import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanCarToy;
import kata6.toyproduct.models.AmericanHelicopterToy;
import kata6.toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
  
}
