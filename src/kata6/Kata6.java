package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.CarToy;
import kata6.toyproduct.models.HelicopterToy;
import kata6.toys.SerialNumberGenerator;
import kata6.toys.ToyBusiness;

public class Kata6 {
    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                
                switch(line) {
                    case "car":
                    case "helicopter":
                        toys.add(business.createToy(line));
                        System.out.println("Built toys: "+ toys.stream()
                                .map(h -> h.toString())
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
