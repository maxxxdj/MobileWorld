import java.util.LinkedHashMap;
import java.util.Map;

public class Nokia extends Phone{

    Prints print = new Prints();

    public Map<String, Map<String, String>> getNokiaModels() {
        Map<String, Map<String, String>> models = new LinkedHashMap<>();
        models.put("Nokia 3310", getFeatures3310());
        models.put("Nokia 7990", getFeatures7990());
        return models;
    }
    void printNokiaModels() {
        for (String s : getNokiaModels().keySet()) {
            System.out.printf("%s %n", print.upFirstLetter(s));
        }
    }

    public Map<String, String> getFeatures3310() {
        Map<String, String> nokia3310 = new LinkedHashMap<>();
        nokia3310.put("Camera", "N/A");
        nokia3310.put("SMS", "Yes");
        nokia3310.put("Voice Dial / Voice Mail", "Yes");
        nokia3310.put("Battery", "900 mAh");
        return nokia3310;
    }
    void printNokia3310Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeatures3310().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }
    public Map<String, String> getFeatures7990() {
        Map<String, String> nokia7990 = new LinkedHashMap<>();
        nokia7990.put("Camera", "0.3 Megamixels");
        nokia7990.put("SMS", "Yes");
        nokia7990.put("Voice Dial / Voice Mail", "Yes");
        nokia7990.put("Battery", "1200 mAh");
        return nokia7990;
    }
    void printNokia7990Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeatures7990().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

    //Warehouse

    private int nokia3310quantity = 3;
    private int nokia7990quantity = 10;

    public int getNokia3310quantity() {
        return nokia3310quantity;
    }

    public void setNokia3310quantity(int nokia3310quantity) {
        this.nokia3310quantity = nokia3310quantity;
    }

    public int getNokia7990quantity() {
        return nokia7990quantity;
    }

    public void setNokia7990quantity(int nokia7990quantity) {
        this.nokia7990quantity = nokia7990quantity;
    }
}
