package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toys.Car;
import kata6.toys.Helicopter;
import kata6.toys.SerialNumberGenerator;

public class Kata6 {
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                
                if(line.equals("car")){
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built cars: "+ cars.stream()
                        .map(c -> c.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
                }
                else if(line.equals("helicopter")){
                    Helicopter helicopter = new Helicopter(generator.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Built helicopters: "+ helicopters.stream()
                        .map(h -> h.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
                }
                else{
                    System.out.println("command unknown!");
                }
                
            }
        }
    }
}
