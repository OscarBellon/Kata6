package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toys.Car;
import kata6.toys.Helicopter;
import kata6.toys.SerialNumberGenerator;
import kata6.toys.ToyBusiness;

public class Kata6 {
    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                
                switch(line) {
                    case "car":
                        cars.add(business.createCar());
                        System.out.println("Built cars: "+ cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
                        break;
                    case "helicopter":
                        helicopters.add(business.createHelicopter());
                        System.out.println("Built helicopters: "+ helicopters.stream()
                                .map(h -> h.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
                        break;
                    default:
                        System.out.println("command unknown!");
                        break;
                }
            }
        }
    }
}
