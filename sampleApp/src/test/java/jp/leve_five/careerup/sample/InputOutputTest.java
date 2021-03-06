package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;
import jp.leve_five.careerup.sample.InArabicNumber;

import org.junit.Test;


public class InputOutputTest {

    @Test
    public void test３を入力するとIIIが出力される(){
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
       assertEquals("III", output);
    }
    
    @Test
    public void test4を入力するとIVが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(4);
        assertEquals("IV", roman);
    }

    @Test
    public void test4000を入力すると空が返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(4000);
        assertEquals("", roman);
    }
    
    @Test
    public void test900を入力するとCMが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(900);
        assertEquals("CM", roman);
    }

    @Test
    public void test3999を入力するとMMMCMXCIXが返ってくる() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inputOutput(3999);
        assertEquals("MMMCMXCIX", roman);
    }

    
    @Test
    public void testXVIを入力すると16が出力される(){
        InputOutput inputoutput = new InputOutput();
        int arabic = inputoutput.convert("XVI");
        assertEquals(16, arabic);
    }
    
    
    
}
