package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Calculator2Test {

    @Before
    public void setUp()throws Exception{}
    Calculator2 string =  new Calculator2();
    

    @Test
    public void test������łP�v���X�Q����͂���Ɣz��łP�v���X�Q���Ԃ��Ă���(){
        char[] fomula = string.fomula("1+2");
        assertEquals('1', fomula[0]);
        assertEquals('+', fomula[1]);
        assertEquals('2', fomula[2]);
    }
    
    @Test(expected = RuntimeException.class)
    public void test�����≉�Z�q�ȊO�̕��������͂��ꂽ��exception��Ԃ�(){
       string.fomula("��");
       string.check();
    }
    
    @Test
    public void test�����ʂ�n���Ă���O�ɂȂ�Ȃ�(){
        string.fomula("(1+2)");
        string.check();
    }
    @Test
    public void test�P�Q�v���X�R�P����͂���ƂP�Q�v���X�R�P�̏��ŕԂ��Ă���(){
        string.fomula("12+31");
        char[] fomula2 = string.figureCheck();
        assertEquals(12, fomula2[0]);
        assertEquals('+', fomula2[1]);
        assertEquals(31, fomula2[2]);
    }

//    @Test
//    public void test�P�v���X�Q����͂���ƂP�Q�v���X�̏��ŕԂ��Ă���(){
//        char[] fomula = string.fomula("1+2");
//        char[] fomula2 = string.sort(fomula);
//        assertEquals('1', fomula2[0]);
//        assertEquals('2', fomula2[1]);
//        assertEquals('+', fomula2[2]);
//        
//    }
  
}
