
public class Prints {

    Phone phone = new Phone();

    //Welcoming messages
    void welcomeMessage(){
        System.out.print("Hello, dear costumer!\nWelcome to MobileWorld.\nWe'll be extremely happy to help you" +
                " in choosing your new phone!\n");
    }
    //Thanks messages


    void thankYouForYourOrder(String a,String s, String m, String p){
        System.out.printf("Thank you for your order!%nYou've just bought a new %s - %s (%s), made by %s.%n",
                a.toLowerCase(),s,m,p);
    }


    void comeAgain(String s, String d){
        separator();
        System.out.printf("Congratulations!%nYour new %s (%s) is shipped!%nThank you for shopping from MobileService.%n" +
                "We'll be happy to see you again!", s,d);
    }

    //Price
    void printPrice(int price){
        System.out.printf("Your bill is $%d.%n", price);
    }

    //Errors
    void wrongInput() {
        System.out.println("Wrong input.\nTry again!");
    }

    //Announce
    void selectYourPhoneType() {
        System.out.println("Please, type your product type (Smartphone or Cellphone):");
    }

    void selectYourOS() {
        System.out.println("Please, type an operating system (Android or iOS):");
    }

    void selectYourModel() {
        System.out.println("Please, type one of the models below:");
    }

    void selectColor() {
        System.out.println("Please, type your color:");
    }
    void selectCapacity(){ System.out.println("Please, type your preferred storage:");
    }

    void selectManufacturer(String s) {
        System.out.printf("Please, type a manufacturer (%s):%n", s);
    }

    //Fixers and Helpers
    String upFirstLetter(String s){
        String[] word = s.split(" ");
        StringBuilder returned = new StringBuilder();

        for (int i = 0;i<word.length;i++) {
            if (word.length==1){
                returned.append(word[i].toUpperCase().charAt(0)).append(word[i].substring(1, word[i].length()).toLowerCase());
                return returned.toString().trim();
            }
            returned.append(word[i].toUpperCase().charAt(0)).append(word[i].substring(1, word[i].length()).toLowerCase()).append(" ");
        }
        return returned.toString().trim();
    }
    void separator() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
    }

}