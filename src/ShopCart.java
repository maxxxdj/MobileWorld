import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ShopCart {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Phone phone = new Phone();
    Prints print = new Prints();
    Huawei huawei = new Huawei();
    iPhone iphone = new iPhone();
    Samsung samsung = new Samsung();
    Nokia nokia = new Nokia();
    Alcatel alcatel = new Alcatel();


    public void cartFill() throws IOException {
        print.selectYourPhoneType();
        phone.setType(print.upFirstLetter(reader.readLine()));

        while (!(phone.getType().equals("Smartphone") || phone.getType().equals("Cellphone"))) {
            tryAgain();
        }

        if (phone.getType().equals("Smartphone")) {
            //TYPE
            print.selectYourOS();
            phone.setOSystem(print.upFirstLetter(reader.readLine()));
            while (!(phone.getOSystem().equals("Android") || (phone.getOSystem().equals("Ios")))) {
                tryAgain();
            }
            if (phone.getOSystem().equals("Android")) {


                //ANDROID
                print.selectManufacturer("Huawei or Samsung?");
                phone.setManufacturer(print.upFirstLetter(reader.readLine()));

                while (!(phone.getManufacturer().equals("Huawei") || (phone.getManufacturer().equals("Samsung")))) {
                    tryAgain();
                }
                if (phone.getManufacturer().equals("Huawei")) {
                    //HUAWEI
                    print.selectYourModel();
                    huawei.printHuaweiModels();
                    phone.setModel(print.upFirstLetter(reader.readLine()));
                    while (!huawei.getHuaweiModels().containsKey(phone.getModel())) {
                        tryAgain();
                    }
                    switch (phone.getModel()) {
                        case "Huawei P30":
                            huawei.printHuaweiP30Specs();
                            huaweiSteps(299, 399, 499);
                            huawei.setHuaweiP30quantity(huawei.getHuaweiP30quantity()-1);
                            break;
                        case "Huawei Mate 40":
                            huawei.printHuaweiMate40Specs();
                            huaweiSteps(249, 359, 429);
                            huawei.setHuaweiMate40quantity(huawei.getHuaweiMate40quantity()-1);

                            break;
                        case "Huawei P40 Lite":
                            huawei.printHuaweiP40LiteSpecs();
                            huaweiSteps(189, 239, 299);
                            huawei.setHuaweip40quantity(huawei.getHuaweip40quantity()-1);
                            break;
                    }


                } else if (phone.getManufacturer().equals("Samsung")) {
                    //SAMSUNG
                    print.selectYourModel();
                    samsung.printSamsungModels();
                    phone.setModel(print.upFirstLetter(reader.readLine()));
                    while (!samsung.getSamsungModels().containsKey(phone.getModel())) {
                        tryAgain();
                    }
                    switch (phone.getModel()) {
                        case "Samsung Galaxy S20":
                            samsung.printSamsungGalaxyS20Specs();
                            samsungSteps(499, 549);
                            samsung.setSamsungGalaxyS20quantity(samsung.getSamsungGalaxyS20quantity()-1);

                            break;
                        case "Samsung Note 10":
                            samsung.printSamsungNote10Specs();
                            samsungSteps(299, 349);
                            samsung.setSamsungNote10quantity(samsung.getSamsungNote10quantity()-1);

                            break;
                        case "Samsung A80":
                            samsung.printSamsungA80Specs();
                            samsungSteps(199, 249);
                            samsung.setSamsungA80quantity(samsung.getSamsungA80quantity()-1);
                            break;
                    }
                } else {
                    tryAgain();
                }

            } else if (phone.getOSystem().equals("Ios")) {
                //IOS
                print.selectManufacturer("Apple");
                phone.setManufacturer(print.upFirstLetter(reader.readLine()));
                while (!phone.getManufacturer().equals("Apple")) {
                    tryAgain();
                }
                if (phone.getManufacturer().equals("Apple")) {
                    //IPHONE
                    print.selectYourModel();
                    iphone.printIphoneModels();
                    phone.setModel(print.upFirstLetter(reader.readLine()));
                    while (!iphone.getIphoneModels().containsKey(phone.getModel())) {
                        tryAgain();
                    }
                    switch (phone.getModel()) {
                        case "Iphone Se":
                            iphone.printSESpecs();
                            iPhoneSteps(349, 499, 549, 599);
                            iphone.setIphoneSEquantity(iphone.getIphoneSEquantity()-1);
                            break;
                        case "Iphone 7":
                            iphone.print7Specs();
                            iPhoneSteps(399, 449, 499, 549);
                            iphone.setIphone7quantity(iphone.getIphone7quantity()-1);
                            break;
                        case "Iphone 8":
                            iphone.print8Specs();
                            iPhoneSteps(349, 499, 549, 599);
                            iphone.setIphone8quantity(iphone.getIphone8quantity()-1);
                            break;
                        case "Iphone 11":
                            iphone.print11Specs();
                            iPhoneSteps(499, 549, 649, 749);
                            iphone.setIphone11quantity(iphone.getIphone11quantity()-1);
                            break;
                        case "Iphone 12":
                            iphone.print12Specs();
                            iPhoneSteps(699, 799, 899, 999);
                            iphone.setIphone12quantity(iphone.getIphone12quantity()-1);
                            break;
                    }
                }
            }
        } else if (phone.getType().equals("Cellphone")) {
            //CELLPHONE
            print.selectManufacturer("Nokia or Alcatel");
            phone.setManufacturer(print.upFirstLetter(reader.readLine()));
            while (!(phone.getManufacturer().equals("Nokia") || (phone.getManufacturer().equals("Alcatel")))) {
                tryAgain();
            }
            if (phone.getManufacturer().equals("Nokia")) {
                //NOKIA
                print.selectYourModel();
                nokia.printNokiaModels();
                phone.setModel(print.upFirstLetter(reader.readLine()));

                while (!nokia.getNokiaModels().containsKey(phone.getModel())) {
                    tryAgain();
                }
                if (phone.getModel().equals("Nokia 3310")) {
                    nokia.printNokia3310Specs();
                    nokiaSteps("Dark Blue", 0, 99999999);
                    nokia.setNokia3310quantity(nokia.getNokia3310quantity()-1);

                } else if (phone.getModel().equals("Nokia 7990")) {
                    nokia.printNokia7990Specs();
                    nokiaSteps("Black", 1, 109);
                    nokia.setNokia7990quantity(nokia.getNokia7990quantity()-1);

                }

            } else if (phone.getManufacturer().equals("Alcatel")) {
                //ALCATEL
                print.selectYourModel();
                alcatel.printAlcatelModels();
                phone.setModel(print.upFirstLetter(reader.readLine()));
                while (!alcatel.getAlcatelModels().containsKey(phone.getModel())) {
                    tryAgain();
                }
                if (phone.getModel().equals("Alcatel A204")) {
                    alcatel.printAlcatelA204Specs();
                    alcatelSteps("Black", 0, 39);
                    alcatel.setAlcatelA204quantity(alcatel.getAlcatelA204quantity()-1);
                } else if (phone.getModel().equals("Alcatel A101")) {
                    alcatel.printAlcatelA101Specs();
                    alcatelSteps("Grey", 1, 119);
                    alcatel.setAlcatelA101quantity(alcatel.getAlcatelA101quantity()-1);

                }
            }
        }
        print.comeAgain(phone.getModel(),phone.getColor());
    }


    //Some Methods

    void tryAgain() throws IOException {
        print.wrongInput();
        cartFill();
    }

    //Steps shopCart

    //Alcatel
    void alcatelSteps(String s, int i, int i2) {
        phone.setColor(s);
        phone.setCapacity(i);
        print.thankYouForYourOrder(phone.getType(),phone.getModel(),phone.getColor(),phone.getManufacturer());
        phone.setPrice(i2);
        print.printPrice(phone.getPrice());
    }
    //Nokia
    void nokiaSteps(String s, int i, int i2) {
        phone.setColor(s);
        phone.setCapacity(i);
        phone.setPrice(i2);
        print.thankYouForYourOrder(phone.getType(),phone.getModel(),phone.getColor(),phone.getManufacturer());
        print.printPrice(phone.getPrice());
    }
    //Samsung
    void samsungSteps(int i, int i2) throws IOException {
        print.selectColor();
        samsung.printSamsungColors();
        phone.setColor(print.upFirstLetter(reader.readLine()));
        print.selectCapacity();
        samsung.printSamsungCapacityOptions();
        phone.setCapacity(Integer.parseInt(reader.readLine()));
        print.thankYouForYourOrder(phone.getType(),phone.getModel(),phone.getColor(),phone.getManufacturer());
        switch (phone.getCapacity()) {
            case 64:
                phone.setPrice(i);
                print.printPrice(phone.getPrice());
                break;
            case 128:
                phone.setPrice(i2);
                print.printPrice(phone.getPrice());
                break;
        }
    }
    //Huawei
    void huaweiSteps(int i, int i2, int i3) throws IOException {
        print.selectColor();
        huawei.printHuaweiColors();
        phone.setColor(print.upFirstLetter(reader.readLine()));
        print.selectCapacity();
        huawei.printHuaweiCapacityOptions();
        phone.setCapacity(Integer.parseInt(reader.readLine()));
        print.thankYouForYourOrder(phone.getType(),phone.getModel(),phone.getColor(),phone.getManufacturer());

        switch (phone.getCapacity()) {
            case 64:
                phone.setPrice(i);
                print.printPrice(phone.getPrice());
                break;
            case 128:
                phone.setPrice(i2);
                print.printPrice(phone.getPrice());
                break;
            case 256:
                phone.setPrice(i3);
                print.printPrice(phone.getPrice());
                break;
        }
    }
    //Iphone

    void iPhoneSteps(int i, int i2, int i3, int i4) throws IOException {
        print.selectColor();
        iphone.printIphoneColors();
        phone.setColor(print.upFirstLetter(reader.readLine()));
        print.selectCapacity();
        iphone.printIphoneCapacityOptions();
        phone.setCapacity(Integer.parseInt(reader.readLine()));
        print.thankYouForYourOrder(phone.getType(),phone.getModel(),phone.getColor(),phone.getManufacturer());
        switch (phone.getCapacity()) {
            case 64:
                phone.setPrice(i);
                print.printPrice(phone.getPrice());
                break;
            case 128:
                phone.setPrice(i2);
                print.printPrice(phone.getPrice());
                break;
            case 256:
                phone.setPrice(i3);
                print.printPrice(phone.getPrice());
                break;
            case 512:
                phone.setPrice(i4);
                print.printPrice(phone.getPrice());
                break;
        }
    }

}