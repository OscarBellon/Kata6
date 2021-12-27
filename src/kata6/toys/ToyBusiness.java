package kata6.toys;

public class ToyBusiness {
   private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
   
     public Car createCar(){
       Car car = new Car(this.serialNumberGenerator.next());
       car.pack();
       car.label();
       return car;
    }
   
    public Helicopter createHelicopter(){
       Helicopter helicopter = new Helicopter(this.serialNumberGenerator.next());
       helicopter.pack();
       helicopter.label();
       return helicopter;
    }
}
