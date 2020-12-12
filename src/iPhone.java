import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class iPhone extends Phone {
    private final String system = "iOS";
    private final String countryOfMade = "USA";

    private String systemVersion;
    private int year;

    Prints print = new Prints();

    //Available models
    public Map<String, Map<String, String>> getIphoneModels() {
        Map<String, Map<String, String>> models = new LinkedHashMap<>();
        models.put("Iphone Se", getFeaturesSE());
        models.put("Iphone 7", getFeatures7());
        models.put("Iphone 8", getFeatures8());
        models.put("Iphone 11", getFeatures11());
        models.put("Iphone 12", getFeatures12());
        return models;
    }
    void printIphoneModels() {
        for (String s : getIphoneModels().keySet()) {
            System.out.printf("%s %n", print.upFirstLetter(s));
        }
    }
    //Available colors
    public List<String> getColorOptions() {
        List <String> colors= new ArrayList<>();
        colors.add("Product Red");
        colors.add("Navy Blue");
        colors.add("Space Grey");
        colors.add("Black");
        return colors;
    }
    void printIphoneColors() {
        for (String s : getColorOptions()) {
            System.out.printf("%s %n", s);
        }
    }
    //Available storage
    public List<Integer> getCapacityOptions() {
        List <Integer> capacity= new ArrayList<>();
        capacity.add(64);
        capacity.add(128);
        capacity.add(256);
        capacity.add(512);
        return capacity;
    }
    void printIphoneCapacityOptions() {
        for (int n : getCapacityOptions()) {
            System.out.printf("%d %n", n);
        }
    }
    //Iphone SE
    public Map<String, String> getFeaturesSE() {
        Map<String, String> featuresSE = new LinkedHashMap<>();
        featuresSE.put("Camera", "12 Megapixels f/2.2");
        featuresSE.put("Processor", "A9 Bionic");
        featuresSE.put("Size", "4.87 x 2.31 x 0.30 in");
        featuresSE.put("Battery", "1624 mAh");
        return featuresSE;
    }
    void printSESpecs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesSE().entrySet()) {
            System.out.printf("%s - %s%n", e.getKey(), e.getValue());
        }
        print.separator();
    }
    //Iphone 7
    public Map<String, String> getFeatures7() {
        Map<String, String> features7 = new LinkedHashMap<>();
        features7.put("Camera", "12 Megapixels f/1.8");
        features7.put("Processor", "A10 Bionic");
        features7.put("Size", "5.44 x 2.64 x 0.28 in");
        features7.put("Battery", "1624 mAh");
        return features7;
    }
    void print7Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeatures7().entrySet()) {
            System.out.printf("%s - %s%n", e.getKey(), e.getValue());
        }
        print.separator();
    }

    //Iphone 8
    public Map<String, String> getFeatures8() {
        Map<String, String> features8 = new LinkedHashMap<>();
        features8.put("Camera", "12 Megapixels f/1.8");
        features8.put("Processor", "A11 Bionic");
        features8.put("Size", "5.45 x 2.64 x 0.28 in");
        features8.put("Battery", "1624 mAh");
        return features8;
    }
    void print8Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeatures8().entrySet()) {
            System.out.printf("%s - %s%n", e.getKey(), e.getValue());
        }
        print.separator();
    }
    //Iphone 11
    public Map<String, String> getFeatures11() {
        Map<String, String> features11 = new LinkedHashMap<>();
        features11.put("Camera", "12 Megapixels f/1.8");
        features11.put("Processor", "A13 Bionic");
        features11.put("Size", "6.10 x 2.90 x 0.34 in");
        features11.put("Battery", "3110 mAh");
        return features11;
    }

    void print11Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeatures11().entrySet()) {
            System.out.printf("%s - %s%n", e.getKey(), e.getValue());
        }
        print.separator();
    }
    //Iphone 12
    public Map<String, String> getFeatures12() {
        Map<String, String> features12 = new LinkedHashMap<>();
        features12.put("Camera", "12 Megapixels f/1.8");
        features12.put("Processor", "A14 Bionic");
        features12.put("Size", "5.78 x 2.81 x 0.29 in");
        features12.put("Battery", "2815 mAh");
        return features12;
    }
    void print12Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeatures12().entrySet()) {
            System.out.printf("%s - %s%n", e.getKey(), e.getValue());
        }
        print.separator();
    }



    public String getSystemVersion() {
        return systemVersion;
    }
    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    //Warehouse

    private int iphoneSEquantity = 70;
    private int iphone7quantity = 10;
    private int iphone8quantity = 34;
    private int iphone11quantity = 300;
    private int iphone12quantity = 800;

    public int getIphoneSEquantity() {
        return iphoneSEquantity;
    }

    public void setIphoneSEquantity(int iphoneSEquantity) {
        this.iphoneSEquantity = iphoneSEquantity;
    }

    public int getIphone7quantity() {
        return iphone7quantity;
    }

    public void setIphone7quantity(int iphone7quantity) {
        this.iphone7quantity = iphone7quantity;
    }

    public int getIphone8quantity() {
        return iphone8quantity;
    }

    public void setIphone8quantity(int iphone8quantity) {
        this.iphone8quantity = iphone8quantity;
    }

    public int getIphone11quantity() {
        return iphone11quantity;
    }

    public void setIphone11quantity(int iphone11quantity) {
        this.iphone11quantity = iphone11quantity;
    }

    public int getIphone12quantity() {
        return iphone12quantity;
    }

    public void setIphone12quantity(int iphone12quantity) {
        this.iphone12quantity = iphone12quantity;
    }




}

