
import static org.junit.Assert.*;
import jp.leve_five.careerup.sample.InArabicNumber;

import org.junit.Test;


public class InputOutputTest {

    @Test
    public void test�R����͂����III���o�͂����(){
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
       assertEquals("III", output);
    }
    
    @Test
    public void test4����͂����IV���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(4);
        assertEquals("IV", roman);
    }

    @Test
    public void test4000����͂���Ƌ󂪕Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(4000);
        assertEquals("", roman);
    }
    
    @Test
    public void test900����͂����CM���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(900);
        assertEquals("CM", roman);
    }

    @Test
    public void test3999����͂����MMMCMXCIX���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(3999);
        assertEquals("MMMCMXCIX", roman);
    }

    
    @Test
    public void testXVI����͂����16���o�͂����(){
        InputOutput inputoutput = new InputOutput();
        int arabic = inputoutput.convert("XVI");
        assertEquals(16, arabic);
    }
    
    
    
}
