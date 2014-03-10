package NewCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator newcalculator;
 
    @Before
    public void setUp(){
        newcalculator = new Calculator();
    }
    @Test
    public void test�����̂P����͂�����P���z��ɓ�������ԂŕԂ��Ă���(){
        String[] answer = newcalculator.listTransform("1");
        assertEquals(1, answer.length);
        assertEquals("1", answer[0]);
    }
    
    @Test
    public void test�Z�p�L���̕�����v���X����ꂽ�Ƃ��v���X�Ƃ���������̗v�f�������Ă���z�񂪕Ԃ��Ă���(){
        String[] answer = newcalculator.listTransform("+");
        assertEquals(1, answer.length);
        assertEquals("+", answer[0]);
    }
    @Test
    public void test������R�ƃX�y�[�X�ŋ󔒂���͂��Ă���L���}�C�i�X����ꂽ���R�ƃ}�C�i�X�̕�����v�f�������Ă���z�񂪕Ԃ��Ă���(){
        String[] answer = newcalculator.listTransform("3 -");
        assertEquals(2, answer.length);
        assertEquals("3", answer[0]);
        assertEquals("-", answer[1]);
    }
   @Test
   public void test3�^�u�L���}�C�i�X�L���R����͂����Ƃ��ł��R�}�C�i�X�L�����z��ɓ����ĕԂ��Ă���(){
       String[] answer = newcalculator.listTransform("3 -");
       assertEquals(2, answer.length);
       assertEquals("3", answer[0]);
       assertEquals("-", answer[1]);
   }
     @Test
     public void test�P�v���X�Q�̕��������͂������P�Q�v���X�̏��ɔz��ɓ����ĕԂ��Ă���(){
        String[] answer = newcalculator.listArrange(new String[]{"1", "+", "2"});
        assertEquals("1", answer[0]);
        assertEquals("2", answer[1]);
        assertEquals("+", answer[2]);
     }
     @Test
     public void test�P�O������Q�O�̕��������͂������P�O�Q�O������̏��ɔz��ɓ����ĕԂ��Ă���(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "*", "20"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("*", answer[2]);
     }
     @Test
     public void test�P�O������Q�O�v���X�R�O�̕��������͂����Ƃ��P�O�Q�O������R�O�v���X�����ɓ������z�񂪕Ԃ��Ă���(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "*", "20", "+", "30"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("*", answer[2]);
         assertEquals("30", answer[3]);
         assertEquals("+", answer[4]);
         }
     @Test 
     public void test�P�O�Ղ炷�Q�O������R�O�̕����������Ƃ��P�O�Q�O�R�O������Ղ炷�̏��ɓ������z�񂪕Ԃ��Ă���(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "+", "20", "*", "30"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("30", answer[2]);
         assertEquals("*", answer[3]);
         assertEquals("+", answer[4]);
     }
}
