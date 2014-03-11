
package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class InArabicNumberTest {


    @Test
    public void test1����͂����I���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(1);
        assertEquals("I", roman);
    }
    @Test
    public void test2����͂����II���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(2);
        assertEquals("II", roman);
    }
    @Test
    public void test3����͂����III���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(3);
        assertEquals("III", roman);
    }
    @Test
    public void test4����͂����IV���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(4);
        assertEquals("IV", roman);
    }
    @Test
    public void test8����͂����VIII���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(8);
        assertEquals("VIII", roman);
    }
    @Test
    public void test9����͂����IX���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(9);
        assertEquals("IX", roman);
    }
    @Test
    public void test10����͂����X���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(10);
        assertEquals("X", roman);
    }
    @Test
    public void test15����͂����XV���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(15);
        assertEquals("XV", roman);
    }
    @Test
    public void test490����͂����iii���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(490);
        assertEquals("CDXC", roman);
    }
    @Test
    public void test3999����͂����MMMCMXCIX���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(3999);
        assertEquals("MMMCMXCIX", roman);
    }
    @Test
    public void test4000����͂���Ƌ󂪕Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(4000);
        assertEquals("", roman);
    }
    @Test
    public void test900����͂����CM���Ԃ��Ă���() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(900);
        assertEquals("CM", roman);
    }
    

}