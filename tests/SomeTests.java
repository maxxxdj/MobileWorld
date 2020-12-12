import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintsTest {
    Prints print = new Prints();


    @Test
    void checkString() {
        String first = print.upFirstLetter("IPHONE");
        String second = print.upFirstLetter("huAweI");
        String third = print.upFirstLetter("smARTPHONe");
        String fourth = print.upFirstLetter("IOS");
        String fifth = print.upFirstLetter("noKIA");

        assertEquals(first, "Iphone");
        assertEquals(second, "Huawei");
        assertEquals(third, "Smartphone");
        assertEquals(fourth, "Ios");
        assertEquals(fifth, "Nokia");
    }

    @Test
    void checkLowerWord() {
        String first = print.upFirstLetter("iPHOnE");
        String second = print.upFirstLetter("cellphone");
        String third = print.upFirstLetter("AlcaTEL");
        String fourth = print.upFirstLetter("huaWEi");

        assertEquals(first, "iphone");
        assertEquals(second, "cellphone");
        assertEquals(third, "alcatel");
        assertEquals(fourth, "huawei");

    }

}