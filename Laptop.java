import java.util.Map;
import java.util.Objects;

public class Laptop {
    private String name;
    private double price;
    private int RAM;
    private Map<Integer, String> promotion;

    public Laptop(String name, double price, int RAM, Map<Integer, String>  CPU ){
        this.name = name;
        this.price = price;
        this.RAM = RAM;
        this.promotion = promotion;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    public int getRAM(){
        return RAM;
    }

    public Map<Integer, String>  getPromotion(){
        return promotion;
    }

    public Map<Integer, String>  setPromotion(int num, String promote){
        promotion.put(num, promote);
        return promotion;
    }

    @Override
    public String toString() {
        
        return "Laptop's name: " + name + " Laptop's price: " + price + " Laptop's RAM: " + RAM + " Laptop's promotion: " + promotion; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop)obj;
        return price == laptop.price && Objects.equals(name, laptop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
} 