import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Huawei extends Phone {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Prints print = new Prints();

    //Huawei models
    public Map<String, Map<String, String>> getHuaweiModels() {
        Map<String, Map<String, String>> models = new LinkedHashMap<>();
        models.put("Huawei P30", getFeaturesP30());
        models.put("Huawei Mate 40", getFeaturesMate40());
        models.put("Huawei P40 Lite", getFeaturesP40Lite());
        return models;
    }

    void printHuaweiModels() {
        for (String s : getHuaweiModels().keySet()) {
            System.out.printf("%s %n", print.upFirstLetter(s));
        }
    }

    //Huawei colors
    public List<String> getColorOptions() {
        List<String> colors = new ArrayList<>();
        colors.add("Crush Green");
        colors.add("Space Silver");
        colors.add("Midnight Black");
        colors.add("Aurora");
        return colors;
    }

    void printHuaweiColors() {
        for (String s : getColorOptions()) {
            System.out.printf("%s %n", s);
        }
    }

    //Storage options
    public List<Integer> getCapacityOptions() {
        List<Integer> capacity = new ArrayList<>();
        capacity.add(64);
        capacity.add(128);
        capacity.add(256);
        return capacity;
    }

    void printHuaweiCapacityOptions() {
        for (int n : getCapacityOptions()) {
            System.out.printf("%d %n", n);
        }
    }

    //Huawei P30
    public Map<String, String> getFeaturesP30() {
        Map<String, String> featuresP30 = new LinkedHashMap<>();
        featuresP30.put("Camera", "40 Megapixels f/1.8");
        featuresP30.put("Processor", "Octa-core 2x2.6 GHz");
        featuresP30.put("Size", "5.87 x 2.81 x 0.30 inches");
        featuresP30.put("Battery", "3650 mAh");
        return featuresP30;
    }

    void printHuaweiP30Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesP30().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

    //Hauwei Mate 40
    public Map<String, String> getFeaturesMate40() {
        Map<String, String> mate40 = new LinkedHashMap<>();
        mate40.put("Camera", "50 Megapixels f/1.9");
        mate40.put("Processor", "Octa-core 3x13 GHz");
        mate40.put("Size", "6.50 x 2.94 x 0.30 inches");
        mate40.put("Battery", "4200 mAh");
        return mate40;
    }

    void printHuaweiMate40Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesMate40().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

    //Huawei P40Lite
    public Map<String, String> getFeaturesP40Lite() {
        Map<String, String> p40Lite = new LinkedHashMap<>();
        p40Lite.put("Camera", "64 Megapixels f/1.8");
        p40Lite.put("Processor", "Octa-core 2.36 GHz");
        p40Lite.put("Size", "6.39 x 2.95 x 0.34 inches");
        p40Lite.put("Battery", "4500 mAh");
        return p40Lite;
    }

    void printHuaweiP40LiteSpecs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesP40Lite().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }


//Warehouse

    private int huaweiP30quantity = 45;
    private int huaweiMate40quantity = 12;
    private int huaweip40quantity = 34;


    public int getHuaweiP30quantity() {
        return huaweiP30quantity;
    }

    public void setHuaweiP30quantity(int huaweiP30quantity) {
        this.huaweiP30quantity = huaweiP30quantity;
    }

    public int getHuaweiMate40quantity() {
        return huaweiMate40quantity;
    }

    public void setHuaweiMate40quantity(int huaweiMate40quantity) {
        this.huaweiMate40quantity = huaweiMate40quantity;
    }

    public int getHuaweip40quantity() {
        return huaweip40quantity;
    }

    public void setHuaweip40quantity(int huaweip40quantity) {
        this.huaweip40quantity = huaweip40quantity;
    }

}

