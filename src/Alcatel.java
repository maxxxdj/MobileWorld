import java.util.LinkedHashMap;
import java.util.Map;

public class Alcatel extends Phone{
    Prints print = new Prints();


    public Map<String, Map<String, String>> getAlcatelModels() {
        Map<String, Map<String, String>> models = new LinkedHashMap<>();
        models.put("Alcatel A204", getFeaturesA204());
        models.put("Alcatel A101", getfeaturesA101());
        return models;
    }
    void printAlcatelModels() {
        for (String s : getAlcatelModels().keySet()) {
            System.out.printf("%s %n", print.upFirstLetter(s));
        }
    }

    public Map<String, String> getFeaturesA204() {
        Map<String, String> alcatel204 = new LinkedHashMap<>();
        alcatel204.put("Camera", "N/A");
        alcatel204.put("SMS", "Yes");
        alcatel204.put("Voice Dial / Voice Mail", "Yes");
        alcatel204.put("Battery", "900 mAh");
        return alcatel204;
    }
    void printAlcatelA204Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getFeaturesA204().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }
    public Map<String, String> getfeaturesA101() {
        Map<String, String> alcatel101 = new LinkedHashMap<>();
        alcatel101.put("Camera", "0.3 Megapixels");
        alcatel101.put("SMS", "Yes");
        alcatel101.put("Voice Dial / Voice Mail", "Yes");
        alcatel101.put("Battery", "1200 mAh");
        return alcatel101;
    }
    void printAlcatelA101Specs() {
        System.out.println("These are the specifications for your phone:");
        for (Map.Entry<String, String> e : getfeaturesA101().entrySet()) {
            System.out.println(e.toString().replace("=", " - "));
        }
        print.separator();
    }

    //WAREHOUSE

    private int alcatelA204quantity = 3;
    private int alcatelA101quantity = 10;

    public int getAlcatelA204quantity() {
        return alcatelA204quantity;
    }

    public void setAlcatelA204quantity(int alcatelA204quantity) {
        this.alcatelA204quantity = alcatelA204quantity;
    }

    public int getAlcatelA101quantity() {
        return alcatelA101quantity;
    }

    public void setAlcatelA101quantity(int alcatelA101quantity) {
        this.alcatelA101quantity = alcatelA101quantity;
    }


}
