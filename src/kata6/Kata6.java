package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toyproduct.Toy;
import kata6.business.ToyBusiness;
import kata6.regionalFactories.AmericanSubmarineToyFactory;
import kata6.regionalFactories.AsianCarToyFactory;

public class Kata6 {
    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanSubmarineToyFactory());
        business.add("helicopter", new AsianCarToyFactory());
        business.add("submarine", new AmericanSubmarineToyFactory());
        ArrayList<Toy> toys = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                
                switch(line) {
                    case "car":
                    case "helicopter":
                    case "submarine":
                        toys.add(business.produceToy(line));
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
