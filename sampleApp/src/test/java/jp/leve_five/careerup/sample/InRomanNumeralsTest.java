package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InRomanNumeralsTest {
 
    @Before
    
        
    
 
   @Test
    public void testi���R���͂���ƂR���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("iii");
        assertEquals(3, answer);
    }
    @Test
    public void testv��1���͂����5���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("v");
        assertEquals(5, answer);
    }
    @Test
    public void testx���R���͂����3�O���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("xxx");
        assertEquals(30, answer);
    }
    @Test
    public void testx���R��v���P��i���Q���͂����36���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("xXxVI");
        assertEquals(36, answer);
    }
    
    @Test
    public void testL��1���͂����50���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("L");
        assertEquals(50, answer);
    }
    @Test
    public void testc���R���͂���ƂR00���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("Ccc");
        assertEquals(300, answer);
    }
    @Test
    public void testD��1���͂����500���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("D");
        assertEquals(500, answer);
    }
    @Test
    public void testM��2���͂����2000���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("Mm");
        assertEquals(2000, answer);
    }
    @Test
    public void testm��2��d���P��c���Q���͂����2700���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("mMdCC");
        assertEquals(2700, answer);
    }
    
    @Test
    public void testc��1���͂����100���Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("c");
        assertEquals(100, answer);
    }
    @Test
    public void testmmmcmliv����͂���3954�Ƃ��Ԃ�() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("mmmcmliv");
        assertEquals(3954, answer);
    }
    @Test
    public void testi��4���͂���Ɛ��������[�}�����̋L�@�ł͂���܂���ƕ\�������() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        inRomanNumerals.inOut("iiii");
    }
    @Test
    public void testvm����͂���Ɛ��������[�}�����̋L�@�ł͂���܂���ƕ\�������() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        inRomanNumerals.inOut("vm");
    }

}
