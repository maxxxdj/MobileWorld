import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Samsung extends Phone {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Prints print = new Prints();

    public Map<String, Map<String, String>> getSamsungModels() {
        Map<String, java.util.Map<String, String>> models = new LinkedHashMap<>();
        models.put("Samsung Galaxy S20", getFeaturesGalaxyS20());
        models.put("Samsung Note 10", getFeaturesSamsungNote10());
        models.put("Samsung A80", getFeaturesSamsungA80());
        return models;
    }
    void printSamsungModels() {
        for (String s : getSamsungModels().keySet()) {
            System.out.printf("%s %n", print.upFirstLetter(s));
        }
    }

    public List<String> getColorOptions() {
        List<String> colors = new ArrayList<>();
        colors.add("Crown Silver");
        colors.add("Ceramic White");
        colors.add("Majestic Black");
        colors.add("Royal Gold");
        return colors;
    }
    void printSamsungColors() {
        for (String s : getColorOptions()) {
            System.out.printf("%s %n", s);

        }
    }

    public List<Integer> getCapacityOptions() {
        List<Integer> capacity = new ArrayList<>();
        capacity.add(64);
        capacity.add(128);
        return capacity;
    }
    void printSamsungCapacityOptions() {
        for (int n : getCapacityOptions()) {
            System.out.printf("%d %n", n);
        }
    }

    // Samsung Galaxy S20
    public Map<String, String> getFeaturesGalaxyS20() {
        Map<String, String> galaxyS20 = new LinkedHashMap<>();
        galaxyS20.put("Camera", "12 Megapixels f/1.8");
        galaxyS20.put("Processor", "Octa-core 2x2.73 GHz");
        galaxyS20.put("Size", "5.87 x 2.81 x 0.30 inches");
        galaxyS20.put("Battery", "3650 mAh");
        return galaxyS20;
    }

    void printSamsungGalaxyS20Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesGalaxyS20().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

    public Map<String, String> getFeaturesSamsungNote10() {
        Map<String, String> samsungNote10 = new LinkedHashMap<>();
        samsungNote10.put("Camera", "12 Megapixels f/1.9");
        samsungNote10.put("Processor", "Octa-core 2x2.33 GHz");
        samsungNote10.put("Size", "5.97 x 2.74 x 0.31 inches");
        samsungNote10.put("Battery", "3100 mAh");
        return samsungNote10;
    }

    void printSamsungNote10Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesSamsungNote10().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

    public Map<String, String> getFeaturesSamsungA80() {
        Map<String, String> a80Features = new LinkedHashMap<>();
        a80Features.put("Camera", "12 Megapixels f/1.2");
        a80Features.put("Processor", "Octa-core 1.86 GHz");
        a80Features.put("Size", "4.39 x 1.95 x 0.34 inches");
        a80Features.put("Battery", "2500 mAh");
        return a80Features;
    }

    void printSamsungA80Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesSamsungA80().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

// Warehouse

    private int samsungA80quantity = 67;
    private int samsungNote10quantity = 205;
    private int samsungGalaxyS20quantity = 322;


    public int getSamsungA80quantity() {
        return samsungA80quantity;
    }

    public void setSamsungA80quantity(int samsungA80quantity) {
        this.samsungA80quantity = samsungA80quantity;
    }

    public int getSamsungNote10quantity() {
        return samsungNote10quantity;
    }

    public void setSamsungNote10quantity(int samsungNote10quantity) {
        this.samsungNote10quantity = samsungNote10quantity;
    }

    public int getSamsungGalaxyS20quantity() {
        return samsungGalaxyS20quantity;
    }

    public void setSamsungGalaxyS20quantity(int samsungGalaxyS20quantity) {
        this.samsungGalaxyS20quantity = samsungGalaxyS20quantity;
    }

}

